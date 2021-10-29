package de.heinrich.spoc.dto;

public class Materialverwendung {
    private Long id;
    private String material;
    private Long materialId;
    private String verarbeitung;
    private Long verarbeitungId;
    private String recyclingmethode;
    private Long recyclingmethodeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public String getVerarbeitung() {
        return verarbeitung;
    }

    public void setVerarbeitung(String verarbeitung) {
        this.verarbeitung = verarbeitung;
    }

    public Long getVerarbeitungId() {
        return verarbeitungId;
    }

    public void setVerarbeitungId(Long verarbeitungId) {
        this.verarbeitungId = verarbeitungId;
    }

    public String getRecyclingmethode() {
        return recyclingmethode;
    }

    public void setRecyclingmethode(String recyclingmethode) {
        this.recyclingmethode = recyclingmethode;
    }

    public Long getRecyclingmethodeId() {
        return recyclingmethodeId;
    }

    public void setRecyclingmethodeId(Long recyclingmethodeId) {
        this.recyclingmethodeId = recyclingmethodeId;
    }

    public Materialverwendung(de.heinrich.spoc.domain.Materialverwendung domain) {
        this.id = domain.getId();
        this.material = domain.getMaterial().getName();
        this.materialId = domain.getMaterial().getId();
        this.verarbeitung = domain.getVerarbeitung().getName();
        this.verarbeitungId = domain.getVerarbeitung().getId();
        this.recyclingmethode = domain.getRecyclingVerfahren().getName();
        this.recyclingmethodeId = domain.getRecyclingVerfahren().getId();
    }
}
