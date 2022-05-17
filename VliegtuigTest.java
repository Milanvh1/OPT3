package test;

import com.company.Vliegtuig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VliegtuigTest {

    @Test
    void opstijgenVliegtuig() {
        Vliegtuig vliegtuig = new Vliegtuig(true, 1200, 60);
        assertFalse(vliegtuig.opstijgenVliegtuig(false  ,180, 60));
        assertTrue(vliegtuig.opstijgenVliegtuig(true, 550, 40));
        assertTrue(vliegtuig.opstijgenVliegtuig(true, 900, 20));
    }
}