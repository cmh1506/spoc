package de.heinrich.spoc.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Verarbeitung {
    @Id
    @SequenceGenerator(
            name = "verarbeitung_sequence",
            sequenceName = "verarbeitung_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "verarbeitung_sequence"
    )
    private Long id;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Verarbeitung() {
    }

    public Verarbeitung(String name) {
        this.name = name;
    }
}
