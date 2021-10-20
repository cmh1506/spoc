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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "material_id", referencedColumnName = "id")
    private Material material;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "verarbeitung_id", referencedColumnName = "id")
    private Verarbeitung verarbeitung;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recyclingverfahren_id", referencedColumnName = "id")
    private Recyclingverfahren recyclingVerfahren;

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
