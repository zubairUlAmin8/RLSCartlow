package auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class login {
    WebDriver driver;
    By emailInput= By.xpath("//input[@name='email']");
    By passwordInput= By.xpath("//input[@name='password']");
    By continueButton= By.id("kt_sign_in_submit");


    login(WebDriver driver){
    this.driver=driver;
    }
    void setCredential(String email, String password){
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(continueButton).click();
    }


}
