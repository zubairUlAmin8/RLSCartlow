package webTestCase;

import Utils.utility;
import base_test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page_object.FrontStore;

import java.io.IOException;

public class verifyOrderProductFrontStore extends BaseTest {
    FrontStore frontStore= new FrontStore();

    @Test(priority = 1)
    void openFrontStore() throws IOException {
        basePage.loadPage(utility.getValue("productLinkFrontStore"));
    }

    @Test(priority = 2)
    void orderSubmit() throws IOException {
        frontStore.clickOnAddToCart();
        frontStore.gotoCheckoutPageCartDropDrown();
        frontStore.clickOnCheckOutButton();
        frontStore.enterUserEmailAddress();
        frontStore.enterUserPassword();
        frontStore.clickOnSignInButton();
        frontStore.clickOnCheckOutButton();

    }
}
