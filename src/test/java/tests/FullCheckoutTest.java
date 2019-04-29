package tests;

import com.sun.org.apache.xpath.internal.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class FullCheckoutTest extends BaseTest {

    @Test
    public void VerifyHomepageTitle(){
        driver.getTitle();
        System.out.println("spree");

        //String expectedTitle="spree";
        //String actualTitle= driver.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle);

    }

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
    }

    @Test
    public void checkout(){
        driver.findElement(By.id("checkout-link")).click();
        driver.findElement(By.id("order_email")).sendKeys("n.snehaa@gmail.com");
        driver.findElement(By.name("commit")).click();
    }

}

