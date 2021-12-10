package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Material;
import de.heinrich.spoc.domain.Transportmittel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TransportmittelRepository  extends JpaRepository<Transportmittel, Long> {
    Optional<Transportmittel> findTransportmittelById(Long id);

    @Query("select new de.heinrich.spoc.dto.Transportmittel(t.id, t.name) from Transportmittel t order by t.name")
    List<de.heinrich.spoc.dto.Transportmittel> findAllTransportmittels();
}
