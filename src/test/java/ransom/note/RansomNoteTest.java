package ransom.note;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void canConstruct() {
        RansomNote note = new RansomNote();
        assertTrue(note.canConstruct("abcde", "aaabbbccddeeff"));
        assertFalse(note.canConstruct("abcde", "acdq"));
    }

}