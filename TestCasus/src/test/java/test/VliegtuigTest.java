package test;

import com.company.Vliegtuig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VliegtuigTest {

    @Test
    void opstijgenVliegtuig() {
        Vliegtuig vliegtuig = new Vliegtuig(true, 1200, 100);
        assertFalse(vliegtuig.opstijgenVliegtuig(false  ,460, 60));
        assertFalse(vliegtuig.opstijgenVliegtuig(false  ,960, 75));
        assertFalse(vliegtuig.opstijgenVliegtuig(false  ,1780, 33));
        assertFalse(vliegtuig.opstijgenVliegtuig(true  ,1240, 40));
        assertTrue(vliegtuig.opstijgenVliegtuig(true, 660, 25));
        assertTrue(vliegtuig.opstijgenVliegtuig(true, 1900, 80));
        assertFalse(vliegtuig.opstijgenVliegtuig(false  ,1100, 93));
    }
}