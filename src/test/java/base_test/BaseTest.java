package base_test;

import Analyzer.RetryAnalyzer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utlis.DriverSetup;

public class BaseTest {
    SoftAssert soft;
    WebDriver driver;

    @Test(retryAnalyzer = RetryAnalyzer.class)
    private void openWebsite(){
        driver=DriverSetup.getDriver();
        driver.get("http://web.cartlow.net/");
//        soft.assertEquals("true", "false");
    }
    @Test
    private void myprint(){
//        soft.assertEquals("true", "true");


    }
}
