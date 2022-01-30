package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "nutzenergieCO2Equivalent", schema = "spoc")
public class NutzenergieCO2Equivalent {
    public NutzenergieCO2Equivalent() {
    }

    public NutzenergieCO2Equivalent(String energietraeger, double co2ProKWh, double co2ProKJ) {
        this.energietraeger = energietraeger;
        this.co2ProKWh = co2ProKWh;
        this.co2ProKJ = co2ProKJ;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String energietraeger;
    private double co2ProKWh;
    private double co2ProKJ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnergietraeger() {
        return energietraeger;
    }

    public void setEnergietraeger(String energieträger) {
        this.energietraeger = energieträger;
    }

    public double getCo2ProKWh() {
        return co2ProKWh;
    }

    public void setCo2ProKWh(double co2ProKWh) {
        this.co2ProKWh = co2ProKWh;
    }

    public double getCo2ProKJ() {
        return co2ProKJ;
    }

    public void setCo2ProKJ(double co2ProKJ) {
        this.co2ProKJ = co2ProKJ;
    }
}
