package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {

    WebDriver driver;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Verify Product details

    public ProductDetailsPage changeQuantity(String quantity) {
        driver.findElement(By.id("quantity")).sendKeys(quantity);
        return new ProductDetailsPage(driver);
    }

    public ShoppingCartPage addToCartButtonClick() {
        driver.findElement(By.id("add-to-cart-button")).click();
        return new ShoppingCartPage(driver);
    }
}

