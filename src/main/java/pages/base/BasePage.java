package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.SeleniumDriver;

public class BasePage {
    public static WebDriver driver;
    public static CarBase carBase;
    private WebElement mouseOverElement;

    public BasePage(){
        driver = SeleniumDriver.getDriver();
        carBase = new CarBase();
    }

    public void mouseOver(String Locator){
        if(Locator.endsWith("_XPATH")){
            mouseOverElement = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(Locator)));
        }else if(Locator.endsWith("_CSS")){
            mouseOverElement = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(Locator)));
        }else if(Locator.endsWith("_ID")){
            mouseOverElement = driver.findElement(By.id(SeleniumDriver.OR.getProperty(Locator)));
        }else if(Locator.endsWith("_NAME")){
            mouseOverElement = driver.findElement(By.name(SeleniumDriver.OR.getProperty(Locator)));
        }else if(Locator.endsWith("_LINKTEXT")){
            mouseOverElement = driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(Locator)));
        }else if(Locator.endsWith("_PARTIALLINKTEXT")){
            mouseOverElement = driver.findElement(By.partialLinkText(SeleniumDriver.OR.getProperty(Locator)));
        }

        new Actions(driver).moveToElement(mouseOverElement).perform();
    }

    public void click(String Locator){
        if(Locator.endsWith("_XPATH")){
            driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(Locator))).click();
        }else if(Locator.endsWith("_CSS")){
            driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(Locator))).click();
        }else if(Locator.endsWith("_ID")){
            driver.findElement(By.id(SeleniumDriver.OR.getProperty(Locator))).click();
        }else if(Locator.endsWith("_NAME")){
            driver.findElement(By.name(SeleniumDriver.OR.getProperty(Locator))).click();
        }else if(Locator.endsWith("_LINK")){
            driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(Locator))).click();
        }else if(Locator.endsWith("_PARTIALLINKTEXT")){
            driver.findElement(By.partialLinkText(SeleniumDriver.OR.getProperty(Locator))).click();
        }
    }

    public static String getText(String Locator){
        if(Locator.endsWith("_XPATH")){
            Locator = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(Locator))).getText();
        }else if(Locator.endsWith("_CSS")){
            Locator = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(Locator))).getText();
        }else if(Locator.endsWith("_ID")){
            Locator =driver.findElement(By.id(SeleniumDriver.OR.getProperty(Locator))).getText();
        }else if(Locator.endsWith("_NAME")){
            Locator =driver.findElement(By.name(SeleniumDriver.OR.getProperty(Locator))).getText();
        }else if(Locator.endsWith("_LINK")){
            Locator =driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(Locator))).getText();
        }else if(Locator.endsWith("_PARTIALLINKTEXT")){
            Locator =driver.findElement(By.partialLinkText(SeleniumDriver.OR.getProperty(Locator))).getText();
        }
        return Locator;
    }


    public boolean isElementPresent(String Locator){
        try {
            if (Locator.endsWith("_XPATH")) {
                driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(Locator)));
            } else if (Locator.endsWith("_CSS")) {
                driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(Locator)));
            } else if (Locator.endsWith("_ID")) {
                driver.findElement(By.id(SeleniumDriver.OR.getProperty(Locator)));
            } else if (Locator.endsWith("_NAME")) {
                driver.findElement(By.name(SeleniumDriver.OR.getProperty(Locator)));
            } else if (Locator.endsWith("_LINKTEXT")) {
                driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(Locator)));
            } else if (Locator.endsWith("_PARTIALLINKTEXT")) {
                driver.findElement(By.partialLinkText(SeleniumDriver.OR.getProperty(Locator)));
            }
            return true;
        }catch (Throwable t){
            return false;
        }
    }

    public void type(String Locator,String value){
        if(Locator.endsWith("_XPATH")){
            driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(Locator))).sendKeys(value);
        }else if(Locator.endsWith("_CSS")){
            driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(Locator))).sendKeys(value);
        }else if(Locator.endsWith("_ID")){
            driver.findElement(By.id(SeleniumDriver.OR.getProperty(Locator))).sendKeys(value);
        }else if(Locator.endsWith("_NAME")){
            driver.findElement(By.name(SeleniumDriver.OR.getProperty(Locator))).sendKeys(value);
        }else if(Locator.endsWith("_LINKTEXT")){
            driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(Locator))).sendKeys(value);
        }else if(Locator.endsWith("_PARTIALLINKTEXT")){
            driver.findElement(By.partialLinkText(SeleniumDriver.OR.getProperty(Locator))).sendKeys(value);
        }
    }
}
