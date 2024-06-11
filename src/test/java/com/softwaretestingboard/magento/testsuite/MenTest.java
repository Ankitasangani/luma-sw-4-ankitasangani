package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Write down the following test into ‘MenTest’
 * class
 * 1. userShouldAddProductSuccessFullyTo
 * ShoppinCart()
 * * Mouse Hover on Men Menu
 * * Mouse Hover on Bottoms
 * * Click on Pants
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on size
 * 32.
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on colour
 * Black.
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on
 * ‘Add To Cart’ Button.
 * * Verify the text
 * ‘You added Cronus Yoga Pant to your shopping cart.’
 * * Click on ‘shopping cart’ Link into
 * message
 * * Verify the text ‘Shopping Cart.’
 * * Verify the product name ‘Cronus Yoga Pant’
 * * Verify the product size ‘32’
 * * Verify the product colour ‘Black’
 */

public class MenTest extends TestBase {
    MenPage productPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        productPage.mouseHoverOnMen();
        productPage.mouseHoverOnBottoms();
        productPage.clickOnPants();
        productPage.mouseHoverOnCronusYogaPantAndClickToSize();
        productPage.mouseHoverOnCronusYogaPantAndClickToColour();
        productPage.mouseHoverOnCronusYogaPantAndClickToAddToCart();

        // Verify the text "You added Cronus Yoga Pant to your shopping cart."
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = productPage.getTextVerify();
        Assert.assertEquals(actualText, expectedText, "Text didn't match!");

        productPage.clickOnShoppingCart();
        // Verify the text "Shopping Cart"
        String expectedResult = "Shopping Cart";
        String actualResult = productPage.textVerify();
        Assert.assertEquals(actualResult, expectedResult, "Text didn't match!");

        // Verify the product name "Cronus Yoga Pant"
        String expectedText1 = "Cronus Yoga Pant";
        String actualText1 = productPage.verifyTheProductName();
        Assert.assertEquals(actualText1, expectedText1, "Text didn't match!");

        // Verify the product size "32"
        String expectedText2 = "32";
        String actualText2 = productPage.verifyTheProductSize();
        Assert.assertEquals(actualText2, expectedText2, "Text didn't match!");

        // Verify the product colour "Black"
        String expectedText3 = "Black";
        String actualText3 = productPage.verifyTheProductColour();
        Assert.assertEquals(actualText3, expectedText3, "Text didn't match!");

    }
}
