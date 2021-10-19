package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.MaterialVerwendung;

public class MaterialVerwendungRepository JpaRepository<Material, Long> {
        Optional<MaterialVerwendung> findMaterialById(Long id);
}
