package page.object;

import page.object.exploreUsedCarPage.ExploreUsedCarPage;
import page.object.findNewCarsPage.NewCarsPage;
import pages.base.BasePage;

public class HomePage extends BasePage {

    public void mouseOverNewCars(){
        mouseOver("newcars_XPATH");
    }

    public void mouseOverUsedCars(){
        mouseOver("usedcars_XPATH");
    }

    public NewCarsPage clickOnFindNewCars(){
        click("findnewcars_XPATH");
        return new NewCarsPage();
    }

    public ExploreUsedCarPage clickOnFindUsedCars(){
        click("exploreusedcars_XPATH");
        return new ExploreUsedCarPage();
    }

    public void clickOnSearchCars(){

    }

}
