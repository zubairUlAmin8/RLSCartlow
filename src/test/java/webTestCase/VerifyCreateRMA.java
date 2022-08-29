package webTestCase;

import base_test.BaseTest;
import org.testng.annotations.Test;
import page_object.Dashboard;

import java.util.concurrent.TimeUnit;

public class VerifyCreateRMA extends BaseTest {
    Dashboard dashboard= new Dashboard();

    @Test
    void OpenRMA_Portal()
    {
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dashboard.openPartnerRMA();
    }
}
