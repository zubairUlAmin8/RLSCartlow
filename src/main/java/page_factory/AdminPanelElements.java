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


}
