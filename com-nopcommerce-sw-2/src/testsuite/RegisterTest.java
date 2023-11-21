package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    public String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){

        // click on Register link
        WebElement registerButton = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
        registerButton.click();

        // * Verify the text ‘Register’

        String expectedText = "Register Page";
        String actualText = driver.findElement(By.xpath("//h1[@text()='Register']")).getText();
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){

        // click on Register link
        WebElement registerButton = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
        registerButton.click();

        // * Select gender radio button
        driver.findElement(By.xpath("//input[@type='radio' and @id='gender-male']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("John");// * Enter First name
        driver.findElement(By.id("LastName")).sendKeys("David");// * Enter Last name
        driver.findElement(By.xpath("//div[@class='inputs date-of-birth']")).sendKeys("10/10/2010"); //* Select Day Month and Year
        driver.findElement(By.id("Email")).sendKeys("jdavid10@gmail.com");  //* Enter Email address
        driver.findElement(By.id("Password")).sendKeys("jhon214"); // * Enter Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("jhon214"); // * Enter Confirm password
        driver.findElement(By.id("register-button")).click(); // * Click on REGISTER button
        driver.findElement(By.xpath("//div[@class='result']//div[@text()='Your registration completed']")).isDisplayed(); //* Verify the text 'Your registration completed’
    }

}
