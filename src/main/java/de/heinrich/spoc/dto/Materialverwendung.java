package de.heinrich.spoc.dto;

import java.math.BigDecimal;

public class Materialverwendung {
    public Materialverwendung() {
    }

    private Long id;
    private String material;
    private Long materialId;
    private String verarbeitung;
    private Long verarbeitungId;
    private String recyclingverfahren;
    private Long recyclingverfahrenId;
    private Long energierueckgewinnungId;
    private String energierueckgewinnung;
    private Long transportmittelId;
    private String transportmittel;
    private double recyclingQuote;
    private double menge;
    private double flaeche;
    private double dicke;
    private double transportstrecke;
    private BigDecimal fossileMasse;
    private BigDecimal materialCO2Eq;
    private BigDecimal materialEnergie;
    private BigDecimal energieAufwandVerarbeitung;
    private BigDecimal co2AufwandVerarbeitung;
    private BigDecimal verbrennungCo2Eq;
    private BigDecimal verbrennungENutzEnergie;
    private BigDecimal gutschriftVerbrennungCo2Eq;
    private BigDecimal indirectco2Biofuel;
    private BigDecimal transportCo2Eq;
    private BigDecimal transportEnergie;
    private BigDecimal verbrennungBioCo2Eq;
    private BigDecimal herstellungBioCo2Eq;


    public BigDecimal getHerstellungBioCo2Eq() {
        return herstellungBioCo2Eq;
    }

    public void setHerstellungBioCo2Eq(BigDecimal herstellungBioCo2Eq) {
        this.herstellungBioCo2Eq = herstellungBioCo2Eq;
    }



    public BigDecimal getVerbrennungBioCo2Eq() {
        return verbrennungBioCo2Eq;
    }

    public void setVerbrennungBioCo2Eq(BigDecimal verbrennungBioCo2Eq) {
        this.verbrennungBioCo2Eq = verbrennungBioCo2Eq;
    }

    public BigDecimal getCo2AufwandVerarbeitung() {
        return co2AufwandVerarbeitung;
    }

    public void setCo2AufwandVerarbeitung(BigDecimal co2AufwandVerarbeitung) {
        this.co2AufwandVerarbeitung = co2AufwandVerarbeitung;
    }


    public double getRecyclingQuote() {
        return recyclingQuote;
    }

    public void setRecyclingQuote(double recyclingQuote) {
        this.recyclingQuote = recyclingQuote;
    }

    public BigDecimal getFossileMasse() {
        return fossileMasse;
    }

    public void setFossileMasse(BigDecimal fossileMasse) {
        this.fossileMasse = fossileMasse;
    }

    public BigDecimal getMaterialCO2Eq() {
        return materialCO2Eq;
    }

    public void setMaterialCO2Eq(BigDecimal materialCO2Eq) {
        this.materialCO2Eq = materialCO2Eq;
    }

    public BigDecimal getMaterialEnergie() {
        return materialEnergie;
    }

    public void setMaterialEnergie(BigDecimal materialEnergie) {
        this.materialEnergie = materialEnergie;
    }

    public BigDecimal getEnergieAufwandVerarbeitung() {
        return energieAufwandVerarbeitung;
    }

    public void setEnergieAufwandVerarbeitung(BigDecimal energieAufwandVerarbeitung) {
        this.energieAufwandVerarbeitung = energieAufwandVerarbeitung;
    }

    public BigDecimal getVerbrennungCo2Eq() {
        return verbrennungCo2Eq;
    }

    public void setVerbrennungCo2Eq(BigDecimal verbrennungCo2Eq) {
        this.verbrennungCo2Eq = verbrennungCo2Eq;
    }

    public BigDecimal getVerbrennungENutzEnergie() {
        return verbrennungENutzEnergie;
    }

    public void setVerbrennungENutzEnergie(BigDecimal verbrennungENutzEnergie) {
        this.verbrennungENutzEnergie = verbrennungENutzEnergie;
    }

    public BigDecimal getGutschriftVerbrennungCo2Eq() {
        return gutschriftVerbrennungCo2Eq;
    }

    public void setGutschriftVerbrennungCo2Eq(BigDecimal gutschriftVerbrennungCo2Eq) {
        this.gutschriftVerbrennungCo2Eq = gutschriftVerbrennungCo2Eq;
    }

    public BigDecimal getIndirectco2Biofuel() {
        return indirectco2Biofuel;
    }

    public void setIndirectco2Biofuel(BigDecimal indirectco2Biofuel) {
        this.indirectco2Biofuel = indirectco2Biofuel;
    }

    public BigDecimal getTransportCo2Eq() {
        return transportCo2Eq;
    }

    public void setTransportCo2Eq(BigDecimal transportCo2Eq) {
        this.transportCo2Eq = transportCo2Eq;
    }

    public BigDecimal getTransportEnergie() {
        return transportEnergie;
    }

    public void setTransportEnergie(BigDecimal transportEnergie) {
        this.transportEnergie = transportEnergie;
    }

    public double getMenge() {
        return menge;
    }

    public void setMenge(double menge) {
        this.menge = menge;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }

    public double getDicke() {
        return dicke;
    }

    public void setDicke(double dicke) {
        this.dicke = dicke;
    }

    public double getTransportstrecke() {
        return transportstrecke;
    }

    public void setTransportstrecke(double transportstrecke) {
        this.transportstrecke = transportstrecke;
    }

    public Long getTransportmittelId() {
        return transportmittelId;
    }

    public void setTransportmittelId(Long transportmittelId) {
        this.transportmittelId = transportmittelId;
    }

    public String getTransportmittel() {
        return transportmittel;
    }

    public void setTransportmittel(String transportmittel) {
        this.transportmittel = transportmittel;
    }

    private Long verpackungId;


    public Long getEnergierueckgewinnungId() {
        return energierueckgewinnungId;
    }

    public void setEnergierueckgewinnungId(Long energierueckgewinnungId) {
        this.energierueckgewinnungId = energierueckgewinnungId;
    }

    public String getEnergierueckgewinnung() {
        return energierueckgewinnung;
    }

    public void setEnergierueckgewinnung(String energierueckgewinnung) {
        this.energierueckgewinnung = energierueckgewinnung;
    }

    public Long getVerpackungId() {
        return verpackungId;
    }

    public void setVerpackungId(Long verpackungId) {
        this.verpackungId = verpackungId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public String getVerarbeitung() {
        return verarbeitung;
    }

    public void setVerarbeitung(String verarbeitung) {
        this.verarbeitung = verarbeitung;
    }

    public Long getVerarbeitungId() {
        return verarbeitungId;
    }

    public void setVerarbeitungId(Long verarbeitungId) {
        this.verarbeitungId = verarbeitungId;
    }

    public String getRecyclingverfahren() {
        return recyclingverfahren;
    }

    public void setRecyclingverfahren(String recyclingverfahren) {
        this.recyclingverfahren = recyclingverfahren;
    }

    public Long getRecyclingverfahrenId() {
        return recyclingverfahrenId;
    }

    public void setRecyclingverfahrenId(Long recyclingverfahrenId) {
        this.recyclingverfahrenId = recyclingverfahrenId;
    }


}
