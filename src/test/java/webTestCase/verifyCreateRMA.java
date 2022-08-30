package webTestCase;

import base_test.BaseTest;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import page_object.Dashboard;
import page_object.ReturnManageSystem;


public class verifyCreateRMA extends BaseTest {
    Dashboard dashboard= new Dashboard();
    ReturnManageSystem returnManageSystem=new ReturnManageSystem();

    @Test(priority = 1)
    void OpenRMA_Portal(){
        dashboard.openPartnerRMA();
    }
    @Test(priority = 2)
    void CheckRMA_Portal(){
        String st= getDriver().getCurrentUrl();
        System.out.println(st);
        returnManageSystem.loadPage("https://rls.cartlow.net/rms/testing-partner");
        returnManageSystem.openRmaCheck();
        String st1= getDriver().getCurrentUrl();
        System.out.println(st1);


    }
}
