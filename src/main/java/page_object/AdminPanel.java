package page_object;

import Utils.utility;
import Utils.waits;
import page_factory.AdminPanelElements;

import java.io.IOException;

public class AdminPanel extends BasePage{
    AdminPanelElements adminPanelElements= new AdminPanelElements(getDriver());

    public void enterUserEmail() throws IOException {
        adminPanelElements.userEmail.sendKeys(utility.getValue("userEmailAP"));
    }
     public void enterUserPassword() throws IOException {
        adminPanelElements.userPassword.sendKeys(utility.getValue("userPasswordAP"));
    }
     public void clickOnSignInButton() {
        adminPanelElements.signInButton.click();
    }

    public void goToOrders(){
        adminPanelElements.homeButtonFromMenu.click();
        waits.clickButton(getDriver(), adminPanelElements.ordersHomeDropDownList, 30);
    }
    public void enterOrderId() throws IOException {
    adminPanelElements.orderIdInputField.sendKeys(utility.getValue("orderId"));
    }
    public void clickOnSearchButtonForOrderId(){
    adminPanelElements.searchButtonForOrderId.click();
    }
    public void clickOnOrderIdForDetails(){
        waits.clickButton(getDriver(), adminPanelElements.orderIdDetailsLinkFromTable, 30 );
    }

    public void markProcessOrder(){
        adminPanelElements.markProcessButton.click();
    }

    public void goToCatalogPage(){
        adminPanelElements.catalogButtonFromMenu.click();
        waits.clickButton(getDriver(), adminPanelElements.productsCatalogDropDownList, 30);
    }

    public void enterProductId() throws IOException {
        System.out.println(utility.getValue("productId"));
        adminPanelElements.productIdInputField.sendKeys(utility.getValue("productId"));

    }
    public void clickOnSearchButtonForProductId(){
        adminPanelElements.searchButtonForProductId.click();
    }
    public void goforRemainingPieces(){
        adminPanelElements.piecesRemainingInventoryCheck.click();
    }
}

