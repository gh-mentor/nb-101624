import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// StressTest.java


public class StressTest {

    @Test
    public void testStressTestWithValidLoad() {
        assertDoesNotThrow(() -> Stress.stressTest(5));
    }

    @Test
    public void testStressTestWithInvalidLoad() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Stress.stressTest(0));
        assertEquals("Load must be greater than 0", exception.getMessage());
    }

    @Test
    public void testStressTestWithAnotherValidLoad() {
        assertDoesNotThrow(() -> Stress.stressTest(10));
    }
}