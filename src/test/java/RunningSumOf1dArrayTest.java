import org.junit.Assert;
import org.junit.Test;

public class RunningSumOf1dArrayTest {

    @Test
    public void shouldCalculed() {
        int[] result = {3, 4, 6, 16, 17};
        int[] startArray = {3, 1, 2, 10, 1};

        Assert.assertArrayEquals(result, RunningSumOf1dArray.solution(startArray));
    }
}
