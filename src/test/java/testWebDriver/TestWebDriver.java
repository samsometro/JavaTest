package testWebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testWebDriver.TestInit;

public class TestWebDriver extends TestInit {

    @Test
    public void runGoogle() {
        openURL("https://www.google.com.ua");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Zbudny Chas\n");
    }

    @Test
    public void clickGmailBtn() {
        openURL("https://www.google.com.ua");
        driver.findElement(By.xpath("//a[text()='Gmail']")).click();
    }

}
