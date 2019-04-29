package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {

    WebDriver driver;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Verify Product details

    public void changeQuantity(String quantity){
    driver.findElement(By.id("quantity")).sendKeys(quantity);
    }

    public void addToCartButtonClick(){
        driver.findElement(By.id("add-to-cart-button")).click();
    }
}
