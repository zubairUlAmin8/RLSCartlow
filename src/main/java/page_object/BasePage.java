package page_object;

import Utils.DriverSetup;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver getDriver(){
        return DriverSetup.initDriver();
    }
    public void loadPage(String base_url){
         getDriver().get(base_url);
    }
}
