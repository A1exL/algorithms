package first.bad.version;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void firstBadVersion() {
        FirstBadVersion sut = new FirstBadVersion();
        sut.badVersion = 11;
        assertEquals(11, sut.firstBadVersion(41));
    }
}