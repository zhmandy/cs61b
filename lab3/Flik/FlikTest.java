import org.junit.Test;
import static org.junit.Assert.*;

public class FlikTest {
    @Test
    public void testIsSameNumber() {
        int a = 128;
        int b = 128;
        int c = 500;
        boolean result1 = Flik.isSameNumber(a, b);
        boolean result2 = Flik.isSameNumber(a, c);

        assertTrue(result1);
        assertTrue(result2);
    }
}
