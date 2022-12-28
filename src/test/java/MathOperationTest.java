import org.testng.Assert;
import org.testng.annotations.Test;

public class MathOperationTest {
    MathOperation mathOperation = new MathOperation();


    @Test
    public void checkSumm() {
        int result = mathOperation.summ(4, 5);
        Assert.assertEquals(result, 9);
        System.out.println(result);
    }

    @Test
    public void checkMult() {
        int result = mathOperation.mult(15, 2);
        Assert.assertEquals(result, 30);
        System.out.println(result);
    }
}
