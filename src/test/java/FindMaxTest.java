import com.bridgelabz.generic.FindMax;
import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest {

    FindMax maxOperation = new FindMax();

    @Test
    public void givenThreeIntegerNumber_ShouldReturnMaximumValue() {
        Integer[] intNum = {6, 2, 1, 11, 20};
        maxOperation = new FindMax();
        Integer maxInteger = maxOperation.findMax(intNum);
        maxOperation.printMax(maxInteger);
        Assert.assertEquals(Integer.valueOf(20), maxInteger);
    }

    @Test
    public void givenThreeFloatNumber_ShouldReturnMaximumValue() {
        Float[] floatNum = {6.1f, 2.8f, 4.6f, 1.1f, 9.8f};
        maxOperation = new FindMax();
        Float maxFloat = maxOperation.findMax(floatNum);
        maxOperation.printMax(maxFloat);
        Assert.assertEquals(Float.valueOf(9.8f), maxFloat);
    }

    @Test
    public void givenThreeStrings_ShouldReturnMaximumString() {
        String[] string = {" apple", " watermelon ", " orange "};
        maxOperation = new FindMax();
        String maxString = maxOperation.findMax(string);
        maxOperation.printMax(maxString);
        Assert.assertEquals(" watermelon ", maxString);
    }

}
