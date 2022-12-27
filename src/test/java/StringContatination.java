import org.testng.annotations.Test;

public class StringContatination {
    @Test
    public void TestSimpleString(){
        String sourceStr = "Hello! My name is Nikita";
        String secondStr = " Dementiev";
        String email = "samsometro@gmail.com";
        int age = 35;
        double weight = 60.5D;

//        System.out.println(sourceStr + secondStr + (age + weight));

        for(int i = sourceStr.length()-1; i >= 0; i --){
//            System.out.print(sourceStr.charAt(i));
        }
        String[] splitted = sourceStr.split(" ");
        for(String word : splitted){
            System.out.println(word);
        }
        String[] emailSplitter = email.split("@");
        System.out.println(emailSplitter[0]);

    }
}
