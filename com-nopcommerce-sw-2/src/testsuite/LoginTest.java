package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    public String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
       openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        // click on the Login link.

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        //Click on login link.
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Enter valid userName
        WebElement userName = driver.findElement(By.id("Email"));
        userName.sendKeys("Prime123@gmail.com");

        // Enter Valid Password.
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("Prime123");

        //Click on login button.
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Log in')]"));
        loginButton.click();


    }
}
