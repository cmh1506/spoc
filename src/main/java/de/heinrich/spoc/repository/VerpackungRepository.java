package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.domain.Verpackung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface VerpackungRepository extends JpaRepository<Verpackung, Long>{
    @Transactional
    @Modifying
    void deleteVerpackungById(Long id);
    Optional<Verpackung> findVerpackungById(Long id);

    List<Verpackung> findAllByUser(User principal);
}
