import org.testng.annotations.Test;

public class SecondTestClass {
    @Test
    public void doIt(){
        TestClassForJavaDemo testClassForJavaDemo = new TestClassForJavaDemo();
        System.out.println(testClassForJavaDemo.age);
        int result = testClassForJavaDemo.summ(11,11);
        System.out.println(result);
    }

}
