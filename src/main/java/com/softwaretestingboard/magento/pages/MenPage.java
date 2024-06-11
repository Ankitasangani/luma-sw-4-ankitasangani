package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    By men = By.xpath("//span[contains(text(),'Men')]"); // Mouse hover on Men menu
    By bottoms = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]"); // Mouse Hover on Bottoms
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]"); // Click on Pants
    By byCronusYogaPant = By.xpath("//a[contains(text(),'Cronus Yoga Pant')]"); // Mouse Hover on product name ‘Cronus Yoga Pant’
    By clickOnSize32 = By.id("option-label-size-143-item-175"); // click on size 32
    By clickOnBlackColour = By.id("option-label-color-93-item-49"); // click on colour black
    By clickToAddToCart = By.className("primary"); // click on ‘Add To Cart’ Button
    By textMessage = By.xpath("//div[@class='message-success success message']"); // // Verify the text "You added Cronus Yoga Pant to your shopping cart."
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']"); // Click on ‘shopping cart’ Link into message
    By shopping = By.xpath("//span[@class='base']");   // Verify the text "Shopping Cart"
    By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']"); // // Verify the product name "Cronus Yoga Pant"
    By productSize = By.xpath("//dd[contains(text(),'32')]");   // Verify the product size "32"
    By productColour = By.xpath("//dd[contains(text(),'Black')]"); // Verify the product colour "Black"

    public void mouseHoverOnMen() {
        mouseHoverToElement(men);
    }

    public void mouseHoverOnBottoms() {
        mouseHoverToElement(bottoms);
    }

    public void clickOnPants() {
        mouseHoverToElementAndClick(pants);
    }

    public void mouseHoverOnCronusYogaPantAndClickToSize() {
        mouseHoverToElement(byCronusYogaPant);
        clickOnElement(clickOnSize32);
    }

    public void mouseHoverOnCronusYogaPantAndClickToColour() {
        mouseHoverToElement(byCronusYogaPant);
        clickOnElement(clickOnBlackColour);
    }

    public void mouseHoverOnCronusYogaPantAndClickToAddToCart() {
        mouseHoverToElement(byCronusYogaPant);
        clickOnElement(clickToAddToCart);
    }

    public String getTextVerify() {
        return getTextFromElement(textMessage);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public String textVerify() {
        return getTextFromElement(shopping);
    }

    public String verifyTheProductName() {
        return getTextFromElement(cronusYogaPant);
    }

    public String verifyTheProductSize() {
        return getTextFromElement(productSize);
    }

    public String verifyTheProductColour() {
        return getTextFromElement(productColour);
    }

}
