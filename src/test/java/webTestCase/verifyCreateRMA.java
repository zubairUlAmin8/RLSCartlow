package webTestCase;

import base_test.BaseTest;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_object.Dashboard;
import page_object.ReturnManageSystem;

import java.io.IOException;


public class verifyCreateRMA extends BaseTest {
    Dashboard dashboard= new Dashboard();
    ReturnManageSystem returnManageSystem=new ReturnManageSystem();
    @Test(priority = 1)
    void OpenRMA_Portal(){
        dashboard.openPartnerRMA_ByLink();
    }
    @Test(priority = 2)
    void CheckRMA_Portal() throws IOException {
        Boolean check=returnManageSystem.openRmaCheck();
        Assert.assertTrue(check);
    }

    @Test (priority = 3)
    void selectRequestType() throws IOException {
        returnManageSystem.createRequestForReturnOrder();
    }
}
