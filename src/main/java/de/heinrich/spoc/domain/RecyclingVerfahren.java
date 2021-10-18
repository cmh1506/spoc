package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "recycling_verfahren", schema = "spoc")
public class RecyclingVerfahren implements Serializable {
    @Id
    @SequenceGenerator(
            name = "rercycling_verfahren_sequence",
            sequenceName = "rercycling_verfahren_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "rercycling_verfahren_sequence"
    )
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecyclingVerfahren() {
    }

    public RecyclingVerfahren(String name) {
        this.name = name;
    }

}
