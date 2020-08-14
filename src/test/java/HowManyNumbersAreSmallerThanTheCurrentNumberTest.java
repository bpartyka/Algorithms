import org.junit.Assert;
import org.junit.Test;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    @Test
    public void test() {
        int[] input = new int[]{8, 1, 2, 2, 3};

        int[] output = new int[]{4, 0, 1, 1, 3};

        Assert.assertArrayEquals(output, HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(input));

    }
}
