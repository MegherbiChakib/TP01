package exo2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class isAngramTest {

    @Test
    public void testIsAnagram() {
        assertTrue(Anagram.isAnagramResolved("listen", "silent"));
        assertTrue(Anagram.isAnagramResolved("rail safety", "fairy tales"));
        assertTrue(Anagram.isAnagramResolved("debit card", "bad credit"));
        assertTrue(Anagram.isAnagramResolved("Tom Marvolo Riddle", "I am Lord Voldemort"));
        assertFalse(Anagram.isAnagramResolved("hello", "world"));
        assertFalse(Anagram.isAnagramResolved("foo", "bar"));
        assertFalse(Anagram.isAnagramResolved("anagram", "anagrams"));

    }

    @Test
    public void testNullStrings() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagramResolved(null, "hello");
        });
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagramResolved("hello", null);
        });
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagramResolved(null, null);
        });
    }
}
