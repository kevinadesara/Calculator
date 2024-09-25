import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setup() {
        calculator = new Main();
    }

    @Test
    public void testSquareRoot() {
        // Test case 1: Square root of 49
        double delta = 0.0001;
        double expected_result = 7.0;
        double result = Main.SquareRoot(49);
        Assert.assertEquals(expected_result, result, delta);

        // Test case 2: Square root of 0
        expected_result = 0.0;
        result = Main.SquareRoot(0);
        Assert.assertEquals(expected_result, result, delta);

        // Test case 3: Square root of 2.25
        expected_result = 1.5;
        result = Main.SquareRoot(2.25);
        Assert.assertEquals(expected_result, result, delta);

        // Test case 4: Square root of 1000000
        expected_result = 1000.0;
        result = Main.SquareRoot(1000000);
        Assert.assertEquals(expected_result, result, delta);
    }

    @Test
    public void testFactorial() {
        // Test case 1: Factorial of 6
        int expected_result = 720;
        int result = Main.Factorial(6);
        Assert.assertEquals(expected_result, result);

        // Test case 2: Factorial of 0
        expected_result = 1;
        result = Main.Factorial(0);
        Assert.assertEquals(expected_result, result);

        // Test case 3: Factorial of 1
        expected_result = 1;
        result = Main.Factorial(1);
        Assert.assertEquals(expected_result, result);

        // Test case 4: Factorial of 10
        expected_result = 3628800;
        result = Main.Factorial(10);
        Assert.assertEquals(expected_result, result);
    }

    @Test
    public void testNaturalLog() {
        // Test case 1: Natural log of e (Math.E)
        double delta = 0.0001;
        double expected_result = 1.0;
        double result = Main.NaturalLog(Math.E);
        Assert.assertEquals(expected_result, result, delta);

        // Test case 2: Natural log of 1
        expected_result = 0.0;
        result = Main.NaturalLog(1);
        Assert.assertEquals(expected_result, result, delta);

        // Test case 3: Natural log of 0.5
        expected_result = -0.6931;
        result = Main.NaturalLog(0.5);
        Assert.assertEquals(expected_result, result, delta);

        // Test case 4: Natural log of a negative number should throw an exception
        Assert.assertThrows(IllegalArgumentException.class, () -> Main.NaturalLog(-2));
    }

    @Test
    public void testPower() {
        // Test case 1: 3^4
        double delta = 0.0001;
        double expected_result = 81.0;
        double result = Main.Power(3, 4);
        Assert.assertEquals(expected_result, result, delta);

        // Test case 2: 7^0
        expected_result = 1.0;
        result = Main.Power(7, 0);
        Assert.assertEquals(expected_result, result, delta);

        // Test case 3: 0^3
        expected_result = 0.0;
        result = Main.Power(0, 3);
        Assert.assertEquals(expected_result, result, delta);

        // Test case 4: 0^0 (edge case)
        expected_result = 1.0;
        result = Main.Power(0, 0);
        Assert.assertEquals(expected_result, result, delta);

        // Test case 5: 2^-2
        expected_result = 0.25;
        result = Main.Power(2, -2);
        Assert.assertEquals(expected_result, result, delta);
    }
}