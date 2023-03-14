package br.ada.americanas.moviebattle.battle;

import br.ada.americanas.moviebattle.movie.Movie;
import br.ada.americanas.moviebattle.player.Player;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Battle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToOne
    @NotNull
    private Player player;
    @ManyToOne
    @NotNull
    private Movie left;
    @ManyToOne
    @NotNull
    private Movie right;
    @ManyToOne
    private Movie selected;
    private Boolean hit;

}
