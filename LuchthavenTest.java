package test;

import com.company.Luchthaven;
import com.company.Vliegtuig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuchthavenTest {

    @Test
    void getPrijsGewicht() {
        assertEquals(100, Luchthaven.getPrijsGewicht(0));
        assertEquals(100, Luchthaven.getPrijsGewicht(1));
        assertEquals(100, Luchthaven.getPrijsGewicht(999));
        assertEquals(500, Luchthaven.getPrijsGewicht(1000));
        assertEquals(500, Luchthaven.getPrijsGewicht(1001));
        assertEquals(500, Luchthaven.getPrijsGewicht(4999));
        assertEquals(2500, Luchthaven.getPrijsGewicht(5000));
        assertEquals(2500, Luchthaven.getPrijsGewicht(5001));
    }

    @Test
    void getPrijsTotaal() {
        assertEquals (900.0, Luchthaven.getPrijsTotaal (700, 2, true, false));
        assertEquals (181.5, Luchthaven.getPrijsTotaal (700, 7, false, true));
        assertEquals (605.0, Luchthaven.getPrijsTotaal (4400, 2, false , true));
        assertEquals (1550.0, Luchthaven.getPrijsTotaal (4400, 7, true, false));
        assertEquals (3750.0, Luchthaven.getPrijsTotaal (8000, 7, false, false));
        assertEquals (3993.0, Luchthaven.getPrijsTotaal (8000, 2, true, true));
    }
}