import org.junit.Assert;
import org.junit.Test;

public class UglyNumberTest {

    @Test
    public void shouldReturnTrue () {

        Assert.assertEquals(true,UglyNumber.solution(8));
    }

    @Test
    public void shouldReturnFalse () {

        Assert.assertEquals(false,UglyNumber.solution(-2147483648));
    }


}
