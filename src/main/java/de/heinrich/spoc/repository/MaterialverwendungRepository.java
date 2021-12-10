package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Material;
import de.heinrich.spoc.domain.Materialverwendung;
import de.heinrich.spoc.domain.Verpackung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface MaterialverwendungRepository extends JpaRepository<Materialverwendung, Long> {
    @Transactional
    @Modifying
    @Query("delete from Materialverwendung m where m.id=:id")
    void deleteMaterialverwendungById(@Param("id") Long id);

    Optional<Materialverwendung> findMaterialverwendungById(Long id);

    List<Materialverwendung> findAllByVerpackung(Verpackung verpackung);
}
