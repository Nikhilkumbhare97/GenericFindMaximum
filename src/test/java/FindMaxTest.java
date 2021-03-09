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
    public void givenThreeIntegers_AtFirstPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = maxOperation.findMaxInt(7, 3, 5);
        Assert.assertEquals(Integer.valueOf(7), maxInteger);
    }

    @Test
    public void givenThreeIntegers_AtSecondPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = maxOperation.findMaxInt(4, 9, 5);
        Assert.assertEquals(Integer.valueOf(9), maxInteger);
    }

    @Test
    public void givenThreeIntegers_AtThirdPosition_ShouldReturnMaximumValue() {
        Integer maxInteger = maxOperation.findMaxInt(2, 8, 11);
        Assert.assertEquals(Integer.valueOf(11), maxInteger);
    }

    @Test
    public void givenThreeFloats_AtFirstPosition_ShouldReturnMaximumValue() {
        Float maxFloat = maxOperation.findMaxFloat(7.4f, 3.1f, 5.5f);
        Assert.assertEquals(Float.valueOf(7.4f), maxFloat);
    }

    @Test
    public void givenThreeFloats_AtSecondPosition_ShouldReturnMaximumValue() {
        Float maxFloat = maxOperation.findMaxFloat(4.5f, 9.2f, 5.8f);
        Assert.assertEquals(Float.valueOf(9.2f), maxFloat);
    }

    @Test
    public void givenThreeFloats_AtThirdPosition_ShouldReturnMaximumValue() {
        Float maxFloat = maxOperation.findMaxFloat(2.5f, 8.2f, 11.8f);
        Assert.assertEquals(Float.valueOf(11.8f), maxFloat);
    }
}
