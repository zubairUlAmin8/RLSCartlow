package page_object;

import Utils.utility;
import page_factory.ReturnManageSystemElements;

import java.io.IOException;

public class ReturnManageSystem extends BasePage {
    ReturnManageSystemElements returnManageSystemElements= new ReturnManageSystemElements(getDriver());

    public boolean openRmaCheck() throws IOException {
        Boolean status=false;
        String headerTextCheck= returnManageSystemElements.rmaHeader.getText();

        if(headerTextCheck.equals(utility.getValue("headerText"))){
            status=true;
        }
        return status;
    }
}
