package testWebDriver;

import org.testng.annotations.Test;

public class TestWebDriver extends TestInit {

    @Test
    public void runGoogle() {
        openURL("https://www.google.com.ua");
        getSearchField().sendKeys("Zbudny Chas\n");
    }

    @Test
    public void clickGmailBtn() {
        openURL("https://www.google.com.ua");
        getButton().click();
    }

}
