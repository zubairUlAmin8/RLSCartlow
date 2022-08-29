package page_factory;
import object_repo.LoginPageOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {
    WebDriver driver;

    public LoginElements(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver , this);

    }
     @FindBy (name = LoginPageOR.email_address )
    public  WebElement email_address ;

    @FindBy (name = LoginPageOR.password)
    public WebElement password;

    @FindBy (id = LoginPageOR.Sign_in_button)
    public  WebElement Sign_in_button;




}
