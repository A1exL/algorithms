package contains.duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void containsDuplicate() {
        ContainsDuplicate sut = new ContainsDuplicate();
        assertTrue(sut.containsDuplicate(new int[] {1,2,3,1}));
        assertFalse(sut.containsDuplicate(new int[] {1,2,3,4}));
    }
}