package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Recyclingverfahren;
import de.heinrich.spoc.util.RecyclingMethode;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Component
public class RecyclingverfahrenRepository {

    RecyclingverfahrenRepository(){
    }

    public Optional<Recyclingverfahren> findRecyclingverfahrenById(Long aLong){
        return Arrays.stream(Recyclingverfahren.values()).filter(x -> x.ordinal() == aLong).findFirst();
    };



    public List<de.heinrich.spoc.dto.Recyclingverfahren> findAllRecyclingverfahren(){
        ArrayList<de.heinrich.spoc.dto.Recyclingverfahren> toReturn = new ArrayList<>();
        for (Recyclingverfahren r : Recyclingverfahren.values()) {
            toReturn.add(new de.heinrich.spoc.dto.Recyclingverfahren(Long.valueOf(r.ordinal()), r.getMethode()));
        }
        return toReturn;
    };

}
