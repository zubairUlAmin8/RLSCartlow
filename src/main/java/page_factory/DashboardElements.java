package page_factory;

import object_repo.DashboardOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardElements {
    WebDriver driver;
    public  DashboardElements(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = DashboardOR.preview_RMS)
    public WebElement preview_RMS;
}
