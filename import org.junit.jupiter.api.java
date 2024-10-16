import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordMixTest {

    @Test
    public void testSimplePalindrome() {
        assertTrue(WordMix.palindrome("bob"));
        assertTrue(WordMix.palindrome("kayak"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(WordMix.palindrome("boat"));
        assertFalse(WordMix.palindrome("horse"));
        assertFalse(WordMix.palindrome("car"));
    }

    @Test
    public void testCaseInsensitivePalindrome() {
        assertTrue(WordMix.palindrome("Bob"));
        assertTrue(WordMix.palindrome("Kayak"));
    }

    @Test
    public void testPalindromeWithSpacesAndPunctuation() {
        assertTrue(WordMix.palindrome("A man, a plan, a canal, Panama"));
    }
}