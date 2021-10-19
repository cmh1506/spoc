package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Verarbeitung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VerarbeitungRepository  extends JpaRepository<Verarbeitung, Long> {
    void deleteVerarbeitungById(Long id);
    Optional<Verarbeitung> findVerarbeitungById(Long id);
}
