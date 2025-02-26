package binary.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search() {
        BinarySearch sut = new BinarySearch();
        assertEquals(4, sut.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, sut.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        assertEquals(5, sut.search(new int[]{-1, 0, 3, 5, 9, 12}, 12));
        assertEquals(0, sut.search(new int[]{-1, 0, 3, 5, 9, 12}, -1));
        assertEquals(0, sut.search(new int[]{777}, 777));
    }
}