package de.heinrich.spoc.dto;

import java.util.List;

public class Verpackung {
    private Long id;
    private String name;
    private Long userId;
    private String user;
    private String beschreibung;

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

    public Verpackung(de.heinrich.spoc.domain.Verpackung entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.userId = entity.getUser().getId();
        this.user = entity.getUser().getUsername();
        this.beschreibung = entity.getBeschreibung();

    }


}
