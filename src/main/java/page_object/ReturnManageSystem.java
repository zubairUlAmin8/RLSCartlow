package page_object;

import Utils.utility;
import org.openqa.selenium.support.ui.Select;
import page_factory.ReturnManageSystemElements;

import java.io.IOException;

public class ReturnManageSystem extends BasePage {
    ReturnManageSystemElements returnManageSystemElements= new ReturnManageSystemElements(getDriver());

    public boolean openRmaCheck() throws IOException {
        boolean status=false;
        String headerTextCheck= returnManageSystemElements.rmaHeader.getText();

        if(headerTextCheck.equals(utility.getValue("headerText"))){
            status=true;
        }
        return status;
    }
    public void selectRequestType(){
        Select selectRequestType= new Select(returnManageSystemElements.requestType);
        selectRequestType.selectByVisibleText("Request for Return");
    }
    public void enterOrderID() throws IOException {
        returnManageSystemElements.orderID.sendKeys(utility.getValue("orderID"));
    }

    public void enterOrderPhone() throws IOException {
        returnManageSystemElements.orderPhone.sendKeys(utility.getValue("orderPhone"));
    }

    public void enterOrderEmail() throws IOException {
        returnManageSystemElements.orderEmail.sendKeys(utility.getValue("orderEmail"));
    }
    public void clickOnSearchButton()  {
        returnManageSystemElements.searchButton.click();
    }
    public void createRequestForReturnOrder() throws IOException {
        selectRequestType();
        enterOrderID();
        enterOrderEmail();
        enterOrderPhone();
        clickOnSearchButton();
    }

}
