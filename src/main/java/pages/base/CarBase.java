package pages.base;

public class CarBase {
    public String getCarTitel(){
        return BasePage.getText("toyotacartitle_XPATH");
    }
}
