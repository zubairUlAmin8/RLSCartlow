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
    void addToCart(){
        frontStore.clickOnAddToCart();

    }
    @Test(priority = 3)
    void viewCartItems(){
        frontStore.viewCartItemsItemsDropDown();
    }
    @Test(priority = 4)
    void checkOut(){
        frontStore.clickOnCheckOutButton();
    }
    @Test(priority = 5)
    void userLogin() throws IOException {
        frontStore.enterUserEmailAddress();
        frontStore.enterUserPassword();
        frontStore.clickOnSignInButton();
    }
    @Test(priority = 6)
    void checkOutAfterLogin(){
        frontStore.clickOnCheckOutButton();
    }
    @Test(priority = 7)
    void selectCashOnDelivery(){
        frontStore.cashOnDeliveryRadioSelect();
    }
    @Test(priority = 8)
    void placeOrder(){
        frontStore.placeOrderButton();
    }
}
