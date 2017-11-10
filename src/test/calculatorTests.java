import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;


public class calculatorTests {

    @Test
    public void nintyDegreeTest() throws IOException {
        CalculateDegrees calculator = new CalculateDegrees(0, 15);
        calculator.calculateDifference();
        assertEquals(82.5, calculator.getDifference());
    }

    @Test
    public void oneEightyDegreeTest() throws IOException {
        CalculateDegrees calculator = new CalculateDegrees(0, 30);
        calculator.calculateDifference();
        assertEquals(165.0, calculator.getDifference());
    }

    @Test
    public void zeroDegreeTest() throws IOException {
        CalculateDegrees calculator = new CalculateDegrees(0, 0);
        calculator.calculateDifference();
        assertEquals(0.0, calculator.getDifference());
    }

    @Test
    public void twoSeventyDegreeTest() throws IOException {
        CalculateDegrees calculator = new CalculateDegrees(0, 45);
        calculator.calculateDifference();
        assertEquals(247.5, calculator.getDifference());
    }

    @Test
    public void threeSixtyDegreeTest() throws IOException {
        CalculateDegrees calculator = new CalculateDegrees(0, 60);
        calculator.calculateDifference();
        assertEquals(330.0, calculator.getDifference());
    }

    @Test
    public void zeroDegreeBothHandsMaximumTest() throws IOException {
        CalculateDegrees calculator = new CalculateDegrees(12, 60);
        calculator.calculateDifference();
        assertEquals(30.0, calculator.getDifference());
    }

    @Test (expected = IOException.class)
    public void wrongInputTest() throws IOException {
        CalculateDegrees calculator = new CalculateDegrees(13, 30);
        calculator.calculateDifference();
    }

    @Test (expected = IOException.class)
    public void wrongInputNegativeTest() throws IOException {
        CalculateDegrees calculator = new CalculateDegrees(-12, -2);
        calculator.calculateDifference();
    }

}
