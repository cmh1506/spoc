package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "nutzenergieCO2Equivalent", schema = "spoc")
public class NutzenergieCO2Equivalent {
    @Id
    @SequenceGenerator(
            name = "nutzenergieCO2Equivalent_sequence",
            sequenceName = "nutzenergieCO2Equivalent_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "nutzenergieCO2Equivalent_sequence"
    )
    private Long id;
    private String energietraeger;
    private BigDecimal co2ProKWh;
    private BigDecimal co2ProKJ;

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

    public BigDecimal getCo2ProKWh() {
        return co2ProKWh;
    }

    public void setCo2ProKWh(BigDecimal co2ProKWh) {
        this.co2ProKWh = co2ProKWh;
    }

    public BigDecimal getCo2ProKJ() {
        return co2ProKJ;
    }

    public void setCo2ProKJ(BigDecimal co2ProKJ) {
        this.co2ProKJ = co2ProKJ;
    }
}
