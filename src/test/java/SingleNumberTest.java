import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SingleNumberTest {

    @Test
    public void shouldFindSingleNumber() {

        int[] array1 = new int[]{4, 1, 2, 1, 2};

        Assert.assertEquals(4, SingleNumber.solution(array1));
    }
}
