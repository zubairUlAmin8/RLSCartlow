package utlis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
    private static WebDriver driver;
    private DriverSetup(){
    }
    public static WebDriver getDriver(){
        if(driver==null){
            driver= new ChromeDriver();
        }
    return driver;
    }
}
