package exo5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RomanNumeralTest {
    @Test
    public void testToRoman() {
        assertEquals("I", RomanNumeral.toRomanResolved(1));
        assertEquals("IV", RomanNumeral.toRomanResolved(4));
        assertEquals("IX", RomanNumeral.toRomanResolved(9));
        assertEquals("XII", RomanNumeral.toRomanResolved(12));
        assertEquals("XX", RomanNumeral.toRomanResolved(20));
        assertEquals("XLIV", RomanNumeral.toRomanResolved(44));
        assertEquals("LXXVIII", RomanNumeral.toRomanResolved(78));
        assertEquals("XC", RomanNumeral.toRomanResolved(90));
        assertEquals("C", RomanNumeral.toRomanResolved(100));
        assertEquals("CD", RomanNumeral.toRomanResolved(400));
        assertEquals("M", RomanNumeral.toRomanResolved(1000));
        assertEquals("MMMCMXCIX", RomanNumeral.toRomanResolved(3999));


        assertNotEquals("D", RomanNumeral.toRomanResolved(400));
        assertNotEquals("M", RomanNumeral.toRomanResolved(500));
        assertNotEquals("IV", RomanNumeral.toRomanResolved(5));
    }

    @Test
    public void testOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRomanResolved(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRomanResolved(4000);
        });
    }
}
