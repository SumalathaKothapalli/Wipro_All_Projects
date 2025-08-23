package Testing_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class EbayPage {
    WebDriver driver;
    // Locators
    By email = By.id("userid");
    By pass = By.id("pass");
    By cont = By.id("signin-continue-btn");
    By submit = By.id("sgnBt");
    By search = By.id("gh-ac");
    By cartIcon = By.id("gh-cart-n");
    By addToCartButtons = By.xpath("//button[contains(text(),'Add to cart')]");
    By removeFromCartButtons = By.xpath("//button[contains(text(),'Remove') or contains(text(),'Delete')]");
    By loginName = By.cssSelector(".gh-ug-fl");
    By accountMenu = By.linkText("My eBay");
    By accountSettings = By.linkText("Account");
    By addressLink = By.linkText("Addresses");
    By categoriesMenu = By.id("gh-shop-a");
    By allCategoriesLink = By.linkText("Shop by category");
    By allCategoriesItems = By.cssSelector(".hl-cat-nav__js-tab a");
    By languageSettings = By.id("gh-eb-Geo-a-default");

    public EbayPage(WebDriver driver) {
        this.driver = driver;
    }

    // Login
    public void email_in(String emailId) {
        WebElement e = driver.findElement(email);
        e.clear();
        e.sendKeys(emailId);
    }

    public void pass_in(String password) {
        WebElement p = driver.findElement(pass);
        p.clear();
        p.sendKeys(password);
    }

    public void con_in() {
        driver.findElement(cont).click();
    }

    public void submit_in() {
        driver.findElement(submit).click();
    }

    // Search
    public void search_in(String text) {
        WebElement s = driver.findElement(search);
        s.clear();
        s.sendKeys(text);
        s.submit();
    }

    // Add to cart by index 
    public void addToCart(int index) {
        List<WebElement> addButtons = driver.findElements(addToCartButtons);
        if (addButtons.size() > index) {
            addButtons.get(index).click();
        }
    }

    // Delete from cart by index
    public void deleteFromCart(int index) {
        List<WebElement> removeButtons = driver.findElements(removeFromCartButtons);
        if (removeButtons.size() > index) {
            removeButtons.get(index).click();
        }
    }

    // Change login name 
    public void changeLoginName(String newName) {
        driver.findElement(accountMenu).click();
        driver.findElement(accountSettings).click();
        WebElement nameField = driver.findElement(By.id("new-username"));
        nameField.clear();
        nameField.sendKeys(newName);
        driver.findElement(By.id("save-username")).click();
    }

    // Change current address - (simplified)
    public void changeAddress(String newAddress) {
        driver.findElement(accountMenu).click();
        driver.findElement(addressLink).click();
        WebElement addrField = driver.findElement(By.id("address1")); 
        addrField.clear();
        addrField.sendKeys(newAddress);
        driver.findElement(By.id("save-address")).click();
    }

    // Shop by categories by name
    public void shopByCategory(String categoryName) {
        driver.findElement(categoriesMenu).click();
        driver.findElement(By.linkText(categoryName)).click();
    }

    // Right-click product image and get description text by index
    public String rightClickProductGetDescription(int index) {
        List<WebElement> products = driver.findElements(By.cssSelector(".s-item"));
        if (products.size() > index) {
            WebElement product = products.get(index);
            WebElement image = product.findElement(By.cssSelector(".s-item__image-img"));
            Actions actions = new Actions(driver);
            actions.contextClick(image).perform();

            WebElement desc = product.findElement(By.cssSelector(".s-item__subtitle"));
            return desc.getText();
        }
        return "";
    }

    // Shop by all categories and return if items found
    public boolean shopByAllCategories() {
        driver.findElement(allCategoriesLink).click();
        List<WebElement> items = driver.findElements(allCategoriesItems);
        return items.size() > 0;
    }

    // Change language setting
    public void changeLanguage(String languageName) {
        driver.findElement(languageSettings).click();
        driver.findElement(By.linkText(languageName)).click();
    }

}
