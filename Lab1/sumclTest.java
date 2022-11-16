import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumclTest {

    @Test
    void sumcll() {
        sumcl sumcl = new sumcl();
        int expected = 10;
        int actual = sumcl.sumcll(5,5);
        assertEquals(expected, actual);
    }
}