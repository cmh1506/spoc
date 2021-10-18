package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MaterialRepository extends JpaRepository<Material, Long> {
    void deleteMaterialById(Long id);

    Optional<Material> findMaterialById(Long id);
}
