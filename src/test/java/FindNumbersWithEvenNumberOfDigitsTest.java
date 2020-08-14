import org.junit.Assert;
import org.junit.Test;

public class FindNumbersWithEvenNumberOfDigitsTest {


    @Test
    public void calculed() {

        int nums[] = {12, 345, 2, 6, 7896};

        Assert.assertEquals(2, FindNumbersWithEvenNumberOfDigits.solution(nums));
    }
}
