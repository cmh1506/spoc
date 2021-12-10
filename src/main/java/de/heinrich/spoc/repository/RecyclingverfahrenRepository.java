package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Material;
import de.heinrich.spoc.domain.Recyclingverfahren;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RecyclingverfahrenRepository extends JpaRepository<Recyclingverfahren, Long> {

    Optional<Recyclingverfahren> findRecyclingverfahrenById(Long aLong);
    void deleteRecyclingverfahrenById(Long id);

    @Query("select new de.heinrich.spoc.dto.Recyclingverfahren(r.id, r.name) from Recyclingverfahren r order by r.name")
    List<de.heinrich.spoc.dto.Recyclingverfahren> findAllRecyclingverfahren();

}
