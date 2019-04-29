package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

    WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckOutButton(){
        driver.findElement(By.id("checkout-link")).click();
    }

    public void clickUpdateButton(){
        driver.findElement(By.id("update-button")).click();
    }

    public void clickEmptyCartButton() {
        driver.findElement(By.xpath("clear_cart_link")).click();
    }

    public void CheckQuantity(String s){
    driver.findElement(By.id("order_line_items_attributes_0_quantity")).getAttribute("Value");
    }

    }


