package Testing_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTest {
    WebDriver driver;

    // Locators
    By email = By.id("userid");
    By pass = By.id("pass");
    By cont = By.id("signin-continue-btn");
    By submit = By.id("sgnBt");
    By search = By.id("gh-ac");

    // Constructor
    public NewTest(WebDriver driver) {
        this.driver = driver;
    }

    public void email_in() {
        driver.findElement(email).click();
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("Ammullu663@gmail.com");
    }

    public void pass_in() {
        driver.findElement(pass).click();
        driver.findElement(pass).clear();
        driver.findElement(pass).sendKeys("Ammullu@663");
    }

    public void con_in() {
        driver.findElement(cont).click();
    }

    public void submit_in() {
        driver.findElement(submit).click();
    }

    public void search_in() {
        driver.findElement(search).click();
        driver.findElement(search).clear();
        driver.findElement(search).sendKeys("Watch");
        driver.findElement(search).submit();
    }
}
