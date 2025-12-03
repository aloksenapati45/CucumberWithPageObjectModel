package page.object.findNewCarsPage;

import page.object.BMWCarPage;
import page.object.MahindraCarPage;
import page.object.TATACarPage;
import page.object.ToyotaCarPage;
import pages.base.BasePage;

public class NewCarsPage extends BasePage {

    public TATACarPage goToTata(){
        click("tata_LINK");
        return new TATACarPage();
    }

    public void goToHyundai(){
        click("honda_LINK");
    }

    public ToyotaCarPage goToToyota(){
        click("toyota_LINK");
        return new ToyotaCarPage();
    }

    public BMWCarPage goToBMW(){
        click("bmw_LINK");
        return new BMWCarPage();
    }

    public void goToKia(){
        click("kia_LINK");
    }

    public MahindraCarPage goToMahindra(){
        click("mahindra_LINK");
        return new MahindraCarPage();
    }
}
