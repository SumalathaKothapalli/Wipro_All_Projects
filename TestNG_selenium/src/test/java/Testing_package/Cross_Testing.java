package Testing_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Cross_Testing {
	WebDriver driver;

    @Test
    public void chromebrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String actualtitle = driver.getTitle();
        AssertJUnit.assertEquals(actualtitle, expectedtitle, "Title validation fail");
        Thread.sleep(3000);
    }

    @Test
    public void edgebrowser() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", null);
        driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String actualtitle = driver.getTitle();
        AssertJUnit.assertEquals(actualtitle, expectedtitle, "Title validation fail");
        Thread.sleep(3000);
    }
    @AfterClass
    public void afterClass() {
  	  driver.quit();

    }
   
  }
