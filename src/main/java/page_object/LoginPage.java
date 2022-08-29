package page_object;

import page_factory.LoginElements;

public class LoginPage extends BasePage{
    LoginElements loginElements= new LoginElements(getDriver());

    public void userEmailAddress(String userEmail){
        loginElements.email_address.sendKeys(userEmail);
    }

    public void userPassword(String userPassword){

        loginElements.password.sendKeys(userPassword);
    }
    public void clickContinue(){
        loginElements.Sign_in_button.click();
    }
}
