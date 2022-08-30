package page_object;

import page_factory.ReturnManageSystemElements;

public class ReturnManageSystem extends BasePage {
    ReturnManageSystemElements returnManageSystemElements= new ReturnManageSystemElements(getDriver());

    public void openRmaCheck(){
       String st= returnManageSystemElements.rmaHeader.getAccessibleName();
        System.out.println(st);
    }
}
