package two.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumNestedLoopsTest {

    @Test
    void twoSum() {
        TwoSumNestedLoops sut = new TwoSumNestedLoops();
        assertArrayEquals(new int[]{0, 1}, sut.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, sut.twoSum(new int[]{3, 2, 4}, 6));
    }
}