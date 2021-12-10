package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "energierueckgewinnung", schema = "spoc")
public class Energierueckgewinnung {
    @Id
    @SequenceGenerator(
            name = "energierueckgewinnung_sequence",
            sequenceName = "energierueckgewinnung_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "energierueckgewinnung_sequence"
    )
    private Long id;
    private String name;
    private BigDecimal recoveryRate;
    private BigDecimal stromanteil;
    private BigDecimal thermischerAnteil;

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

    public BigDecimal getRecoveryRate() {
        return recoveryRate;
    }

    public void setRecoveryRate(BigDecimal recoveryRate) {
        this.recoveryRate = recoveryRate;
    }

    public BigDecimal getStromanteil() {
        return stromanteil;
    }

    public void setStromanteil(BigDecimal stromanteil) {
        this.stromanteil = stromanteil;
    }

    public BigDecimal getThermischerAnteil() {
        return thermischerAnteil;
    }

    public void setThermischerAnteil(BigDecimal thermischerAnteil) {
        this.thermischerAnteil = thermischerAnteil;
    }

    public Energierueckgewinnung() {

    }
}
