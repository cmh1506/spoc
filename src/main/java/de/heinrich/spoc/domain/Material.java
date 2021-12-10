package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "material", schema = "spoc")
public class Material implements Serializable {
    @Id
    @SequenceGenerator(
            name = "material_sequence",
            sequenceName = "material_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "material_sequence"
    )
    private Long id;
    private String a_name;
    private BigDecimal fossiles;
    private BigDecimal prozessenergie;
    private BigDecimal productionCO2;
    private BigDecimal bioco2prod;
    private BigDecimal bioFuelCO2;
    private BigDecimal dichte;
    private BigDecimal co2Verbrennung;
    private BigDecimal bioCO2Verbrennung;
    private BigDecimal heizenergie;
    private BigDecimal co2Recycling;

    public BigDecimal getCo2Recycling() {
        return co2Recycling;
    }

    public void setCo2Recycling(BigDecimal co2recycling) {
        this.co2Recycling = co2recycling;
    }

    public String getName() {
        return a_name;
    }

    public void setName(String name) {
        this.a_name = name;
    }

    public BigDecimal getFossiles() {
        return fossiles;
    }

    public void setFossiles(BigDecimal fossiles) {
        this.fossiles = fossiles;
    }

    public BigDecimal getProzessenergie() {
        return prozessenergie;
    }

    public void setProzessenergie(BigDecimal prozessenergie) {
        this.prozessenergie = prozessenergie;
    }

    public BigDecimal getProductionCO2() {
        return productionCO2;
    }

    public void setProductionCO2(BigDecimal productionCO2) {
        this.productionCO2 = productionCO2;
    }

    public BigDecimal getBioFuelCO2() {
        return bioFuelCO2;
    }

    public void setBioFuelCO2(BigDecimal bioFuel) {
        this.bioFuelCO2 = bioFuel;
    }

    public BigDecimal getDichte() {
        return dichte;
    }

    public void setDichte(BigDecimal dichte) {
        this.dichte = dichte;
    }

    public BigDecimal getCo2Verbrennung() {
        return co2Verbrennung;
    }

    public void setCo2Verbrennung(BigDecimal co2Verbrennung) {
        this.co2Verbrennung = co2Verbrennung;
    }

    public BigDecimal getBioCO2Verbrennung() {
        return bioCO2Verbrennung;
    }

    public void setBioCO2Verbrennung(BigDecimal bioCO2Verbrennung) {
        this.bioCO2Verbrennung = bioCO2Verbrennung;
    }

    public BigDecimal getHeizenergie() {
        return heizenergie;
    }

    public void setHeizenergie(BigDecimal heizenergie) {
        this.heizenergie = heizenergie;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public BigDecimal getBioco2prod() {
        return bioco2prod;
    }

    public void setBioco2prod(BigDecimal bioco2prod) {
        this.bioco2prod = bioco2prod;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Material() {
    }


}
