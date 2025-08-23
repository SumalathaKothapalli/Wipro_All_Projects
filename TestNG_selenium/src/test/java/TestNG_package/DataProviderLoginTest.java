package TestNG_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class DataProviderLoginTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn");
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"testuser1", "testpass1"},
            {"testuser2", "testpass2"},
            {"testuser3", "testpass3"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        // Wait for username field and enter data
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userid")));
        email.clear();
        email.sendKeys(username);

        // Click continue
        WebElement continueBtn = driver.findElement(By.id("signin-continue-btn"));
        continueBtn.click();

        // Wait for password field
        WebElement pass = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
        pass.clear();
        pass.sendKeys(password);

        // Click Sign in
        WebElement signInBtn = driver.findElement(By.id("sgnBt"));
        signInBtn.click();

        // Optional: wait or validate some post-login element
        wait.until(ExpectedConditions.or(
            ExpectedConditions.urlContains("myebay"), // example success URL
            ExpectedConditions.presenceOfElementLocated(By.id("errf")) // example error message
        ));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
