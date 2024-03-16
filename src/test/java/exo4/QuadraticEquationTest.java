package exo4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuadraticEquationTest {
    @Test
    public void testSolve() {
        // Test with real roots
        assertArrayEquals(new double[]{-1, -3}, QuadraticEquation.solveResolved(1, 4, 3));

        // Test with one real root
        assertArrayEquals(new double[]{-1}, QuadraticEquation.solveResolved(1, 2, 1));

        // Test with complex roots
        assertNull(QuadraticEquation.solveResolved(1, 2, 3));
    }

    @Test
    public void testInvalidCoefficient() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solveResolved(0, 2, 3);
        });
    }

}
