package page.object.compareCarsPage;

import pages.base.BasePage;

public class CompareCarsPage extends BasePage {
    public void clickingSelectCarFirstBox(){
        click("firatboxselectcar_XPATH");
        type("searchboxforselectcar_XPATH","Tata Nexon");
        click("nexon_XPATH");
        click("nexonvariant_XPATH");
    }

    public void clickingSelectCarSecondBox(){
        click("secondboxselectcar_XPATH");
        type("searchboxforselectcar_XPATH","Mahindra Bolero");
        click("bolero_XPATH");
        click("bolerovariant_XPATH");
    }

    public void clickingCompareButton(){
        click("comparebutton_XPATH");
    }

    public String validatingTitel(){
       return BasePage.getText("validatingcomparetitel_XPATH");
    }
}
