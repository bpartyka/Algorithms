import org.junit.Assert;
import org.junit.Test;

public class VisitAllPointTest {


    @Test
    public void test1() {
        int [][] tab={{1,1},{3,4},{-1,0}};


        Assert.assertEquals(7, MinimumTimeVisitingAllPoints.minTimeToVisitAllPoints(tab));
    }
}
