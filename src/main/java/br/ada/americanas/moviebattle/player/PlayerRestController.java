package br.ada.americanas.moviebattle.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/players")
public class PlayerRestController {

    private PlayerService playerService;

    @Autowired
    public PlayerRestController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping(

            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Player create(@RequestBody Player player){
        return playerService.add(player);
    }

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Player update(
            @PathVariable("id") Long id,
            @RequestBody Player player
    ){
        player.setId(id);
        return playerService.update(player);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Player> playerList(){
        return playerService.playerList();
    }

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Player get(@PathVariable("id") Long id){
        return playerService.findById(id).get();
    }

    @DeleteMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Player delete(@PathVariable("id") Long id){
        return playerService.delete(id).get();
    }












}
