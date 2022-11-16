import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        int seconds = 550;
        int minutes = seconds / 60;
        assertEquals(9, minutes);
    }

    @org.junit.jupiter.api.Test
    void group(){
        group group = new group();
        String actual = group.group( 1);
        String expected = "Дарійчун Роман";
        assertEquals(actual, expected);
    }
}