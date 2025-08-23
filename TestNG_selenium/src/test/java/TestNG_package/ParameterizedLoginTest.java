package TestNG_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParameterizedLoginTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @Parameters({"username", "password"})
    public void login(String user, String pass) {
        System.out.println("Login Test with:");
        System.out.println("Username: " + user);
        System.out.println("Password: " + pass);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
