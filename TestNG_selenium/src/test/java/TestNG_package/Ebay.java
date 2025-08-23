package TestNG_package;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void login() throws InterruptedException {
        WebElement login = driver.findElement(By.xpath("//*[@id='gh']/nav/div[1]/span[1]/span/a"));
        login.click();
        Thread.sleep(10000);

        WebElement name = driver.findElement(By.id("userid"));
        name.sendKeys("swaroopbhyr113@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        Thread.sleep(2000);

        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("Swaroop@276");
        driver.findElement(By.id("sgnBt")).click();

        Thread.sleep(4000);
    }

    @Test(enabled = false)
    public void search() throws InterruptedException {
        driver.get("https://www.ebay.com/");
        WebElement search = driver.findElement(By.id("gh-ac"));

        String[] searches = {"watch", "phone", "laptop"};
        for (String s : searches) {
            search.sendKeys(s);
            search.sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            search = driver.findElement(By.id("gh-ac"));
            search.clear();
        }

        Thread.sleep(3000);
        driver.findElement(By.id("gh-btn")).click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
