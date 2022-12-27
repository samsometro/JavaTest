import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void checkFactorial(){
        Assert.assertTrue(factorial(2) == 2);
        Assert.assertTrue(factorial(3) == 6);
        Assert.assertTrue(factorial(4) == 24);
        Assert.assertTrue(factorial(1) == 1);
        Assert.assertTrue(factorial(0) == 1);
    }
    public int factorial(int numm){
        int result = 1;

        if(numm == 1 || numm == 0){
            return result;
        }
        int[] array = new int[numm];

        for(int i = numm; i > 0; i--){
            array[i-1] = i;
        }
        for (int ellementInArr : array){
            result = result*ellementInArr;
        }
        return result;
    }
}
