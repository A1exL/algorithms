package insert.interval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    @Test
    void insert1() {
        InsertInterval sut = new InsertInterval();
        int[][] intervals = new int[][]{{1, 3}, {6, 9}};

        int[][] result = sut.insert(intervals, new int[]{2, 5}); // [[1,5],[6,9]

        assertArrayEquals(new int[] {1,5}, result[0]);
        assertArrayEquals(new int[] {6,9}, result[1]);

    }

    @Test
    void insert2() {
        InsertInterval sut = new InsertInterval();
        int[][] intervals = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};

        int[][] result = sut.insert(intervals, new int[]{4, 8}); // [[1,2],[3,10],[12,16]]

        assertArrayEquals(new int[] {1,2}, result[0]);
        assertArrayEquals(new int[] {3,10}, result[1]);
        assertArrayEquals(new int[] {12,16}, result[2]);
    }

    @Test
    void insert3() {
        InsertInterval sut = new InsertInterval();
        int[][] intervals = new int[][]{{10, 12}, {15, 17}};

        int[][] result = sut.insert(intervals, new int[]{2, 5});

        assertArrayEquals(new int[] {2,5}, result[0]);
        assertArrayEquals(new int[] {10,12}, result[1]);
        assertArrayEquals(new int[] {15,17}, result[2]);

    }
}