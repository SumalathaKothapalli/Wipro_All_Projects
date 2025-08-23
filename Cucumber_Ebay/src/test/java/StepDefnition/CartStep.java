package StepDefnition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStep {
	WebDriver driver;
	@Given("Product is searched on home page")
	public void product_is_searched_on_home_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	@When("add product to cart")
	public void add_product_to_cart() {
		PageClass pg = new PageClass(driver);
		pg.addcart();
	}

	@When("Open cart and remove product")
	public void open_cart_and_remove_product() {		
		PageClass pg = new PageClass(driver);
		pg.deletecart();
	}

	@Then("check product is deleted")
	public void check_product_is_deleted() {	
		System.out.println("Deleted Sucessfully");
		driver.close();
	}

}
