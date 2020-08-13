
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatingFactorialWitoutRecuretionTest {
    private final int inputNumber;
    private final int expectedResult;

    public CalculatingFactorialWitoutRecuretionTest(int inputNumber, int expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {2, 2},
                {6, 720},
                {10, 3628800},
                {3, 6}
        });
    }

    @Test
    public void testPrimeNumberChecker() {
        assertEquals(expectedResult,
                SilniaBezRekurencji.solution(inputNumber));
    }
}