import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


    @Test
    public void test1(){
        assertEquals( 15  ,Main.nbYear(1500, 5, 100, 5000)     );
    }


}
