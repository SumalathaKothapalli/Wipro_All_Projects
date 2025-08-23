/*package Sele_pacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerobank_login {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        System.out.println("Welcome to zero bank login page");
        {
        	System.out.println("Manual test::-->Check user is able to login with valid credentials");
        }
        //locating username text field 
        driver.findElement(By.id("user_login")).click();
        driver.findElement(By.id("user_login")).sendKeys("username");
        //locating password text field
        driver.findElement(By.id("user_password")).click();
        driver.findElement(By.id("user_password")).sendKeys("password");
         
       //clicking on signin button
        driver.findElement(By.name("submit")).click();
        System.out.println("Login successfully");
        
        Thread.sleep(5000);
        driver.close();
        
        

    }
}*/




/*package Sele_pacakage;
 
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Zerobank_login {
 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to Zero bank Login page");
		
		{
			System.out.println("Manual test::-->Check user is unable to login with "
					+ "invalid username and valid password credentials");
		}
		//locating username text field
		
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("8875675");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		// click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfully");
		
		{
			System.out.println("Manual test::-->Check user is unable to login with "
					+ "valid username and invalid password credentials");
		}
		//locating username text field
		//driver.get("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("jhal86765");
		
		// click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfully");
		
		{
			System.out.println("Manual test::-->Check user is unable to login with "
					+ "invalid username and invalid password credentials");
		}
		//locating username text field
		//driver.get("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("8875675");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("987534");
		
		// click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfully");
		
		{
			System.out.println("Manual test::-->Check user is unable to login with null credentials");
		}
		//locating username text field
		//driver.get("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("");
		
		// click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfully");
		{
			System.out.println("Manual test::-->Check user is able to login with "
					+ "valid username and valid password ");
		}
		//locating username text field
		//driver.get("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		// click on signin button
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.id("logout_link"));
		System.out.println("Login successfully");
		
		driver.close();
		
 
	}
 
}*/





package Sele_pacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerobank_login {

    public static void LoginStep(WebDriver driver, String username, String password, String testDescription) throws InterruptedException {
        System.out.println("Manual test: " + testDescription);

        try {
            // Locate username field
            WebElement user = driver.findElement(By.id("user_login"));
            user.clear();
            user.sendKeys(username);

            // Locate password field
            WebElement pass = driver.findElement(By.id("user_password"));
            pass.clear();
            pass.sendKeys(password);

            // Click on sign-in button
            driver.findElement(By.name("submit")).click();

            // Wait for 5 seconds (not recommended for production; use WebDriverWait instead)
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver executable if required
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("http://zero.webappsecurity.com/login.html");
        System.out.println("Welcome to Zero Bank Login Page");

        // Run different login scenarios
        LoginStep(driver, "865645", "password", "Unable to login.");
        LoginStep(driver, "user123", "09829137", "Unable to login.");
        LoginStep(driver, "865647635", "2492ghj32g", "Unable to login.");
        LoginStep(driver, null, null, "Blank input test");
        LoginStep(driver, "username", "password", "User is able to login successfully");

        // Close the browser after tests
        driver.quit();
    }
}







 
 
