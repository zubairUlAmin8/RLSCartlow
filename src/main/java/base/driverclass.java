package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverclass
{
    private static WebDriver driver;
    private driverclass(){

    }
    public  static WebDriver getDriver(){
        if (driver==null){
            driver=new ChromeDriver();
        }
        return driver;
    }

}
