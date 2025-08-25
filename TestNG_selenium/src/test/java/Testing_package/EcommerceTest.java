package Testing_package;

import org.testng.Assert;
import org.testng.annotations.*;

public class EcommerceTest {
    
    // 1. Login test using @Parameters from testng.xml
    @Test
    @Parameters("username")
    public void loginWithParameters(@Optional("defaultUser")String username) {
        System.out.println("Login with parameter: " + username);
        Assert.assertNotNull(username);
    }

    // 2. Active test (enabled = true)
    @Test(enabled = true)
    public void activeTest() {
        System.out.println("Running active test case.");
    }

    // 3. Disabled test (will not run)
    @Test(enabled = false)
    public void disabledTest() {
        System.out.println("This test is disabled.");
    }

    // 4. Repeated test (runs 3 times)
    @Test(invocationCount = 3)
    public void runMultipleTimes() {
        System.out.println("This test runs multiple times.");
    }

    // 5. Dependent test cases
    @Test
    public void login() {
        System.out.println("Login successful.");
    }

    @Test(dependsOnMethods = "login")
    public void searchProduct() {
        System.out.println("Search product successful.");
    }

    @Test(dependsOnMethods = "searchProduct")
    public void logout() {
        System.out.println("Logout successful.");
    }

    // 6. Data Provider test for multiple login credentials
    @Test(dataProvider = "loginData")
    public void dataProviderLogin(String username, String password) {
        System.out.println("DataProvider login with: " + username + " / " + password);
        Assert.assertNotNull(username);
        Assert.assertNotNull(password);
    }

    @DataProvider(name = "loginData", parallel = true)
    public Object[][] loginData() {
        return new Object[][] {
            {"user1", "pass1"},
            {"user2", "pass2"},
            {"user3", "pass3"}
        };
    }

    // Optional: Setup method to simulate browser launch
    @BeforeClass
    public void setup() {
        System.out.println("Browser Opened");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Browser Closed");
    }
}
