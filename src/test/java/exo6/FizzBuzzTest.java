package exo6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        assertEquals("1", FizzBuzz.fizzBuzzResolved(1));
        assertEquals("2", FizzBuzz.fizzBuzzResolved(2));
        assertEquals("Fizz", FizzBuzz.fizzBuzzResolved(3));
        assertEquals("4", FizzBuzz.fizzBuzzResolved(4));
        assertEquals("Buzz", FizzBuzz.fizzBuzzResolved(5));
        assertEquals("Fizz", FizzBuzz.fizzBuzzResolved(6));
        assertEquals("7", FizzBuzz.fizzBuzzResolved(7));
        assertEquals("8", FizzBuzz.fizzBuzzResolved(8));
        assertEquals("Fizz", FizzBuzz.fizzBuzzResolved(9));


    }

    @Test
    public void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzzResolved(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzzResolved(-5);
        });
    }
}
