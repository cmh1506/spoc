package de.heinrich.spoc.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "material", schema = "spoc")
public class Material implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material() {
    }

    public Material(String name) {
        this.name = name;
    }

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
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
