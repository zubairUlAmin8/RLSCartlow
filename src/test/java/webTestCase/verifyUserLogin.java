package webTestCase;

import Utils.utility;
import base_test.BaseTest;
import org.testng.annotations.Test;
import page_object.LoginPage;

import java.io.IOException;

public class verifyUserLogin extends BaseTest {

    LoginPage loginPage=new LoginPage();

    @Test
    public void verifyUserLogin() throws IOException {
        String userEmail= utility.getValue("UserEmail");
        String userPassword= utility.getValue("userPassword");
        loginPage.userEmailAddress(userEmail);
        loginPage.userPassword(userPassword);
        loginPage.clickContinue();

    }

}
