package flood.fill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    @Test
    void floodFill() {
        FloodFill sut = new FloodFill();
        int[][] image = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] result = sut.floodFill(image, 1, 1, 2);
        assertArrayEquals(new int[]{2, 2, 2}, result[0]);
        assertArrayEquals(new int[]{2, 2, 0}, result[1]);
        assertArrayEquals(new int[]{2, 0, 1}, result[2]);
    }

    @Test
    void floodFillZeroes() {
        FloodFill sut = new FloodFill();
        int[][] image = new int[][]{{0, 0, 0}, {0, 0, 0}};
        int[][] result = sut.floodFill(image, 0, 0, 0);
        assertArrayEquals(new int[]{0, 0, 0}, result[0]);
        assertArrayEquals(new int[]{0, 0, 0}, result[1]);
    }



}