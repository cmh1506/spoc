package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Verarbeitung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface VerarbeitungRepository  extends JpaRepository<Verarbeitung, Long> {
    void deleteVerarbeitungById(Long id);
    Optional<Verarbeitung> findVerarbeitungById(Long id);

     @Query("select new de.heinrich.spoc.dto.Verarbeitung(v.id, v.name) from Verarbeitung v order by v.name")
     List<de.heinrich.spoc.dto.Verarbeitung> findAllVerarbeitungs();

}
