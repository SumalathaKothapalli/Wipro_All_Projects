package TestNG_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DisabledTestExample {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void openHomePage() {
        System.out.println("eBay homepage opened.");
    }

    @Test(enabled = false)
    public void disabledTest() {
        System.out.println("This test is disabled and will not run.");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
