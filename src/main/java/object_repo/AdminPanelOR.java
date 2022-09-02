package object_repo;

public class AdminPanelOR {
    public static final String userEmail="email"; //id
    public static final String userPassword="password"; //id
    public static final String signInButton="//button[@type='submit']"; //id

    public static final String homeButtonFromMenu="//a[contains(text(), ' Home') and @id='dropdown01']"; //xpath

    public static final String ordersHomeDropDownList="//*[@id=\"navbarsExampleDefault\"]/ul[3]/li/div/a[5]"; //xpath

    public static final String orderIdInputField="//input[@name='orderID']"; //xpath

    public static final String searchButtonForOrderId="//button[@type='submit']"; //xpath

    public static final String orderIdDetailsLinkFromTable="//td[3]//a"; //xpath

}