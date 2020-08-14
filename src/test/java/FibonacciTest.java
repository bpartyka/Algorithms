import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciTest {
    private final int input;
    private final int output;

    public FibonacciTest(int output, int input) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection values() {
        return Arrays.asList(new Object[][]{
                {5, 5},
                {233, 13},
                {0, 0}
        });
    }
    @Test
    public void shouldCalcucateFibonacci() {
        assertEquals(output,
                Fibonacci.solution(input));
    }

    @Test
    public void shouldReturnException() {

        Assertions.assertThrows(IllegalArgumentException.class,() -> {Fibonacci.solution(-1);});
    }
}
