package webTestCase;

import Utils.CaptureScreenshoot;
import Utils.utility;
import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_object.AdminPanel;

import java.io.IOException;

public class verifyProcessOrderFromAdminPanel extends BaseTest {
    AdminPanel adminPanel = new AdminPanel();

    @Test(priority = 1)
    void openAdminPanel() throws IOException {
        basePage.loadPage(utility.getValue("adminPanelUrl"));
    }

    @Test(priority = 1)
    void signInToAdminPanel() throws IOException {
        adminPanel.enterUserEmail();
        adminPanel.enterUserPassword();
        adminPanel.clickOnSignInButton();

    }

    @Test(priority = 2)
    void checkOrders() {
        adminPanel.goToOrders();
    }

    @Test(priority = 3)
    void searchOrder() throws IOException {
        adminPanel.enterOrderId();
        adminPanel.clickOnSearchButtonForOrderId();
    }

    @Test(priority = 4)
    void goToOrderDetails() {
        adminPanel.clickOnOrderIdForDetails();
    }

    @Test(priority = 5)
    void markProcessOrder() {
        adminPanel.markProcessOrder();
    }

    @Test(priority = 6)
    void goToCatalogProduct() {
        adminPanel.goToCatalogPage();
    }

    @Test(priority = 7)
    void searchProductAgainstProductId() throws IOException {
        adminPanel.enterProductId();
        adminPanel.clickOnSearchButtonForProductId();
    }

    @Test(priority = 8)
    void goForRemainingPieces() throws IOException {
        adminPanel.goforRemainingPieces();
    }

    @Test(priority = 9)
    void MarkingAsShipped() throws IOException {
        adminPanel.goToOrders();
        adminPanel.enterOrderId();
        adminPanel.clickOnSearchButtonForOrderId();
        adminPanel.clickOnOrderIdForDetails();
//        adminPanel.goToShippingTab();
//        adminPanel.enterLineIdForShipping();
//        adminPanel.clickOnPackItems();
//        adminPanel.markAsShipped();

    }

    @Test(priority = 10)
    void updateTrackingOrderDetails() throws IOException {
//        adminPanel.goToTrackingTab();
//        adminPanel.fillTrackingForm();

    }
    @Test(priority =11)
    void shipOrder() throws IOException {
        adminPanel.shipOrder();
    }
    @Test(priority = 12)
    void markedAsShipped() throws IOException, InterruptedException {
        adminPanel.goToOrders();
        adminPanel.enterOrderId();
        adminPanel.clickOnSearchButtonForOrderId();
        adminPanel.clickOnOrderIdForDetails();
        adminPanel.markAsDelivered();
    }


}




