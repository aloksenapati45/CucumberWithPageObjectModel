package page.object;

import pages.base.BasePage;

public class HomePage extends BasePage {

    public void mouseOverNewCars(){
        mouseOver("newcars_XPATH");
    }

    public NewCarsPage clickOnFindNewCars(){
        click("findnewcars_XPATH");
        return new NewCarsPage();
    }

    public void clickOnFindUsedCars(){

    }

    public void clickOnSearchCars(){

    }

}
