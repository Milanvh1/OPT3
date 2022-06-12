package test;

import com.example.alrijneziekenhuisapp.KeuzePatiënt;
import com.example.alrijneziekenhuisapp.Maaltijd;
import com.example.alrijneziekenhuisapp.Menu;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuTest {

    @Test
    void testKeuzesDrinkenEnExtra() {

        // Arrange
        Menu.getKeuzesDrinkenEnExtra();
        ArrayList<KeuzePatiënt> testDrinkenEnExtraLijst = new ArrayList<>();
        for (int i = 0; i < Menu.getKeuzesDrinkenEnExtra().size(); i++) {
            testDrinkenEnExtraLijst.add(Menu.getKeuzesDrinkenEnExtra().get(i));
        }
        // Act
        ArrayList<KeuzePatiënt> result = Menu.getKeuzesDrinkenEnExtra();

        // Assert
        assertEquals(testDrinkenEnExtraLijst, result);
    }

    @Test
    void testKeuzesAvondEten() {

        // Arrange
        Menu.getKeuzesAvondEten();
        ArrayList<Maaltijd> testAvondEtenLijst = new ArrayList<>();
        for (int i = 0; i < Menu.getKeuzesAvondEten().size(); i++) {
            testAvondEtenLijst.add(Menu.getKeuzesAvondEten().get(i));
        }
        // Act
        ArrayList<Maaltijd> result = Menu.getKeuzesAvondEten();

        // Assert
        assertEquals(testAvondEtenLijst, result);
    }

    @Test
    void testKeuzesOchtendEten() {

        // Arrange
        Menu.getKeuzesOchtendEten();
        ArrayList<Maaltijd> testOchtendEtenLijst = new ArrayList<>();
        for (int i = 0; i < Menu.getKeuzesOchtendEten().size(); i++) {
            testOchtendEtenLijst.add(Menu.getKeuzesOchtendEten().get(i));
        }
        // Act
        ArrayList<Maaltijd> result = Menu.getKeuzesOchtendEten();

        // Assert
        assertEquals(testOchtendEtenLijst, result);
    }
}