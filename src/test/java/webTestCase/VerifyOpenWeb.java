package webTestCase;

import Utils.utility;
import base_test.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyOpenWeb extends BaseTest {
    @Test
    public void OpenBrowser() throws IOException {
        String url_Address= utility.getValue("url");
        basePage.loadPage(url_Address);
    }
}
