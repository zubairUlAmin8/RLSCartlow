package base_test;
import Utils.utility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page_object.BasePage;

import java.io.IOException;

public class BaseTest{
    protected BasePage basePage=new BasePage();

    @BeforeClass
    public WebDriver getDriver(){
        return basePage.getDriver();
    }


    @AfterTest
    public void closeDriver(){
//    getDriver().close();
    }

 }


