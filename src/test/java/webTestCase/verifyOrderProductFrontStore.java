package webTestCase;

import Utils.utility;
import base_test.BaseTest;
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
    void orderSubmit(){
        frontStore.clickOnAddToCart();
        frontStore.gotoCheckoutpageCartDropDrown();
        frontStore.clickOnCheckOutButton();
    }
}
