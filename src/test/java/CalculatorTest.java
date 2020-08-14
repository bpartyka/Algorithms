import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private final String inputString;
    private final Double expectedResult;

    public CalculatorTest(Double expectedResult,String inputString) {
        this.expectedResult = expectedResult;
        this.inputString = inputString;

    }

    @Parameterized.Parameters
    public static Collection values() {
        return Arrays.asList(new Object[][]{
                {-5d, "2 - 3 - 4"},
                {10d, "10 * 5 / 5"},
                {13d, "2 / 2 + 3 * 4"},
                {0d, "7.7 - 3.3 - 4.4"}
        });
    }

    @Test
    public void shouldCalcucateExpression() {
        assertEquals(expectedResult,
                Calculator.evaluate(inputString));
    }
}