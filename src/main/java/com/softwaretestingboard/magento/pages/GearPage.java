package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {

    By gear = By.xpath("//span[normalize-space()='Gear']"); // Mouse Hover on Gear Menu
    By bags = By.xpath("//span[normalize-space()='Bags']"); // Click on Bags
    By by = By.xpath("//a[normalize-space()='Overnight Duffle']"); //  Click on Product Name ‘Overnight Duffle’
    By qty = By.xpath("//input[@id='qty']"); // Change Qty 3
    By click = By.xpath("//span[normalize-space()='Add to Cart']"); // Click on ‘Add to Cart’ Button
    By textMessage = By.xpath("//div[@class='message-success success message']"); //  Verify the text "You added Overnight Duffle to your shopping cart."
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']"); // Click on ‘shopping cart’ Link into message
    By overnightDuffle = By.xpath("//td[@class='col item']//strong[@class='product-item-name']"); // Verify the product name "Overnight Duffle"
    By qtyIs3 = By.xpath("//input[@class='input-text qty']");  // Verify the Qty is "3"
    By price = By.cssSelector("td[class='col subtotal'] span[class='price']"); //  Verify the product price "$135.00"
    By qty1 = By.xpath("//input[@class='input-text qty']"); // Change Qty to ‘5’
    By clickButton = By.cssSelector("button[title='Update Shopping Cart'] span"); // Click on ‘Update Shopping Cart’ button
    By productPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']"); // Verify the product price "$225.00"

    public void mouseHoverOnGear() {
        mouseHoverToElement(gear);
    }

    public void clickOnBags() {
        mouseHoverToElementAndClick(bags);
    }

    public void clickOnOverNightDuffle() {
        clickOnElement(by);
    }

    public void changeQty() {
        driver.findElement(qty).clear();
        sendTextToElement(qty, "3");
    }

    public void clickOnAddToCart() {
        clickOnElement(click);
    }

    public String getTextVerify() {
        return getTextFromElement(textMessage);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public String verifyTheProductName() {
        return getTextFromElement(overnightDuffle);
    }

    public String verifyQuantity3() {
        return getAttributeValue(qtyIs3, "value");
    }

    public String verifyTheProductPrice() {
        return getTextFromElement(price);
    }

    public void changeQty5() {
        driver.findElement(qty1).clear();
        sendTextToElement(qty1, "5");
    }

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(clickButton);
    }

    public String verifyTheProductPriceTotal() {
        return getTextFromElement(productPrice);
    }
}
