package testWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    protected WebDriver driver;


    @BeforeMethod
    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080)) ;
    }
    @AfterMethod(alwaysRun = true)
    public void quitDriver() {
        driver.quit();
    }

    public void openURL(String url){
        driver.get(url);
    }

}

