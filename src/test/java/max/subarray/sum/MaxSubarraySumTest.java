package max.subarray.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubarraySumTest {

    @Test
    void maxSubarraySum() {
        MaxSubarraySum sut = new MaxSubarraySum();
        assertEquals(23, sut.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        assertEquals(6, sut.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}