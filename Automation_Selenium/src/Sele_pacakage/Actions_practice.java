package Sele_pacakage;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Actions_practice {

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://demoqa.com/buttons");
	        Thread.sleep(3000);

	        Actions act = new Actions(driver);

	        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
	        act.doubleClick(doubleClickBtn).perform();

	        Thread.sleep(2000);

	        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
	        act.contextClick(rightClickBtn).perform();

	        Thread.sleep(3000);

	        driver.get("https://www.ebay.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);

	        WebElement motors = driver.findElement(By.xpath("//*[@id='vl-flyout-nav']/ul/li[4]/a"));
	        act.moveToElement(motors).perform();

	        Thread.sleep(3000);

	        WebElement sports = driver.findElement(By.xpath("//*[@id='vl-flyout-nav']/ul/li[7]/a"));
	        act.moveToElement(sports).perform();

	        Thread.sleep(3000);

	        driver.quit();
	    }
	}
