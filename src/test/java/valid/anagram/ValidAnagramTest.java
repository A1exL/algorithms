package valid.anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void isAnagram() {
        ValidAnagram sut = new ValidAnagram();
        assertTrue(sut.isAnagram("anagram", "nagaram"));
        assertFalse(sut.isAnagram("rat", "car"));
    }
}