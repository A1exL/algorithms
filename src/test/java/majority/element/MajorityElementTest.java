package majority.element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void majorityElement() {
        MajorityElement sut = new MajorityElement();
        assertEquals(3, sut.majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, sut.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}