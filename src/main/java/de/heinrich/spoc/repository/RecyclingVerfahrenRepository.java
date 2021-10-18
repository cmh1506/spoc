package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.RecyclingVerfahren;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecyclingVerfahrenRepository extends JpaRepository<RecyclingVerfahren, Long> {
    @Override
    Optional<RecyclingVerfahren> findById(Long aLong);
}
