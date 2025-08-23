package Testing_package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selenium_dev {
    WebDriver driver;
    boolean stopExecution = true;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
    }

    @Test
    public void title() {
        if (stopExecution) {
            throw new SkipException("Skipping test");
        }

        String expectedtitle = "Selenium dev";
        String actualtitle = driver.getTitle();
        boolean result = actualtitle.equals(expectedtitle);
        Assert.assertEquals(actualtitle, expectedtitle, "Title Validation failed");
        System.out.println("Expected Title: " + expectedtitle);
        System.out.println("Actual Title: " + actualtitle);
        Assert.fail("Failing title");
    }

    @Test
    public void url() {
        if (stopExecution) {
            throw new SkipException("Skipping test");
        }

        String expectedurl = "https://www.selenium.dev/";
        String actualurl = driver.getCurrentUrl();
        boolean result = actualurl.equals(expectedurl);
        Assert.assertEquals(actualurl, expectedurl, "URL Validation failed");
        System.out.println("Expected URL: " + expectedurl);
        System.out.println("Actual URL: " + actualurl);
        Assert.fail("Failing URL");

        /*
        if (result == false) {
            Assert.fail("Failing URL");
        } else {
            System.out.println("Title Validated successfully");
        }
        */
    }

    @Test(dependsOnMethods = {"title", "url"})
    public void testOnly() {
        String expectedurl = "https://www.selenium.dev/";
        String actualurl = driver.getCurrentUrl();
        boolean result = actualurl.equals(expectedurl);
        Assert.assertEquals(actualurl, expectedurl, "URL Validation failed");
        System.out.println("Expected URL: " + expectedurl);
        System.out.println("Actual URL: " + actualurl);
        Assert.fail("Failing URL");
    }

    @AfterMethod
    public void am() {
        if (driver != null) {
            driver.quit();
        }
    }
}
