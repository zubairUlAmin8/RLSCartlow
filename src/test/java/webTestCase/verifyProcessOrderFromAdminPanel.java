package webTestCase;

import Utils.utility;
import base_test.BaseTest;
import org.testng.annotations.Test;
import page_object.AdminPanel;

import java.io.IOException;

public class verifyProcessOrderFromAdminPanel extends BaseTest {
    AdminPanel adminPanel= new AdminPanel();

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
    void checkOrders() throws IOException {
        adminPanel.goToOrders();
    }
    @Test(priority = 3)
    void searchOrder() throws IOException {
        adminPanel.enterOrderId();
        adminPanel.clickOnSearchButtonForOrderId();
    }
    @Test(priority = 4)
    void goToOrderDetails() throws IOException {
        adminPanel.clickOnOrderIdForDetails();
    }

}
