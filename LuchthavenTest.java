package test;

import com.company.Luchthaven;
import com.company.Vliegtuig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuchthavenTest {

    @Test
    void getPrijs() {
        assertEquals (1089.0, Luchthaven.getPrijs (999, 1, true, true) );
        assertEquals (907.5, Luchthaven.getPrijs (4999, 3, false, true));
        assertEquals (3750.0, Luchthaven.getPrijs (7000, 32, false, false));
        assertEquals (4550.0, Luchthaven.getPrijs (9000, 44, true, false));
    }
}