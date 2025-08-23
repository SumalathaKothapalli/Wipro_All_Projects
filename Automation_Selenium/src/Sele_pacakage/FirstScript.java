package Sele_pacakage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

    public static void main(String[] args) throws InterruptedException  {
		System.out.println("This is my first Automation Script");
		//setup browser (Chrome driver, firefox driver)
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium Tools\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// create object for Browser
			
		WebDriver driver=new ChromeDriver();//same for firefox
		//Set WebApplication URL
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.close();
		
    }
}