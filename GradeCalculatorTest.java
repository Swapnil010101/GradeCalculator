import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeCalculatorTest {

    GradeCalculator gc;

    @BeforeEach
    void setUp() {
        gc = new GradeCalculator();
    }

    @Test
    void testCalculatePercentage() {
        // Test 45 out of 50 (should be 90.0%)
        assertEquals(90.0, gc.calculatePercentage(45, 50), 0.001);
    }

    @Test
    void testGetLetterGrade() {
        // Test exact boundaries
        assertEquals("A", gc.getLetterGrade(90.0));
        assertEquals("B", gc.getLetterGrade(85.0));
        assertEquals("F", gc.getLetterGrade(59.9));
    }

    @Test
    void testInvalidPercentage() {
        // Ensure it crashes if we give it a 110% or negative
        assertThrows(IllegalArgumentException.class, () -> gc.getLetterGrade(110));
    }
}
