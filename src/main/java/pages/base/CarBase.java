package pages.base;

public class CarBase {
    public String getCarTitel(){
        return BasePage.getText("toyotacartitle_XPATH");
    }

    public String getUsedCarDetails(){
        new BasePage().scrollToElement("validateusedcartitel_XPATH");
        return BasePage.getText("validateusedcartitel_XPATH");
    }
}
