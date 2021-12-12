package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.NutzenergieCO2Equivalent;
import de.heinrich.spoc.domain.Verpackung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NutzenergieCO2EquivalentRepository  extends JpaRepository<NutzenergieCO2Equivalent, Long> {
    List<NutzenergieCO2Equivalent> findAll();

    NutzenergieCO2Equivalent findNutzenergieCO2EquivalentByEnergietraeger(String energietraeger);
}
