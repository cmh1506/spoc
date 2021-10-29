package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Verpackung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VerpackungRepository extends JpaRepository<Verpackung, Long>{
    void deleteVerpackungById(Long id);
    Optional<Verpackung> findVerpackungById(Long id);
}
