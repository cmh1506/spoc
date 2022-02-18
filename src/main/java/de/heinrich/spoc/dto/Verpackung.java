package de.heinrich.spoc.dto;

import java.math.BigDecimal;
import java.util.List;

public class Verpackung {
    private Long id;
    private String name;
    private Long userId;
    private String user;
    private String beschreibung;

    public Verpackung(String name, Long userId, String user, String beschreibung, BigDecimal materialCO2Aufwand,
                      BigDecimal cradleToGate, BigDecimal cradleToGrave, BigDecimal cradleToGraveCO2Gutschrift,
                      BigDecimal cradleToGraveCO2GutschriftBioFuel) {
        this.name = name;
        this.userId = userId;
        this.user = user;
        this.beschreibung = beschreibung;

    }

    public Verpackung() {
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }




}
