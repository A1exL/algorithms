package add.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    void addBinary() {
        AddBinary sut = new AddBinary();
        assertEquals("11", sut.addBinary("1", "10"));
        assertEquals("100", sut.addBinary("11", "1"));
        assertEquals("11110", sut.addBinary("1111", "1111"));
    }
}