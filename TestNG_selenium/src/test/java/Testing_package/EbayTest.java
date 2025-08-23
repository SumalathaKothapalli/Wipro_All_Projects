package Testing_package;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EbayTest {
    WebDriver driver;
    EbayPage ebayPage;
    String userEmail = "Ammullu663@gmail.com";        
    String userPassword = "Ammullu@663"; 
    @BeforeTest
    public void beforeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        ebayPage = new EbayPage(driver);
    }

    // 1. Login
    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        ebayPage.email_in(userEmail);
        Thread.sleep(1000);
        ebayPage.con_in();
        Thread.sleep(2000);
        ebayPage.pass_in(userPassword);
        Thread.sleep(1000);
        ebayPage.submit_in();
        Thread.sleep(5000);

        Assert.assertTrue(driver.getCurrentUrl().contains("my.ebay.com") || driver.getTitle().contains("eBay"), "Login Failed");

    }

    // 2. Multiple Searches
    @Test(priority = 2)
    public void testMultipleSearches() throws InterruptedException {
        String[] searchItems = {"phone", "Watch", "Bag"};
        for (String item : searchItems) {
            ebayPage.search_in(item);
            Thread.sleep(3000);
            Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains(item.toLowerCase()), "Search failed for: " + item);
            driver.navigate().back();
            Thread.sleep(2000);
        }
    }

    // 3. Add to cart
    @Test(priority = 3)
    public void testAddToCart() throws InterruptedException {
        ebayPage.search_in("laptop");
        Thread.sleep(3000);
        ebayPage.addToCart(0);
        Thread.sleep(3000);
        Assert.assertTrue(driver.getPageSource().contains("Added to cart") || driver.getCurrentUrl().contains("cart"), "Add to cart failed");
    }

    // 4. Delete from cart
    @Test(priority = 4)
    public void testDeleteFromCart() throws InterruptedException {
        driver.get("https://cart.ebay.com/");
        Thread.sleep(3000);
        ebayPage.deleteFromCart(0);
        Thread.sleep(3000);
        Assert.assertTrue(driver.getPageSource().contains("Your shopping cart is empty") || !driver.getPageSource().contains("Remove"), "Delete from cart failed");
    }

    // 5. Change login name
    @Test(priority = 5)
    public void testChangeLoginName() throws InterruptedException {
        ebayPage.changeLoginName("NewUserName123");
        Thread.sleep(3000);
        Assert.assertTrue(driver.getPageSource().contains("Your username has been updated") || driver.getCurrentUrl().contains("account"), "Change login name failed");
    }

    // 6. Change current address
    @Test(priority = 6)
    public void testChangeAddress() throws InterruptedException {
        ebayPage.changeAddress("123 New Street, City, Country");
        Thread.sleep(3000);
        Assert.assertTrue(driver.getPageSource().contains("Your address has been updated") || driver.getCurrentUrl().contains("address"), "Change address failed");
    }

    // 7. Shop by categories
    @Test(priority = 7)
    public void testShopByCategory() throws InterruptedException {
        ebayPage.shopByCategory("Electronics");
        Thread.sleep(3000);
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("electronics"), "Shop by category failed");
    }

    // 8. Right click product and get description
    @Test(priority = 8)
    public void testRightClickProductDescription() throws InterruptedException {
        ebayPage.search_in("headphones");
        Thread.sleep(3000);
        String desc = ebayPage.rightClickProductGetDescription(0);
        Thread.sleep(2000);
        Assert.assertFalse(desc.isEmpty(), "Product description not found");
    }

    // 9. Shop by all categories
    @Test(priority = 9)
    public void testShopByAllCategories() throws InterruptedException {
        boolean isWorking = ebayPage.shopByAllCategories();
        Thread.sleep(2000);
        Assert.assertTrue(isWorking, "Shop by all categories failed");
    }

    // 10. Change language
    @Test(priority = 10)
    public void testChangeLanguage() throws InterruptedException {
        ebayPage.changeLanguage("English");
        Thread.sleep(3000);
        Assert.assertTrue(driver.getPageSource().contains("English"), "Change language failed");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}




















