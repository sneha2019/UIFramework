package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class AddingProductTest extends BaseTest {

    /*@Test
    public void testLogin() {

        driver.navigate().to("https://spree-vapasi.herokuapp.com");
        // driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("spree@example.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("spree123");
        driver.findElement(By.name("commit")).click();

        assertTrue(driver.findElement(By.linkText("My Account")).isDisplayed());

        WebElement myAccountElement = driver.findElement(By.linkText("My Account"));
        assertEquals("My Account", myAccountElement.getText());
    }*/

    @Test
    public void testaddProduct() {
        driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.findElement(By.linkText("Ruby on Rails Bag")).click();
        driver.findElement(By.id("add-to-cart-button")).click();

        assertTrue(driver.findElement(By.linkText("Ruby on Rails Bag")).isDisplayed());
        assertTrue(driver.findElement(By.id("content")).findElement(By.linkText("Ruby on Rails Bag")).isDisplayed());

        WebElement shoppingCart = driver.findElement(By.id("cart-detail"));
        List<WebElement> lineItems = shoppingCart.findElements(By.id("line_items"));
        System.out.println(lineItems.size());
        assertTrue(lineItems.size() == 1);

        //for (Iterator<WebElement> iterator = lineItems.iterator(); productiterator.hasNext(); ) {
        // WebElement next =  productiterator.next();

    }
}







