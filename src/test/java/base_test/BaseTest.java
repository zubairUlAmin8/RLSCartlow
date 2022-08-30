package base_test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import page_object.BasePage;


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


