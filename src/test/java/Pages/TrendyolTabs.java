package Pages;

import Utils.BaseClass;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class TrendyolTabs extends BaseClass {
    WebDriver driver;

    public TrendyolTabs(WebDriver driver) {
        this.driver = driver;
    }

    By btn_closepopup = By.xpath("/html/body/div[6]/div/div/a");
    By btn_firstlogin = By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]/div[2]/div/div[1]");
    By txt_email = By.id("login-email");
    By txt_password = By.id("login-password-input");
    By btn_secondlogin = By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button/span");
    By btn_womantab = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[1]/a");
    By btn_mantab = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[2]/a");
    By btn_kidtab = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[3]/a");
    By btn_homelife = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[4]/a");
    By btn_supermarket = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[5]/a");
    By btn_cosmetic = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[6]/a");
    By btn_shoebag = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[7]/a");
    By btn_watchaccessory = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[8]/a");
    By btn_electronic = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[9]/a");
    By btn_mantshirt = By.xpath("//*[@id=\"sub-nav-2\"]/div/div/div[1]/div/ul/li[1]/a");
    By select_tshirt = By.xpath("//*[@id=\"search-app\"]/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/a/div[1]/div/img");
    By btn_addbasket = By.xpath("//div[contains(@class,'add-to-bs-wrp')]");
    By btn_mybasket = By.xpath("//*[@id=\"account-navigation-container\"]/div/div[2]/a/p");

    public void clickFirstLoginButton() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]/p"));
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
        act.click();
        driver.findElement(btn_firstlogin).click();

    }

    public void enterEmail(String email) {


        driver.findElement(txt_email).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickSecondLoginButton() {
        driver.findElement(btn_secondlogin).click();
    }

    public void clickWomanTabButton() {
        driver.findElement(btn_womantab).click();
    }

    public void clickManTabButton() {
        driver.findElement(btn_mantab).click();
    }

    public void clickKidTabButton() {
        driver.findElement(btn_kidtab).click();
    }

    public void clickHomeLifeTabButton() {
        driver.findElement(btn_homelife).click();
    }

    public void clickSupermarketTabButton() {
        driver.findElement(btn_supermarket).click();
    }

    public void clickCosmeticTabButton() {
        driver.findElement(btn_cosmetic).click();
    }

    public void clickShoeBagTabButton() {
        driver.findElement(btn_shoebag).click();
    }

    public void clickWatchAccessoryTabButton() {
        driver.findElement(btn_watchaccessory).click();
    }

    public void clickElectronicTabButton() {
        driver.findElement(btn_electronic).click();
    }

    public void clickManTshirtButton() {

        WebElement element = driver.findElement(btn_mantab);
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
        act.click();
        driver.findElement(btn_mantshirt).click();
    }

    public void selectTshirt() {
        List<WebElement> els = driver.findElements(select_tshirt);
        els.get(0).click();

    }

    public void addBasket() {
        ArrayList<String> AllTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(AllTabs.get(1));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0 , 250)");
        driver.findElement(btn_addbasket).click();
        js.executeScript("window.scrollBy(0 , -250)");

    }


    public void myBasket() {
        driver.findElement(btn_mybasket).click();
    }


    public void closePopupButton() {
        driver.findElement(btn_closepopup).click();
    }

}
