package TestNG_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class RepeatedTestExample {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
    }

    @Test(invocationCount = 2)
    public void repeatSearch() throws InterruptedException {
        System.out.println("Running search test multiple times.");
        Thread.sleep(2000);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
