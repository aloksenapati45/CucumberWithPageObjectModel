package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page.object.HomePage;
import page.object.NewCarsPage;
import page.object.ToyotaCarPage;
import pages.base.BasePage;
import utils.SeleniumDriver;

public class CarWaleSteps {

    HomePage page = new HomePage();
    NewCarsPage car;
    ToyotaCarPage toyota;


    @Given("user navigates to a carwale.com website")
    public void user_navigates_to_a_carwale_com_website() {
        SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testurlsite"));
    }
    @When("user mouseover to a newcars")
    public void user_mouseover_to_a_newcars() {
        page.mouseOverNewCars();
    }
    @Then("user clicks on a find new cars")
    public void user_clicks_on_a_find_new_cars() {
        car = page.clickOnFindNewCars();
    }
    @And("user clicks on a {string} car")
    public void user_clicks_on_a_car(String carBrand) {
        if(carBrand.equals("Toyota")) {
            toyota = car.goToToyota();
        }else if(carBrand.equals("Kia")) {
            car.goToKia();
        }else if(carBrand.equals("BMW")) {
            car.goToBMW();
        }else if(carBrand.equals("Honda")){
            car.goToHyundai();
        }
    }
    @And("user vslidates car titel as {string}")
    public void user_vslidates_car_titel(String carTitel) {
        Assert.assertTrue(BasePage.carBase.getCarTitel().equals(carTitel));
    }

}
