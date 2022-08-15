package auth;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginTest {

    WebDriver driver;
    login loginObj;


    @Test
    @Parameters({"email", "password"})
    public void login(String email, String password) {

    loginObj =new login(driver);
    loginObj.setCredential(email,password);
    }
    @BeforeClass
    @Parameters("url")
    public void beforeClass(String url) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(url);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
