package Sele_pacakage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Login {
	public static void LoginStep(WebDriver driver, String user1, String pass1, String testexecution) throws InterruptedException {
        System.out.println("Manual test --> " + testexecution);

        WebElement user = driver.findElement(By.name("username"));
        user.click();
        user.sendKeys(user1);

        WebElement pass = driver.findElement(By.name("password"));
        pass.click();
        pass.sendKeys(pass1);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(3000);

        // Navigate back to login page for next test data
        driver.navigate().refresh();
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        LoginStep(driver, "865645", "admin123", "Unable to login");
        LoginStep(driver, "Admin", "98786745", "Unable to login");
        LoginStep(driver, "8656jhfjd", "ngdj56465", "Unable to login");
        LoginStep(driver, "", "", "Unable to login");
        LoginStep(driver, "Admin", "admin123", "user is able to login successfully");

        // Loop through the list and call loginStep()

        driver.close();
    }
}
