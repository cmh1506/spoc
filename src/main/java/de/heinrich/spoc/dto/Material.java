package de.heinrich.spoc.dto;

public class Material {
    private Long id;
    private String name;

    public Material(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Material() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
