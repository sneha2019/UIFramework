package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.sql.rowset.BaseRowSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class SimpleLoginTest extends BaseTest {

    @Test
    public void testLogin(){

        driver.navigate().to("https://spree-vapasi.herokuapp.com");
        // driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("spree@example.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("spree123");
        driver.findElement(By.name("commit")).click();

        assertTrue(driver.findElement(By.linkText("My Account")).isDisplayed());

        WebElement myAccountElement = driver.findElement(By.linkText("My Account"));
        assertEquals("My Account", myAccountElement.getText());
    }

}