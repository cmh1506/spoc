package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "energierueckgewinnung", schema = "spoc")
public class Energierueckgewinnung {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private double recoveryRate;
    private double stromanteil;
    private double thermischerAnteil;

    public Energierueckgewinnung(String name, double recoveryRate, double stromanteil, double thermischerAnteil) {
        this.name = name;
        this.recoveryRate = recoveryRate;
        this.stromanteil = stromanteil;
        this.thermischerAnteil = thermischerAnteil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String a_name) {
        this.name = a_name;
    }

    public double getRecoveryRate() {
        return recoveryRate;
    }

    public void setRecoveryRate(double recoveryRate) {
        this.recoveryRate = recoveryRate;
    }

    public double getStromanteil() {
        return stromanteil;
    }

    public void setStromanteil(double stromanteil) {
        this.stromanteil = stromanteil;
    }

    public double getThermischerAnteil() {
        return thermischerAnteil;
    }

    public void setThermischerAnteil(double thermischerAnteil) {
        this.thermischerAnteil = thermischerAnteil;
    }

    public Energierueckgewinnung() {

    }
}
