package exo1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exo1Test {
    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindromeResolved("radar"));
        assertTrue(Palindrome.isPalindromeResolved("A man a plan a canal Panama"));
        assertTrue(Palindrome.isPalindromeResolved("level"));
        assertFalse(Palindrome.isPalindromeResolved("hello"));
        assertFalse(Palindrome.isPalindromeResolved("chakib"));
        assertFalse(Palindrome.isPalindromeResolved("not a palindrome"));
    }

    @Test
    public void testNullString() {
        assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindromeResolved(null);
        });
    }
}
