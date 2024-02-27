package Prime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PrimeTest {

    @Test
    public void testIsPrimeForNegativeNumbers() {
        assertFalse(Prime.isPrime(-1));
        assertFalse(Prime.isPrime(-2));
        assertFalse(Prime.isPrime(Integer.MIN_VALUE));
    }

    @Test
    public void testIsPrimeForNonPrimeNumbers() {
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(9));
        assertFalse(Prime.isPrime(100));
    }

    @Test
    public void testIsPrimeForPrimeNumbers() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        assertTrue(Prime.isPrime(11));
        assertTrue(Prime.isPrime(13));
        assertTrue(Prime.isPrime(17));
    }


}
