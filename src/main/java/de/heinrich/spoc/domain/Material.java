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
    private double fossiles;
    private double prozessenergie;
    private double productionCO2;
    private double bioco2prod;
    private double bioFuelCO2;
    private double dichte;
    private double co2Verbrennung;
    private double bioCO2Verbrennung;
    private double heizenergie;
    private double co2Recycling;
    private double energieRecycling;

    public double getEnergieRecycling() {
        return energieRecycling;
    }

    public void setEnergieRecycling(double energieRecycling) {
        this.energieRecycling = energieRecycling;
    }

    public double getCo2Recycling() {
        return co2Recycling;
    }

    public void setCo2Recycling(double co2recycling) {
        this.co2Recycling = co2recycling;
    }

    public String getName() {
        return a_name;
    }

    public void setName(String name) {
        this.a_name = name;
    }

    public double getFossiles() {
        return fossiles;
    }

    public void setFossiles(double fossiles) {
        this.fossiles = fossiles;
    }

    public double getProzessenergie() {
        return prozessenergie;
    }

    public void setProzessenergie(double prozessenergie) {
        this.prozessenergie = prozessenergie;
    }

    public double getProductionCO2() {
        return productionCO2;
    }

    public void setProductionCO2(double productionCO2) {
        this.productionCO2 = productionCO2;
    }

    public double getBioFuelCO2() {
        return bioFuelCO2;
    }

    public void setBioFuelCO2(double bioFuel) {
        this.bioFuelCO2 = bioFuel;
    }

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
    }

    public double getCo2Verbrennung() {
        return co2Verbrennung;
    }

    public void setCo2Verbrennung(double co2Verbrennung) {
        this.co2Verbrennung = co2Verbrennung;
    }

    public double getBioCO2Verbrennung() {
        return bioCO2Verbrennung;
    }

    public void setBioCO2Verbrennung(double bioCO2Verbrennung) {
        this.bioCO2Verbrennung = bioCO2Verbrennung;
    }

    public double getHeizenergie() {
        return heizenergie;
    }

    public void setHeizenergie(double heizenergie) {
        this.heizenergie = heizenergie;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public double getBioco2prod() {
        return bioco2prod;
    }

    public void setBioco2prod(double bioco2prod) {
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
