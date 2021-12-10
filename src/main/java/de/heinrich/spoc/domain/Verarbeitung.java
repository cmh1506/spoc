package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "verarbeitung", schema = "spoc")
public class Verarbeitung {
    @Id
    @SequenceGenerator(
            name = "verarbeitung_sequence",
            sequenceName = "verarbeitung_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "verarbeitung_sequence"
    )
    private Long id;
    private String name;
    private BigDecimal energie;

    public BigDecimal getEnergie() {
        return energie;
    }

    public void setEnergie(BigDecimal energie) {
        this.energie = energie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Verarbeitung() {
    }

    public Verarbeitung(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
