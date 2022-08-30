package page_object;

import page_factory.DashboardElements;

public class Dashboard extends BasePage{
    DashboardElements dashboardElements= new DashboardElements(getDriver());

    public void openPartnerRMA_ByLink(){
        String rma_link= dashboardElements.preview_RMS.getAttribute("href");
        loadPage(rma_link);
    }
    public void openRatnerRMA_ByClick(){
        dashboardElements.preview_RMS.click();
    }
}
