package testWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    protected WebDriver driver;


    @BeforeMethod
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    @AfterMethod(alwaysRun = true)
    public void quitDriver() {
        driver.quit();
    }

    public void openURL(String url) {
        driver.get(url);
    }

    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@name='q']"));
    }

    public WebElement getButton() {
        return driver.findElement(By.xpath("//a[text()='Gmail']"));
    }

}

