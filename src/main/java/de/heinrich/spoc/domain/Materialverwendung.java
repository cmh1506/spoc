package de.heinrich.spoc.domain;

import javax.persistence.*;

@Entity
@Table(name = "materialverwendung", schema = "spoc")
public class Materialverwendung {
    @Id
    @SequenceGenerator(
            name = "material_verwendung_sequence",
            sequenceName = "material_verwendung_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "material_verwendung_sequence"
    )
    private Long id;

    public Verpackung getVerpackung() {
        return verpackung;
    }

    public void setVerpackung(Verpackung verpackung) {
        this.verpackung = verpackung;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    private Verpackung verpackung;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "material_id", referencedColumnName = "id")
    private Material material;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "verarbeitung_id", referencedColumnName = "id")
    private Verarbeitung verarbeitung;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recyclingverfahren_id", referencedColumnName = "id")
    private Recyclingverfahren recyclingVerfahren;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "energierueckgewinnung_id", referencedColumnName = "id")
    private Energierueckgewinnung energierueckgewinnung;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transportmittel_id", referencedColumnName = "id")
    private Transportmittel transportmittel;
    private double recyclingQuote;

    public double getRecyclingQuote() {
        return recyclingQuote;
    }

    public void setRecyclingQuote(double recyclingQuote) {
        this.recyclingQuote = recyclingQuote;
    }

    private double menge;
    private double flaeche;
    private double dicke;
    private double transportStrecke;

    public double getTransportStrecke() {

        return transportStrecke;
    }

    public void setTransportStrecke(double transportStrecke) {
        this.transportStrecke = transportStrecke;
    }

    public Transportmittel getTransportmittel() {
        return transportmittel;
    }

    public void setTransportmittel(Transportmittel transportmittel) {
        this.transportmittel = transportmittel;
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


    

    public Energierueckgewinnung getEnergierueckgewinnung() {
        return energierueckgewinnung;
    }

    public void setEnergierueckgewinnung(Energierueckgewinnung energierueckgewinnung) {
        this.energierueckgewinnung = energierueckgewinnung;
    }

    public Materialverwendung() {}

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Verarbeitung getVerarbeitung() {
        return verarbeitung;
    }

    public void setVerarbeitung(Verarbeitung verarbeitung) {
        this.verarbeitung = verarbeitung;
    }

    public Recyclingverfahren getRecyclingVerfahren() {
        return recyclingVerfahren;
    }

    public void setRecyclingVerfahren(Recyclingverfahren recyclingVerfahren) {
        this.recyclingVerfahren = recyclingVerfahren;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
