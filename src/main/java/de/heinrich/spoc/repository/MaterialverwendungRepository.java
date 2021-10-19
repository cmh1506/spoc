package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Material;
import de.heinrich.spoc.domain.Materialverwendung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MaterialverwendungRepository extends JpaRepository<Materialverwendung, Long> {
    void deleteMaterialverwendungById(Long id);

    Optional<Materialverwendung> findMaterialverwendungById(Long id);
}
