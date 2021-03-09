import com.bridgelabz.generic.FindMax;
import org.junit.Assert;
//import org.junit.Before;
import org.junit.Test;

public class FindMaxTest {

    FindMax maxOperation;
/*
    @Before
    public void setup() {
        maxOperation = new FindMax();
    }
*/
    @Test
    public void givenThreeIntegers_ShouldReturnMaximumValue() {
        maxOperation = new FindMax(7, 3, 5);
        Integer maxInteger = (Integer) maxOperation.maxFind();
        Assert.assertEquals(Integer.valueOf(7), maxInteger);
    }

    @Test
    public void givenThreeFloats_ShouldReturnMaximumValue() {
        maxOperation = new FindMax(7.4f, 8.9f, 5.5f);
        Float maxFloat = (Float) maxOperation.maxFind();
        Assert.assertEquals(Float.valueOf(8.9f), maxFloat);
    }

    @Test
    public void givenThreeString_ShouldReturnMaximumValue() {
        maxOperation = new FindMax("Papaya", "Apple", "WaterMelon");
        String maxString = (String) maxOperation.maxFind();
        Assert.assertEquals("WaterMelon", maxString);
    }

}
