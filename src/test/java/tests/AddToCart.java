package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductListingPage;
import pages.ShoppingCartPage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class AddToCart extends BaseTest {


    @Test
    public void testLogin() {
        LoginPage lpage = new LoginPage(driver);
        lpage.testLogin("spree@example.com", "spree123");
        assertTrue(driver.findElement(By.linkText("My Account")).isDisplayed());
        System.out.println("Login Success");

    }

    @Test
    public void testProductListing() {
        LoginPage lpage = new LoginPage(driver);
        lpage.testLogin("spree@example.com", "spree123");
        ProductListingPage plpage = new ProductListingPage(driver);
        plpage.selectProduct("Bags", "Ruby on Rails Bag");
        assertTrue(driver.findElement(By.id("add-to-cart-button")).isDisplayed());
        System.out.println("Selected product being displayed");

    }
    @Test
    public void testProductDetails(){
        LoginPage lpage = new LoginPage(driver);
        lpage.testLogin("spree@example.com", "spree123");
        ProductListingPage plpage = new ProductListingPage(driver);
        plpage.selectProduct("Bags", "Ruby on Rails Bag");
        plpage.addToCartButton();
        assertTrue(driver.findElement(By.id("add-to-cart-button")).isDisplayed());
        System.out.println("Product added to cart successful");
    }
    @Test
    public void testShoppingCart(){
        LoginPage lpage = new LoginPage(driver);
        lpage.testLogin("spree@example.com", "spree123");
        ProductListingPage plpage = new ProductListingPage(driver);
        plpage.selectProduct("Bags", "Ruby on Rails Bag");
        plpage.addToCartButton();
        ShoppingCartPage scp = new ShoppingCartPage(driver);
        scp.CheckQuantity("1");
        scp.clickCheckOutButton();
        assertTrue(driver.findElement(By.id("add-to-cart-button")).isDisplayed());
        System.out.println("n is displayed");
    }



}













