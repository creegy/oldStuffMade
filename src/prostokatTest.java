import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class prostokatTest {

    @Test
    void poprawnePoleProstokata (){
        prostokat prostokat = new prostokat(3, 5);
        Assertions.assertTrue(prostokat.ObliczPole() == 15);
    }
    @Test
    void poprawnyObwodProstokata(){
        prostokat prostokat = new prostokat(3,5);
        Assertions.assertEquals(30, prostokat.ObliczObwod());
    }

    @Test
    void ujemnaWartoscBokuAJestNiedozwolona() {
        prostokat prostokat = new prostokat(3,1);
        prostokat.setBokA(-3);
        Assertions.assertEquals(3,prostokat.getBokA());
    }

    @Test
    void ujemnaWartoscBokuBJestNiedozwolona() {
        prostokat prostokat = new prostokat(3,5);
        prostokat.setBokB(-5);
        Assertions.assertEquals(5, prostokat.getBokB());
    }

    @Test
    void ujemnyBokAwKonstruktorzeJestNiedozwolony() {
        prostokat prostokat = new prostokat(-3,5);
        Assertions.assertEquals(3, prostokat.getBokA());
    }
    @Test
    void ujemnyBokBwKonstruktorzeJestNiedozwolony() {
        prostokat prostokat = new prostokat(-3, 5);
        Assertions.assertEquals(3, prostokat.getBokA());
    }

}