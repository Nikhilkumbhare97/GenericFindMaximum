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
    public void givenThreeIntegers_ShouldReturnMaximumValue() {
        Integer maxInteger = maxOperation.findMax(7, 3, 5);
        Assert.assertEquals(Integer.valueOf(7), maxInteger);
    }

    @Test
    public void givenThreeFloats_ShouldReturnMaximumValue() {
        Float maxFloat = maxOperation.findMax(7.4f, 8.9f, 5.5f);
        Assert.assertEquals(Float.valueOf(8.9f), maxFloat);
    }

    @Test
    public void givenThreeString_ShouldReturnMaximumValue() {
        String maxString = maxOperation.findMax("Papaya", "Apple", "WaterMelon");
        Assert.assertEquals("WaterMelon", maxString);
    }

}
