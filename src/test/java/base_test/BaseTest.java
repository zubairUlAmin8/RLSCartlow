package base_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utlis.DriverSetup;

public class BaseTest {
    WebDriver driver;

    @Test
    private void openWebsite(){
        driver=DriverSetup.getDriver();
        driver.get("http://web.cartlow.net/");
    }
}
