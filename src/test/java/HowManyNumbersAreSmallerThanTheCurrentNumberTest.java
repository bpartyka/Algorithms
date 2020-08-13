import org.junit.Assert;
import org.junit.Test;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    @Test
    public void test1() {
        int[] input = new int[]{1, 2, 3};

        int[] output = new int[]{1, 2, 3};

        Assert.assertArrayEquals(output, HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(input));

    }
}
