package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface MaterialRepository extends JpaRepository<Material, Long> {
    @Transactional
    @Modifying
    @Query("delete from Material m where m.id=:id")
    void deleteMaterialById(Long id);

    Optional<Material> findMaterialById(Long id);

    @Query("select new de.heinrich.spoc.dto.Material(m.id, m.a_name) from Material m order by m.a_name")
    List<de.heinrich.spoc.dto.Material> findAllMaterials();



}
