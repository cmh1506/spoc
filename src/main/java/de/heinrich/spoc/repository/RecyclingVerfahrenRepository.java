package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Recyclingverfahren;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecyclingVerfahrenRepository extends JpaRepository<Recyclingverfahren, Long> {
    @Override
    Optional<Recyclingverfahren> findById(Long aLong);
}
