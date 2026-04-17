import org.junit.Test;
import static org.junit.Assert.*;

public class TestJUnit {
    
    @Test
    public void testCount8_1() {
        assertEquals(4, TestingRecursion.count8(8188));
    }

    @Test
    public void testCount8_2() {
        assertEquals(6, TestingRecursion.count8(88188));
    }

    @Test
    public void testCount8_3() {
        assertEquals(0, TestingRecursion.count8(0));
    }

    @Test
    public void testCount8_4() {
        assertEquals(5, TestingRecursion.count8(888));
    }

    @Test
    public void testCount8_5() {
        assertEquals(0, TestingRecursion.count8(1645));
    }

}
