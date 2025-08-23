package Sele_pacakage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException, IOException {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/automation-practice-form");
	    Thread.sleep(5000);

	    WebElement fname = driver.findElement(By.id("firstName"));
	    fname.sendKeys("Neeva");

	    WebElement lname = driver.findElement(By.id("lastName"));
	    lname.sendKeys("Sharma");

	    WebElement email = driver.findElement(By.id("userEmail"));
	    email.sendKeys("abc@gmail.com");

	    driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();

	    // mobile number
	    WebElement mono = driver.findElement(By.id("userNumber"));
	    mono.sendKeys("9876543210");

	    // date of birth - year
	    driver.findElement(By.id("dateOfBirthInput")).click();
	    WebElement year = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[1]/select"));
	    Select sel = new Select(year);
	    // sel.selectByIndex(125); // 2025
	    // sel.selectByValue("2025");
	    sel.selectByVisibleText("2025");

	    // date of birth - month
	    WebElement month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/select"));
	    Select sel1 = new Select(month);
	    // sel1.selectByValue("0"); // January
	    sel1.selectByIndex(1); // February

	    // subject
	    String[] subjects = {"Math", "phy", "Eco", "Eng"};
	    WebElement sub = driver.findElement(By.id("subjectsInput"));
	    for (String subject : subjects) {
	        sub.sendKeys(subject);
	        sub.sendKeys(Keys.ENTER);
	    }

	    // upload picture
	    WebElement img = driver.findElement(By.id("uploadPicture"));
	    img.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Selenium Tools");

	    // state
	    WebElement state = driver.findElement(By.id("react-select-3-input"));
	    state.sendKeys("NCR");
	    state.sendKeys(Keys.ENTER);

	    // city
	    WebElement city = driver.findElement(By.id("react-select-4-input"));
	    city.sendKeys("Delhi");
	    city.sendKeys(Keys.ENTER);

	    // submit button (incomplete in image, assuming click)
	    driver.findElement(By.id("submit")).click();
	    Thread.sleep(2000);
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File dest=new File("screenshot.png");
		   Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);
	}
}