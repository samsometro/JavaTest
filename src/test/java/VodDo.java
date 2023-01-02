import org.testng.annotations.Test;

public class VodDo {

    @Test
    public void checkFor() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);

        }
    }
    @Test
    public void checkWile(){
        int counter = 100;
        while (counter > 0) {
        System.out.println(counter);
       counter--;

        }
    }
}
