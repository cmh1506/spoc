package de.heinrich.spoc.util;

import de.heinrich.spoc.domain.Materialverwendung;
import de.heinrich.spoc.domain.Recyclingverfahren;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class Spoc {

    public BigDecimal berechneFossileMasse(Materialverwendung materialDomain, SpocUtil spuk) {
        materialDomain.getMaterial().getProductionCO2();
        return BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneMaterialCO2Eq(Materialverwendung materialverwendungDomain, SpocUtil spuk) {
        double co2ProdP = materialverwendungDomain.getMenge().doubleValue() * spuk.getVirginanteil() * materialverwendungDomain.getMaterial().getProductionCO2().doubleValue();
        double co2RecyP = materialverwendungDomain.getMenge().doubleValue() * spuk.getVermehrung() * materialverwendungDomain.getMaterial().getCo2Recycling().doubleValue();
        double toReturn = co2RecyP + co2ProdP;
        return BigDecimal.valueOf(toReturn).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneMaterialEnergie(Materialverwendung materialDomain) {
        return BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneEnergieAufwandVerarbeitung(Materialverwendung materialDomain) {

        return BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneVerbrennungENutzCo2Eq(Materialverwendung materialDomain) {
        return BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneVerbrennungENutzEnergie(Materialverwendung materialDomain) {
        return BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneGutschriftVerbrennungCo2Eq(Materialverwendung materialDomain) {
        return BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneGutschriftBioCo2Eq(Materialverwendung materialDomain) {
        return BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneTransportCo2Eq(Materialverwendung materialDomain) {
        return BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneTransportEnergie(Materialverwendung materialDomain) {
        return BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.CEILING);
    }

    public void berechneCO2Werte(Materialverwendung materialverwendungDomain, de.heinrich.spoc.dto.Materialverwendung materialverwendungDTO) {
        SpocUtil spuk = new SpocUtil(materialverwendungDomain.getRecyclingVerfahren(), materialverwendungDomain.getRecyclingQuote());
        materialverwendungDTO.setFossileMasse(this.berechneFossileMasse(materialverwendungDomain, spuk));
        materialverwendungDTO.setMaterialCO2Eq(this.berechneMaterialCO2Eq(materialverwendungDomain, spuk));
        materialverwendungDTO.setMaterialEnergie(this.berechneMaterialEnergie(materialverwendungDomain));
        materialverwendungDTO.setEnergieAufwandVerarbeitung(this.berechneEnergieAufwandVerarbeitung(materialverwendungDomain));
        materialverwendungDTO.setVerbrennungENutzCo2Eq(this.berechneVerbrennungENutzCo2Eq(materialverwendungDomain));
        materialverwendungDTO.setVerbrennungENutzEnergie(this.berechneVerbrennungENutzEnergie(materialverwendungDomain));
        materialverwendungDTO.setGutschriftVerbrennungCo2Eq(this.berechneGutschriftVerbrennungCo2Eq(materialverwendungDomain));
        materialverwendungDTO.setGutschriftBioCo2Eq(this.berechneGutschriftBioCo2Eq(materialverwendungDomain));
        materialverwendungDTO.setTransportCo2Eq(this.berechneTransportCo2Eq(materialverwendungDomain));
        materialverwendungDTO.setTransportEnergie(this.berechneTransportEnergie(materialverwendungDomain));
    }
}
class SpocUtil {
    private double virginanteil;
    private double vermehrung;

    public double getVermehrung() {
        return vermehrung;
    }

    public double getVirginanteil() {
        return virginanteil;
    }

    public SpocUtil(Recyclingverfahren recyclingVerfahren, BigDecimal recyclingQuote) {
        this.virginanteil = berechneVirginAnteil(recyclingVerfahren.getName(), recyclingQuote.doubleValue());
    }

    private double berechneVirginAnteil(String recyclingVerfahren, double recyclingQuote) {
        double vermehrung;
        if ("Closed Loop".equals(recyclingVerfahren)){
            this.vermehrung = (1 / (1 - (recyclingQuote / 100))) - 1;
        } else {
            this.vermehrung = recyclingQuote / 100;
        }

        return 1 / (1 + this.vermehrung);
    }
}