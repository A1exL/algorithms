package longest.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    @Test
    void longestPalindrome() {
        LongestPalindrome sut = new LongestPalindrome();

        assertEquals(7, sut.longestPalindrome("abccccdd"));
        assertEquals(1, sut.longestPalindrome("a"));
    }
}