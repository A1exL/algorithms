package two.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumHashMapTest {

    @Test
    void twoSum() {
        TwoSumHashMap sut = new TwoSumHashMap();
        assertArrayEquals(new int[]{1, 0}, sut.twoSum(new int[]{3, 4}, 7));
    }

}