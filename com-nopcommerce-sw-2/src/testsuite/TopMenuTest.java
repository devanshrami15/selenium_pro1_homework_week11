package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    public String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){

        driver.findElement(By.xpath("//a[@text='Computers ']")).click(); //* click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//h1[@text='Computers ']")).isDisplayed(); // * Verify the text ‘Computers’

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){

        driver.findElement(By.xpath("//a[@text='Electronics']")).click(); //* click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//h1[@text='Electronics']")).isDisplayed(); // * Verify the text ‘Electronics’
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        driver.findElement(By.xpath("//a[@text='Apparel ']")).click(); // * click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//h1[@text='Apparel']")).isDisplayed(); // * Verify the text ‘Apparel’

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        driver.findElement(By.xpath("//a[@text='Book ']")).click(); // * click on the ‘Books’ Tab
        driver.findElement(By.xpath("//h1[@text='Books']")).isDisplayed(); // * Verify the text ‘Books’
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        driver.findElement(By.xpath("//a[@text='Jewelry  ']")).click(); //* click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//h1[@text='Jewelry']")).isDisplayed(); // * Verify the text ‘Jewelry’

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        driver.findElement(By.xpath("//a[@text='Gift Cards ']")).click(); //* click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//h1[@text='Gift Cards']")).isDisplayed(); //* Verify the text ‘Gift Cards’
    }

}
