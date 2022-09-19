package page_factory;

import object_repo.AdminPanelOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanelElements {
    WebDriver driver;
    public AdminPanelElements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id= AdminPanelOR.userEmail)
    public WebElement userEmail;

    @FindBy(id= AdminPanelOR.userPassword)
    public WebElement userPassword;

    @FindBy(xpath= AdminPanelOR.signInButton)
    public WebElement signInButton;

    @FindBy(xpath= AdminPanelOR.homeButtonFromMenu)
    public WebElement homeButtonFromMenu;

    @FindBy(xpath= AdminPanelOR.ordersHomeDropDownList)
    public WebElement ordersHomeDropDownList;

    @FindBy(xpath= AdminPanelOR.orderIdInputField)
    public WebElement orderIdInputField;

    @FindBy(xpath= AdminPanelOR.searchButtonForOrderId)
    public WebElement searchButtonForOrderId;

    @FindBy(xpath= AdminPanelOR.orderIdDetailsLinkFromTable)
    public WebElement orderIdDetailsLinkFromTable;

    @FindBy(xpath= AdminPanelOR.markProcessButton)
    public WebElement markProcessButton;

    @FindBy(xpath= AdminPanelOR.catalogButtonFromMenu)
    public WebElement catalogButtonFromMenu;

    @FindBy(xpath= AdminPanelOR.productsCatalogDropDownList)
    public WebElement productsCatalogDropDownList;

    @FindBy(xpath= AdminPanelOR.productIdInputField)
    public WebElement productIdInputField;

    @FindBy(xpath= AdminPanelOR.searchButtonForProductId)
    public WebElement searchButtonForProductId;

    @FindBy(xpath= AdminPanelOR.piecesRemainingInventoryCheck)
        public WebElement piecesRemainingInventoryCheck;

    @FindBy(css= AdminPanelOR.trackingTab)
        public WebElement trackingTab;
    @FindBy(xpath= AdminPanelOR.inputFileForLineID)
        public WebElement inputFileForLineID;

    @FindBy(xpath= AdminPanelOR.packItemButton)
        public WebElement packItemButton;

    @FindBy(css= AdminPanelOR.shippingTab)
        public WebElement shippingTab;

    @FindBy(xpath= AdminPanelOR.markAsShippedButton)
        public WebElement markAsShippedButton;
    @FindBy(xpath= AdminPanelOR.trackingIdInputField)
        public WebElement trackingIdInputField;
    @FindBy(xpath= AdminPanelOR.shippingMethodInputField)
        public WebElement shippingMethodInputField;
    @FindBy(xpath= AdminPanelOR.piecesInputField)
        public WebElement piecesInputField;
    @FindBy(xpath= AdminPanelOR.updateTrackingButton)
        public WebElement updateTrackingButton;
    @FindBy(xpath= AdminPanelOR.selectCourierList)
        public WebElement selectCourierList;




}
