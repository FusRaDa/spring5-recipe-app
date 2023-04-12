package guru.springframework.domain;

import javax.persistence.*;

/**
 * Created by FusRada on April 12, 2023
 */
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne()
    private Recipe recipe;
    @Lob
    private String recipeNotes;
}
