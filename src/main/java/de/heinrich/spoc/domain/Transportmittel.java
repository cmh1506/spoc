package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "transportmittel", schema = "spoc")
public class Transportmittel {
    @Id
    @SequenceGenerator(
            name = "transportmittel_sequence",
            sequenceName = "transportmittel_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "transportmittel_sequence"
    )
    private Long id;
    private String name;
    private BigDecimal co2;
    private BigDecimal energie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCo2() {
        return co2;
    }

    public void setCo2(BigDecimal co2) {
        this.co2 = co2;
    }

    public BigDecimal getEnergie() {
        return energie;
    }

    public void setEnergie(BigDecimal energie) {
        this.energie = energie;
    }

    public Transportmittel() {
    }
}
