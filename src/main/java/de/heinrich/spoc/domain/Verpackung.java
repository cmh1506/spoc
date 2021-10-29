package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "verpackung", schema = "spoc")
public class Verpackung {
    public Verpackung() {
    }

    @Id
    @SequenceGenerator(
            name = "verpackung_sequence",
            sequenceName = "verpackung_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "verpackung_sequence"
    )
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "verpackung", orphanRemoval = true)
    private List<Materialverwendung> materialverwendungs;

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
