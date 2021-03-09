import com.bridgelabz.generic.FindMax;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaxTest {

    FindMax maxOperation;

    @Before
    public void setup() {
        maxOperation = new FindMax();
    }

    @Test
    public void givenThreeIntegerNumber_AtFirstPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = maxOperation.findMax(7, 3, 5);
        Assert.assertEquals( Integer.valueOf(7),  maxInteger);
    }

    @Test
    public void givenThreeIntegerNumber_AtSecondPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = maxOperation.findMax(4, 9, 5);
        Assert.assertEquals( Integer.valueOf(9),  maxInteger);
    }

    @Test
    public void givenThreeIntegerNumber_AtThirdPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = maxOperation.findMax(2, 8, 11);
        Assert.assertEquals( Integer.valueOf(11),  maxInteger);
    }
}
