package de.heinrich.spoc.dto;

import java.math.BigDecimal;

public class SummaryDTO {
    private BigDecimal materialCO2Aufwand;
    private BigDecimal cradleToGate;
    private BigDecimal cradleToGrave;
    private BigDecimal cradleToGraveCO2Gutschrift;
    private BigDecimal cradleToGraveCO2GutschriftBioFuel;
    private BigDecimal materialAufwandEnergie;
    private BigDecimal cradleToGateEnergie;
    private BigDecimal cradleToGraveEnergie;
    private BigDecimal cradleToGraveGutschriftEnergie;
    private BigDecimal cradleToGraveBioCo2Gutschrift;
    private BigDecimal gesamtIndirektCo2Biofuel;

    public BigDecimal getMaterialCO2Aufwand() {
        return materialCO2Aufwand;
    }

    public void setMaterialCO2Aufwand(BigDecimal materialCO2Aufwand) {
        this.materialCO2Aufwand = materialCO2Aufwand;
    }

    public BigDecimal getCradleToGate() {
        return cradleToGate;
    }

    public void setCradleToGate(BigDecimal cradleToGate) {
        this.cradleToGate = cradleToGate;
    }

    public BigDecimal getCradleToGrave() {
        return cradleToGrave;
    }

    public void setCradleToGrave(BigDecimal cradleToGrave) {
        this.cradleToGrave = cradleToGrave;
    }

    public BigDecimal getCradleToGraveCO2Gutschrift() {
        return cradleToGraveCO2Gutschrift;
    }

    public void setCradleToGraveCO2Gutschrift(BigDecimal cradleToGraveCO2Gutschrift) {
        this.cradleToGraveCO2Gutschrift = cradleToGraveCO2Gutschrift;
    }

    public BigDecimal getCradleToGraveCO2GutschriftBioFuel() {
        return cradleToGraveCO2GutschriftBioFuel;
    }

    public void setCradleToGraveCO2GutschriftBioFuel(BigDecimal cradleToGraveCO2GutschriftBioFuel) {
        this.cradleToGraveCO2GutschriftBioFuel = cradleToGraveCO2GutschriftBioFuel;
    }

    public BigDecimal getMaterialAufwandEnergie() {
        return materialAufwandEnergie;
    }

    public void setMaterialAufwandEnergie(BigDecimal materialAufwandEnergie) {
        this.materialAufwandEnergie = materialAufwandEnergie;
    }

    public BigDecimal getCradleToGateEnergie() {
        return cradleToGateEnergie;
    }

    public void setCradleToGateEnergie(BigDecimal cradleToGateEnergie) {
        this.cradleToGateEnergie = cradleToGateEnergie;
    }

    public BigDecimal getCradleToGraveEnergie() {
        return cradleToGraveEnergie;
    }

    public void setCradleToGraveEnergie(BigDecimal cradleToGraveEnergie) {
        this.cradleToGraveEnergie = cradleToGraveEnergie;
    }

    public BigDecimal getCradleToGraveGutschriftEnergie() {
        return cradleToGraveGutschriftEnergie;
    }

    public void setCradleToGraveGutschriftEnergie(BigDecimal cradleToGraveGutschriftEnergie) {
        this.cradleToGraveGutschriftEnergie = cradleToGraveGutschriftEnergie;
    }

    public BigDecimal getCradleToGraveBioCo2Gutschrift() {
        return cradleToGraveBioCo2Gutschrift;
    }

    public void setCradleToGraveBioCo2Gutschrift(BigDecimal cradleToGraveBioCo2Gutschrift) {
        this.cradleToGraveBioCo2Gutschrift = cradleToGraveBioCo2Gutschrift;
    }

    public BigDecimal getGesamtIndirektCo2Biofuel() {
        return gesamtIndirektCo2Biofuel;
    }

    public void setGesamtIndirektCo2Biofuel(BigDecimal gesamtIndirektCo2Biofuel) {
        this.gesamtIndirektCo2Biofuel = gesamtIndirektCo2Biofuel;
    }
}
