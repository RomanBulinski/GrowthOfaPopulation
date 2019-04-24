import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


    @Test
    public void test1() {
        assertEquals(15, Main.nbYear(1500, 5, 100, 5000));
    }

    @Test
    public void test2() {
        assertEquals(10, Main.nbYear(1500000, 2.5, 10000, 2000000));
    }


}
