package base_test;
import Utils.utility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page_object.BasePage;

import java.io.IOException;

public class BaseTest{
    BasePage basePage=new BasePage();

    @BeforeClass
    public WebDriver getDriver(){
        return basePage.getDriver();
    }

    @Test
    public void OpenBrowser() throws IOException {
        String url_Address= utility.getValue("url");
        basePage.loadPage(url_Address);
    }
    @AfterTest
    public void closeDriver(){
//    getDriver().close();
    }

 }


