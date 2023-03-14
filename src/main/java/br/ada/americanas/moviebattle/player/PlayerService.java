package br.ada.americanas.moviebattle.player;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Validated
@Configuration
public class PlayerService {


    private PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player add(@Valid Player player){
        return playerRepository.save(player);
    }

    public Player update(@Valid Player player){
        return playerRepository.save(player);
    }

    public List<Player> playerList(){
         return playerRepository.findAll();
    }

    public Optional<Player> findById(Long id){
        return playerRepository.findById(id);
    }

    public Optional<Player> delete(Long id){
        Optional<Player> delete = findById(id);
        playerRepository.deleteById(id);
        return delete;
    }
}
