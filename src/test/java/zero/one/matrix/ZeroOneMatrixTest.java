package zero.one.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroOneMatrixTest {

    @Test
    void updateMatrix() {
        ZeroOneMatrix sut = new ZeroOneMatrix();
        int[][] inputMatrix = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] outputMatrix = sut.updateMatrix(inputMatrix);

        assertArrayEquals(new int[]{0, 0, 0}, outputMatrix[0]);
        assertArrayEquals(new int[]{0, 1, 0}, outputMatrix[1]);
        assertArrayEquals(new int[]{1, 2, 1}, outputMatrix[2]);
    }
}