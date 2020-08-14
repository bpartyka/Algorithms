import org.junit.Assert;
import org.junit.Test;

public class NumberOfStepsToReduceANumberToZeroTest {

    @Test
    public void test1() {

        Assert.assertEquals(6, NumberOfStepsToReduceANumberToZero.solution(14));
    }

    @Test
    public void test2() {

        Assert.assertEquals(12, NumberOfStepsToReduceANumberToZero.solution(123));
    }

    @Test
    public void test3() {

        Assert.assertEquals(4, NumberOfStepsToReduceANumberToZero.solution(8));
    }
}
