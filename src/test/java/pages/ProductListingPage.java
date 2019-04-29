package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListingPage {

    WebDriver driver;

    public ProductListingPage(WebDriver driver) {
        this.driver = driver;
    }

    //Select category and product
    public void selectProduct(String category, String product) {
        driver.findElement(By.linkText(category)).click();
        driver.findElement(By.linkText(product)).click();
    }

    public void addToCartButton() {
        driver.findElement(By.id("add-to-cart-button")).click();
    }
}