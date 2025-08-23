package TestNG_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DependentTestsExample {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void login() {
        System.out.println("Login simulated");
    }

    @Test(dependsOnMethods = {"login"})
    public void searchProduct() {
        driver.get("https://www.ebay.com/");
        driver.findElement(By.id("gh-ac")).sendKeys("Laptop");
        driver.findElement(By.id("gh-btn")).click();
        System.out.println("Search performed");
    }

    @Test(dependsOnMethods = {"searchProduct"})
    public void logout() {
        System.out.println("Logout simulated");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
