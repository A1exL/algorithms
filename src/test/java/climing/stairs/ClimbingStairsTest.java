package climing.stairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void climbStairs() {
        ClimbingStairs sut = new ClimbingStairs();
        assertEquals(1134903170, sut.climbStairs(44));
    }
}