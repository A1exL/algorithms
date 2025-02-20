package subsets;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PowerSetDoublingTest {

    @Test
    void subsets() {
        PowerSetDoubling sut = new PowerSetDoubling();
        List<List<Integer>> subsets = sut.subsets(new int[]{1, 2, 3});
        assertEquals(8, subsets.size());
    }
}