import org.testng.annotations.Test;

public class TestClassForJavaDemo {
    int age = 38;
    Integer ageI = new Integer(12);

    @Test
    public void doIt(){
        int result = summ(11, 13);
        System.out.println(result);
    }

    public void run(){
        System.out.println("running");
    }

    public int summ(int firstVariable, int secondVariable){
        return firstVariable+secondVariable;
    }
 }
