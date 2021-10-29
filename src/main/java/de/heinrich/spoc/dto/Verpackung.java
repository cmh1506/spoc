package de.heinrich.spoc.dto;

import java.util.List;

public class Verpackung {
    private Long id;
    private String name;
    private Long userId;
    private String user;
    private List<de.heinrich.spoc.dto.Materialverwendung> materialverwendungList;

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

    public List<de.heinrich.spoc.dto.Materialverwendung> getMaterialverwendungList() {
        return materialverwendungList;
    }

    public void setMaterialverwendungList(List<de.heinrich.spoc.dto.Materialverwendung> materialverwendungList) {
        this.materialverwendungList = materialverwendungList;
    }
}
