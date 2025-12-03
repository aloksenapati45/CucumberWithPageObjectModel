package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import page.object.compareCarsPage.CompareCarsPage;
import page.object.exploreUsedCarPage.ExploreUsedCarPage;
import page.object.findNewCarsPage.NewCarsPage;
import pages.base.BasePage;
import utils.SeleniumDriver;

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

    public CompareCarsPage clickOnCompareCars() {
       /* click("comparecars_XPATH");
        return new CompareCarsPage();*/
        int attempts = 0;
        while (attempts < 3) {
            try {
                WebElement compareCars;
                compareCars = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty("comparecars_XPATH")));
                compareCars.click();
                break;
            } catch (StaleElementReferenceException e) {
                attempts++;
            }
        }
        return new CompareCarsPage();
    }
}
