package br.ada.americanas.moviebattle.player;

import br.ada.americanas.moviebattle.config.ConstraintViolationToErrorsConverter;
import br.ada.americanas.moviebattle.movie.Movie;
import jakarta.validation.ConstraintViolationException;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping("/app/players")
public class PlayerAppController {

    private PlayerService playerService;

    private ConstraintViolationToErrorsConverter exceptionConverter;

    @Autowired
    public PlayerAppController(PlayerService playerService,
                               ConstraintViolationToErrorsConverter exceptionConverter) {
        this.playerService = playerService;
        this.exceptionConverter = exceptionConverter;
    }

    @GetMapping
    public String get(Model model) {
        model.addAttribute("players", playerService.playerList());
        return "player/list";
    }

    @GetMapping("/create")
    public String create (Model model){

        List<Player> players = playerService.playerList();
        List<Player> sortedPlayers = StreamSupport.stream(players.spliterator(), false)
                .sorted(Comparator.comparingDouble(Player::getScore).reversed())
                .collect(Collectors.toList());
        model.addAttribute("player", sortedPlayers);
        return "player/form";
    }

    @GetMapping("/edit/{id}")
    public String edit(
            @PathVariable("id") Long id,
            Model model
    ){
        Player player = playerService.findById(id).get();
        model.addAttribute("player", player);
        return "player/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(
            @PathVariable("id") Long id,
            Model model
    ) {
        playerService.delete(id);
        return "redirect:/app/players";
    }

    @PostMapping
    public String save(
            @ModelAttribute Player player,
            BindingResult result
    ) {
        try {
            playerService.add(player);
        } catch(ConstraintViolationException ex) {
            exceptionConverter.convert(ex.getConstraintViolations(), result);
            return "player/form";
        }
        return "redirect:/app/players";
    }


}
