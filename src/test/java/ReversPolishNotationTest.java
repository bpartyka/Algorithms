import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ReversPolishNotationTest {
    private final String input;
    private final String output;

    public ReversPolishNotationTest(String input,String output) {
        this.input = input;
        this.output = output;

    }

    @Parameterized.Parameters
    public static Collection values() {
        return Arrays.asList(new Object[][]{
                {"4", "1 1 + 1 + 1 +"},
                {"3", "1 1 + 3 * 2 /"},
                {"1", "1 1 + 1 + 1 + 4 /"}
        });
    }

    @Test
    public void shouldCalcucateExpression() {
        assertEquals(input,
                ReversePolishNotation.solution(output));
    }
}