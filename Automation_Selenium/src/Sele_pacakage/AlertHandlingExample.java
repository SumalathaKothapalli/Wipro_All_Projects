package Sele_pacakage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://example.com"); // Replace with your actual test site

        // Sample alert (accept)
        WebElement samplealert = driver.findElement(By.id("alertButton"));
        samplealert.click();
        Thread.sleep(4000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // Confirmation alert (dismiss)
        WebElement confirmalert = driver.findElement(By.id("confirmButton"));
        confirmalert.click();
        Thread.sleep(4000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        WebElement timealert = driver.findElement(By.id("timerAlertButton"));
        timealert.click();
        Thread.sleep(7000);
        Alert alert12 = driver.switchTo().alert();
        alert12.accept();

        Thread.sleep(3000);
        WebElement confirmalert1 = driver.findElement(By.id("confirmButton"));
        confirmalert1.click();
        Thread.sleep(4000);
        Alert alert11 = driver.switchTo().alert();
        alert11.dismiss();

        Thread.sleep(3000);
        WebElement promptalert = driver.findElement(By.id("promptButton"));
        promptalert.click();
        Thread.sleep(4000);
        Alert alert111 = driver.switchTo().alert();
        alert111.sendKeys("Harry");
        alert111.accept();
    }
}
        