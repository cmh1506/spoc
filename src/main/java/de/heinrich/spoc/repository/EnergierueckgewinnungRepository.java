package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Energierueckgewinnung;
import de.heinrich.spoc.dto.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EnergierueckgewinnungRepository extends JpaRepository<Energierueckgewinnung, Long> {
    @Query("select new de.heinrich.spoc.dto.Energierueckgewinnung(e.id, e.name) from Energierueckgewinnung e order by e.name")
    List<de.heinrich.spoc.dto.Energierueckgewinnung> findAllMaterials();

    Optional<Energierueckgewinnung> findEnergierueckgewinnungById(Long id);
}
