package test;

import com.example.alrijneziekenhuisapp.Maaltijd;
import com.example.alrijneziekenhuisapp.MaaltijdType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaaltijdTest {

    @Test
    void testAantal () {

        // Arrange
        Maaltijd maaltijd = new Maaltijd(MaaltijdType.OCHTENDMAALTIJD);

        // Act
        int expected = 4;
        int actual = maaltijd.aantalMaaltijden();

        // Assert
        assertEquals(expected, actual);
        System.out.println(actual);

        // Arrange
        maaltijd = new Maaltijd(MaaltijdType.MIDDAGMAALTIJD);

        // Act
        expected = 5;
        actual = maaltijd.aantalMaaltijden();

        // Assert
        assertEquals(expected, actual);
        System.out.println(actual);

        // Arrange
        maaltijd = new Maaltijd(MaaltijdType.AVONDMAALTIJD);

        // Act
        expected = 7;
        actual = maaltijd.aantalMaaltijden();

        // Assert
        assertEquals(expected, actual);
        System.out.println(actual);
    }
}