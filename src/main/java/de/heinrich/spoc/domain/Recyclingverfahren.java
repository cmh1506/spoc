package de.heinrich.spoc.domain;

import java.io.Serializable;

public enum Recyclingverfahren implements Serializable {
    OPEN_LOOP("Open Loop"),
    CLOSED_LOOP("Closed Loop");

    private String methode;

    Recyclingverfahren(String name) {
        this.methode = name;
    }

    public String getMethode() {
        return methode;
    }

    public Long getId() {
       return Long.valueOf(this.ordinal());
    }
}
