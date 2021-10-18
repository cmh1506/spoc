package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.Material;
import de.heinrich.spoc.repository.MaterialRepository;
import de.heinrich.spoc.service.exceptions.MaterialNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {
    private final MaterialRepository repo;

    @Autowired
    public MaterialService(MaterialRepository repo) {
        this.repo = repo;
    }

    public Material addMaterial(Material material){
        return repo.save(material);
    }

    public List<Material> findAllMaterials(){
        return repo.findAll();
    }

    public Material updateMaterial(Material material){
        return repo.save(material);
    }

    public Material findMaterialById(Long id){
        return repo.findMaterialById(id).orElseThrow(() -> new MaterialNotFoundException("Material with id " + id + " was not found!"));
    }

    public void deleteMaterial(Long id){
        repo.deleteMaterialById(id);
    }
}
