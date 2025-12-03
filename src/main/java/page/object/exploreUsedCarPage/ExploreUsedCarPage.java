package page.object.exploreUsedCarPage;

import pages.base.BasePage;

public class ExploreUsedCarPage extends BasePage {
    public void goToSearchbar(String carBrand){
        type("searchbar_XPATH",carBrand);
    }

    public void goToTata(){
        scrollToElement("usedtata_XPATH");
        try {
            Thread.sleep(3000);
        }catch(Throwable t){
            t.printStackTrace();
        }
        click("usedtata_XPATH");
    }
}
