package auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class login {
    WebDriver driver;
    By emailInput= By.xpath("//input[@name='email']");
    By passwordInput= By.xpath("//input[@name='password']");
    By continueButton= By.id("kt_sign_in_submit");
    By deshboardCheck= By.xpath("//*[@id=\"#kt_aside_menu\"]/div[1]/a/span[2]");



    login(WebDriver driver){
    this.driver=driver;
    }
    void setCredential(String email, String password){
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(continueButton).click();
    }
    boolean verifLogin()
    {
        boolean check=false;
        WebElement deshboard=driver.findElement(deshboardCheck);
        String deshStr= deshboard.getText();
        if(deshStr.equals("Dashboard")){
            check=true;
        }
        return check;
    }

}
