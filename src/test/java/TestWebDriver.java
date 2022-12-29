import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestWebDriver {
    @Test
    public void runGoogle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Zbudny Chas\n");
    }

    @Test
    public void clickGmailBtn(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua");
        driver.findElement(By.xpath("//a[text()='Gmail']")).click();

    }
}
