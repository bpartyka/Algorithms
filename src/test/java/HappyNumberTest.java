import org.junit.Assert;
import org.junit.Test;

public class HappyNumberTest {

    @Test
    public void shouldReturnTrueWhenNumberIsHappy() {

        Assert.assertEquals(true, HappyNumber.solution(19));

    }
}
