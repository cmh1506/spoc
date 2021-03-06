package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "verpackung", schema = "spoc")
public class Verpackung {
    public Verpackung() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private User user;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "verpackung", orphanRemoval = true)
    private List<Materialverwendung> materialverwendungs;
    private String beschreibung;

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    private String name;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Materialverwendung> getMaterialverwendungs() {
        return materialverwendungs;
    }

    public void setMaterialverwendungs(List<Materialverwendung> materialverwendungs) {
        this.materialverwendungs = materialverwendungs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
