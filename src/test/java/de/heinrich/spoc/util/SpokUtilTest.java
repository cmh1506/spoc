package de.heinrich.spoc.util;

import de.heinrich.spoc.domain.Recyclingverfahren;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpokUtilTest {

    @Test
    @Ignore
    void testBerechneVirginAnteilClosedLoop() {
        SpocUtil spuk = new SpocUtil(Recyclingverfahren.CLOSED_LOOP, 90);
        assertEquals(spuk.getVirginanteil(),  1/ (1 +(1 / (1 - 0.9)) - 1));
    }
    @Test
    @Ignore
    void testBerechneVirginAnteilOpenLoop(){
        SpocUtil spuk = new SpocUtil(Recyclingverfahren.CLOSED_LOOP, 50);
        assertEquals(spuk.getVirginanteil(), (1 / 1.5));
    }

}
