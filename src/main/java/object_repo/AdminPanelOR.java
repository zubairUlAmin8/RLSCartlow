package object_repo;

public class AdminPanelOR {
    public static final String userEmail="email"; //id
    public static final String userPassword="password"; //id
    public static final String signInButton="//button[@type='submit']"; //id

    public static final String homeButtonFromMenu="//a[contains(text(), ' Home') and @id='dropdown01']"; //xpath


    //home
    public static final String ordersHomeDropDownList="//*[@id=\"navbarsExampleDefault\"]/ul[3]/li/div/a[5]"; //xpath

    public static final String orderIdInputField="//input[@name='orderID']"; //xpath

    public static final String searchButtonForOrderId="//button[@type='submit']"; //xpath

    public static final String orderIdDetailsLinkFromTable="//td[3]//a"; //xpath

    public static final String markProcessButton="//*[@id=\"home\"]/div/div/div[1]/div/a[2]"; //xpath

    //Catalog
    public static final String catalogButtonFromMenu="//a[contains(text(), ' Catalog') and @id='dropdown01']"; //xpath
    public static final String productsCatalogDropDownList="//*[@id=\"navbarsExampleDefault\"]/ul[5]/li/div/a[4]"; //xpath
    public static final String productIdInputField="//input[@id='id']"; //xpath
    public static final String searchButtonForProductId="//*[@id=\"searchForm\"]/div[4]/div/button"; //xpath
    public static final String piecesRemainingInventoryCheck="//tbody//td[9]/a"; //xpath

}