package page_object;

import page_factory.DashboardElements;

public class Dashboard extends BasePage{
    DashboardElements dashboardElements= new DashboardElements(getDriver());

    public void openPartnerRMA(){

        dashboardElements.preview_RMS.click();
    }
}
