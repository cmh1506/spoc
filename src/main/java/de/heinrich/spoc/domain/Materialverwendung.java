package de.heinrich.spoc.domain;

import static javax.persistence.EnumType.STRING;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "materialverwendung", schema = "spoc")
public class Materialverwendung {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    public Verpackung getVerpackung() {
        return verpackung;
    }

    public void setVerpackung(Verpackung verpackung) {
        this.verpackung = verpackung;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Verpackung verpackung;
    @OneToOne
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JoinColumn(name = "material_id", referencedColumnName = "id")
    private Material material;
    @OneToOne
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JoinColumn(name = "verarbeitung_id", referencedColumnName = "id")
    private Verarbeitung verarbeitung;
    @Enumerated(STRING)
    private Recyclingverfahren recyclingVerfahren;
    @OneToOne
    @JoinColumn(name = "energierueckgewinnung_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Energierueckgewinnung energierueckgewinnung;
    @OneToOne
    @JoinColumn(name = "transportmittel_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
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
