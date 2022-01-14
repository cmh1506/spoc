package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "verarbeitung", schema = "spoc")
public class Verarbeitung {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private double strom;
    private double waerme;

    public double getWaerme() {
        return waerme;
    }

    public void setWaerme(double waerme) {
        this.waerme = waerme;
    }

    public double getStrom() {
        return strom;
    }

    public void setStrom(double energie) {
        this.strom = energie;
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
