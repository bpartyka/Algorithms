import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayTest {

    @Test
    public void shouldReturnNumberOfMaxArrays() {

        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, MaximumSubarray.solution(array));
    }
}
