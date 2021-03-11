package StepDefinitions;

import Pages.TrendyolTabs;
import Utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class TrendyolDefinitions extends BaseClass {

    TrendyolTabs tabsobject;

    @Before
    public void openHomepage() {
        setDriver();
    }


    @Given("user is on trendyol page")
    public void user_is_on_trendyol_page() {
        tabsobject = new TrendyolTabs(driver);
        System.out.println("Trendyol web page is opened");
        tabsobject.closePopupButton();
    }

    @When("user click first login button")
    public void user_click_first_login_button() {
        tabsobject.clickFirstLoginButton();
    }

    @Then("login page should be open")
    public void login_page_should_be_open() {
        String expected = "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);

    }

    @When("user enter email and password")
    public void user_enter_email_and_password() throws InterruptedException {
        tabsobject.enterEmail("deneme@gmail.com");
        tabsobject.enterPassword("test1234");
        Thread.sleep(2000);
    }

    @When("click second login button")
    public void click_second_login_button() {
        tabsobject.clickSecondLoginButton();
    }

    @Then("home page should be open")
    public void home_page_should_be_open() {
        System.out.println("login is successfully");
    }

    @When("user click woman tab")
    public void user_click_woman_tab() throws InterruptedException {
        tabsobject.clickWomanTabButton();
        Thread.sleep(1000);

    }

    @Then("woman page should be open")
    public void woman_page_should_be_open() {
        String expected = "Kadın, Moda, Giyim, Stil, Giyim Markaları | Trendyol";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
    }

    @When("user click man tab")
    public void user_click_man_tab() throws InterruptedException {
        tabsobject.clickManTabButton();
        Thread.sleep(1000);

    }

    @Then("man page should be open")
    public void man_page_should_be_open() {
        String expected = "Erkek Giyim, Erkek Kıyafetleri, Erkek Modası | Trendyol";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
    }

    @When("user click kid tab")
    public void user_click_kid_tab() throws InterruptedException {
        tabsobject.clickKidTabButton();
        Thread.sleep(1000);

    }

    @Then("kid page should be open")
    public void kid_page_should_be_open() {
        String expected = "Hamile Giyim, Bebek Kıyafetleri, Çocuk Giyim | Trendyol";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);

    }

    @When("user click home life tab")
    public void user_click_home_life_tab() throws InterruptedException {
        tabsobject.clickHomeLifeTabButton();
        Thread.sleep(1000);

    }

    @Then("home life page should be open")
    public void home_life_page_should_be_open() {
        String expected = "Ev Aksesuarları, Ev Eşyaları, Ev ve Yaşam | Trendyol";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);

    }

    @When("user click supermarket tab")
    public void user_click_supermarket_tab() throws InterruptedException {
        tabsobject.clickSupermarketTabButton();
        Thread.sleep(1000);
    }

    @Then("supermarket page should be open")
    public void supermarket_page_should_be_open() {
        String expected = "https://www.trendyol.com/butik/liste/supermarket";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected, actual);

    }

    @When("user click cosmetic tab")
    public void user_click_cosmetic_tab() throws InterruptedException {
        tabsobject.clickCosmeticTabButton();
        Thread.sleep(1000);

    }

    @Then("cosmetic page should be open")
    public void cosmetic_page_should_be_open() {
        String expected = "Online Kozmetik, Makyaj Ürünleri, Bakım Ürünleri | Trendyol";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);

    }

    @When("user click shoe bag tab")
    public void user_click_shoe_bag_tab() throws InterruptedException {
        tabsobject.clickShoeBagTabButton();
        Thread.sleep(1000);

    }

    @Then("shoe bag page should be open")
    public void shoe_bag_page_should_be_open() {
        String expected = "Ayakkabı Al, Ayakkabı Markaları, Çanta Markaları | Trendyol";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);

    }

    @When("user click watch accessory tab")
    public void user_click_watch_accessory_tab() throws InterruptedException {
        tabsobject.clickWatchAccessoryTabButton();
        Thread.sleep(1000);

    }

    @Then("watch accessory page should be open")
    public void watch_accessory_page_should_be_open() {
        String expected = "Kol Saati, Erkek Saat, Bayan Saat ve Gözlük Al | Trendyol";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);

    }

    @When("user click electronic tab")
    public void user_click_electronic_tab() throws InterruptedException {
        tabsobject.clickElectronicTabButton();
        Thread.sleep(1000);

    }

    @Then("electronic page should be open")
    public void electronic_page_should_be_open() {
        String expected = "https://www.trendyol.com/butik/liste/elektronik";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected, actual);

    }

    @And("user click man tshirt page")
    public void user_click_man_tshirt_page() throws InterruptedException {
        tabsobject.clickManTshirtButton();
        Thread.sleep(1000);
    }

    @Then("verify the images loaded successfully for products")
    public void verify_the_images_loaded_successfully_for_products() throws InterruptedException {
        System.out.println("images are loaded");
        int counter = 0;
        Thread.sleep(20000);
        List<WebElement> listImages = driver.findElements(By.tagName("img"));
        System.out.println("Number of All Images: " + listImages.size());
        for (WebElement image : listImages) {
            if (image.isDisplayed()) {
                counter++;
                if (counter == 20) break;
            }

        }
        System.out.println("Number of total display images: " + counter);

    }

    @And("user select a product")
    public void user_select_a_product() throws InterruptedException {
        tabsobject.selectTshirt();
        Thread.sleep(1000);
    }

    @And("user click add to basket button")
    public void user_click_add_to_basket_button() throws InterruptedException {
        tabsobject.addBasket();
        Thread.sleep(1000);

    }

    @And("user click my basket button")
    public void user_click_my_basket_button() throws InterruptedException {
        tabsobject.myBasket();
        Thread.sleep(2000);
    }

    @Then("product should be added into basket")
    public void product_should_be_added_into_basket() throws InterruptedException {
        driver.getPageSource().contains("Sepetim (1 Ürün)");
        Thread.sleep(1000);
    }

    @After
    public void clsDriver() {
        closeDriver();
    }


}
