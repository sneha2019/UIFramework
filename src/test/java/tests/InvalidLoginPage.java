package tests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductDetailsPage;

import static org.testng.Assert.assertTrue;


public class InvalidLoginPage extends BaseTest {

    @Test(dataProvider = "getInvalidUserNameAndPassword")

    public void testInvalidLogin(String username, String password) {
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("spree@example.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("spree123");
        driver.findElement(By.name("commit")).click();
        //assertTrue(driver.findElement(By.className("alert-error")).isDisplayed());
        //System.out.println("Login Unsuccessful");

    }

    @DataProvider(name = "getInvalidUserNameAndPassword")
    public Object[][] getInvalidUsernameAndProvider() {
        return new Object[][]
                {
                        {"spree@example.com", "invalidpassword"},
                        {"invalid@email.com", "spree123"}

                };
    }


    @Test(dataProvider = "getCategoryAndProduct")

        public void getProductAndCategory(String category, String product) {
            driver.findElement(By.linkText(category)).click();
            driver.findElement(By.linkText(product)).click();
            driver.findElement(By.id("add-to-cart-button")).click();
            assertTrue(driver.findElement(By.id("add-to-cart-button")).isDisplayed());
            System.out.println("Product: " + "Ruby on Rails Bag added into the card");
    }
    @DataProvider(name = "getCategoryAndProduct")
    public Object[][] getCategotyAndProduct() {
        return new Object[][]
                {
                        {"Bags", "Ruby on Rails Bag"},

                };
    }

}









