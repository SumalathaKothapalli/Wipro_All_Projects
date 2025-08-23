package StepDefnition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RightClickDescriptionStep {
	WebDriver driver;

	@Given("Ebay WebPage on browser")
	public void ebay_web_page_on_browser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	@When("Click on  product")
	public void click_on_product() throws InterruptedException {
		PageClass pg = new PageClass(driver);
		pg.RightClickDescription();

	}

	@Then("Product is Displayed")
	public void product_is_displayed() {
	    driver.quit();
	}
}
