package de.heinrich.spoc.util;

import de.heinrich.spoc.domain.Materialverwendung;
import de.heinrich.spoc.domain.NutzenergieCO2Equivalent;
import de.heinrich.spoc.domain.Recyclingverfahren;
import de.heinrich.spoc.service.NutzenergieCO2EquivalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Service
public class Spoc {

    private final NutzenergieCO2EquivalentService nutzenergieCO2EquivalentService;
    @Autowired
    public Spoc(NutzenergieCO2EquivalentService nutzenergieCO2EquivalentService) {
        this.nutzenergieCO2EquivalentService = nutzenergieCO2EquivalentService;
    }

    public BigDecimal berechneFossileMasse(Materialverwendung materialDomain, SpocUtil spuk) {
        materialDomain.getMaterial().getProductionCO2();
        return BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneMaterialCO2Eq(Materialverwendung materialverwendungDomain, SpocUtil spuk) {
        double co2ProdP = materialverwendungDomain.getMenge() * spuk.getVirginanteil() * materialverwendungDomain.getMaterial().getProductionCO2();
        double co2RecyP = (materialverwendungDomain.getMenge() * spuk.getVermehrung() * materialverwendungDomain.getMaterial().getCo2Recycling()) / (1 + spuk.getVermehrung()) ;
        double toReturn = co2RecyP + co2ProdP;
        return BigDecimal.valueOf(toReturn).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneMaterialEnergieEq(Materialverwendung materialverwendungDomain, SpocUtil spuk) {
        double co2ProdP = materialverwendungDomain.getMenge() * spuk.getVirginanteil() * materialverwendungDomain.getMaterial().getProzessenergie();
        double co2RecyP = (materialverwendungDomain.getMenge() * spuk.getVermehrung() * materialverwendungDomain.getMaterial().getEnergieRecycling()) / (1 + spuk.getVermehrung());
        double toReturn = co2RecyP + co2ProdP;

        return BigDecimal.valueOf(toReturn).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneEnergieAufwandVerarbeitung(Materialverwendung materialverwendungDomain) {
        List<NutzenergieCO2Equivalent> ewerte = nutzenergieCO2EquivalentService.findALL();
        double fakCO2Strom = ewerte.stream().filter(x -> x.getEnergietraeger().equals("CO2 Stromnetz")).findFirst().get().getCo2ProKJ();
        double fakCO2Waerme = ewerte.stream().filter(x -> x.getEnergietraeger().equals("CO2 Gaswärme")).findFirst().get().getCo2ProKJ();
        double toReturn = materialverwendungDomain.getMenge() *
                (materialverwendungDomain.getVerarbeitung().getStrom() * fakCO2Strom +
                materialverwendungDomain.getVerarbeitung().getWaerme() * fakCO2Waerme);
        return BigDecimal.valueOf(toReturn).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneVerbrennungENutzCo2Eq(Materialverwendung materialverwendungDomain, SpocUtil spuk) {
        //hier null wenn Deponierung (Spalte einfügen in Energierückgewinnung.)
        double toReturn =
            materialverwendungDomain.getMenge() * materialverwendungDomain.getMaterial().getCo2Verbrennung() * spuk.getVirginanteil();
        return BigDecimal.valueOf(toReturn).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneVerbrennungENutzEnergie(Materialverwendung materialverwendungDomain, SpocUtil spuk) {
        double energieAusVerbrennung = materialverwendungDomain.getMenge() * materialverwendungDomain.getMaterial().getHeizenergie() * materialverwendungDomain.getEnergierueckgewinnung().getRecoveryRate() / 100
            * spuk.getVirginanteil();
        return BigDecimal.valueOf(energieAusVerbrennung).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneGutschriftVerbrennungCo2Eq(Materialverwendung materialverwendungDomain, SpocUtil spuk) {
        List<NutzenergieCO2Equivalent> ewerte = nutzenergieCO2EquivalentService.findALL();
        double energieAusVerbrennung = materialverwendungDomain.getMenge() * materialverwendungDomain.getMaterial().getHeizenergie() * spuk.getVirginanteil();
        double stromgutschrift = energieAusVerbrennung * materialverwendungDomain.getEnergierueckgewinnung().getRecoveryRate() * materialverwendungDomain.getEnergierueckgewinnung().getStromanteil() / 100;
        double waermegutschrift = energieAusVerbrennung * materialverwendungDomain.getEnergierueckgewinnung().getRecoveryRate() * materialverwendungDomain.getEnergierueckgewinnung().getThermischerAnteil() / 100;
        double co2gutschriftstrom = stromgutschrift * ewerte.stream().filter(x -> x.getEnergietraeger().equals("CO2 Stromnetz")).findFirst().get().getCo2ProKJ();
        double co2gutschriftwaerme = waermegutschrift * ewerte.stream().filter(x -> x.getEnergietraeger().equals("CO2 Gaswärme")).findFirst().get().getCo2ProKJ();
        return BigDecimal.valueOf(co2gutschriftstrom + co2gutschriftwaerme).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneGutschriftBioCo2Eq(Materialverwendung materialverwendungDomain, SpocUtil spuk) {
        double toReturn = materialverwendungDomain.getMenge() * (materialverwendungDomain.getMaterial().getBioco2prod() + materialverwendungDomain.getMaterial().getBioCO2Verbrennung())* spuk.getVirginanteil() ;
        return BigDecimal.valueOf(toReturn).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneTransportCo2Eq(Materialverwendung materialverwendungDomain) {
        return  BigDecimal.valueOf(materialverwendungDomain.getMenge() * materialverwendungDomain.getTransportStrecke() * materialverwendungDomain.getTransportmittel().getCo2()).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal berechneTransportEnergie(Materialverwendung materialverwendungDomain) {
        return  BigDecimal.valueOf(materialverwendungDomain.getMenge() * materialverwendungDomain.getTransportStrecke() * materialverwendungDomain.getTransportmittel().getEnergie()).setScale(2, RoundingMode.CEILING);
    }

    public void berechneCO2Werte(Materialverwendung materialverwendungDomain, de.heinrich.spoc.dto.Materialverwendung materialverwendungDTO) {
        SpocUtil spuk = new SpocUtil(materialverwendungDomain.getRecyclingVerfahren(), materialverwendungDomain.getRecyclingQuote());
        materialverwendungDTO.setFossileMasse(this.berechneFossileMasse(materialverwendungDomain, spuk));
        materialverwendungDTO.setMaterialCO2Eq(this.berechneMaterialCO2Eq(materialverwendungDomain, spuk));
        materialverwendungDTO.setMaterialEnergie(this.berechneMaterialEnergieEq(materialverwendungDomain, spuk));
        materialverwendungDTO.setEnergieAufwandVerarbeitung(this.berechneEnergieAufwandVerarbeitung(materialverwendungDomain));
        materialverwendungDTO.setVerbrennungENutzCo2Eq(this.berechneVerbrennungENutzCo2Eq(materialverwendungDomain, spuk));
        materialverwendungDTO.setVerbrennungENutzEnergie(this.berechneVerbrennungENutzEnergie(materialverwendungDomain, spuk));
        materialverwendungDTO.setGutschriftVerbrennungCo2Eq(this.berechneGutschriftVerbrennungCo2Eq(materialverwendungDomain, spuk));
        materialverwendungDTO.setGutschriftBioCo2Eq(this.berechneGutschriftBioCo2Eq(materialverwendungDomain, spuk));
        materialverwendungDTO.setTransportCo2Eq(this.berechneTransportCo2Eq(materialverwendungDomain));
        materialverwendungDTO.setTransportEnergie(this.berechneTransportEnergie(materialverwendungDomain));
    }

    public BigDecimal berechneBioFuelCo2(){
        return null;
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

    public SpocUtil(Recyclingverfahren recyclingVerfahren, double recyclingQuote) {
        this.virginanteil = berechneVirginAnteil(recyclingVerfahren.getMethode(), recyclingQuote);
    }

    private double berechneVirginAnteil(String recyclingVerfahren, double recyclingQuote) {
        double vermehrung;
        if ("Closed Loop".equals(recyclingVerfahren)){
            this.vermehrung = (1 / (1 - (recyclingQuote / 100))) - 1;
        } else {
            //if(())
            this.vermehrung = recyclingQuote / 100;
        }

        return 1 / (1 + this.vermehrung);
    }
}