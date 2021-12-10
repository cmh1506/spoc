package de.heinrich.spoc.util;

import de.heinrich.spoc.domain.Recyclingverfahren;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpokUtilTest {

    @Test
    void testBerechneVirginAnteilClosedLoop() {
        SpocUtil spuk = new SpocUtil(new Recyclingverfahren("Closed Loop"), new BigDecimal(90));
        assertEquals(spuk.getVirginanteil(),  1/ (1 +(1 / (1 - 0.9)) - 1));
    }
    @Test
    void testBerechneVirginAnteilOpenLoop(){
        SpocUtil spuk = new SpocUtil(new Recyclingverfahren("Open Loop"), new BigDecimal(50));
        assertEquals(spuk.getVirginanteil(), (1 / 1.5));
    }

}
