import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {

    @Test
    public void nintyDegreeTest() {
        CalculateDegrees calculator = new CalculateDegrees(0, 15);
        assertEquals(90, calculator.getDifference());
    }

    @Test
    public void oneEightyDegreeTest() {
        CalculateDegrees calculator = new CalculateDegrees(0, 30);
        assertEquals(180, calculator.getDifference());
    }

    @Test
    public void zeroDegreeTest() {
        CalculateDegrees calculator = new CalculateDegrees(0, 0);
        assertEquals(0, calculator.getDifference());
    }

    @Test
    public void twoSeventyDegreeTest() {
        CalculateDegrees calculator = new CalculateDegrees(0, 45);
        assertEquals(270, calculator.getDifference());
    }

    @Test
    public void threeSixtyDegreeTest() {
        CalculateDegrees calculator = new CalculateDegrees(0, 60);
        assertEquals(360, calculator.getDifference());
    }


}
