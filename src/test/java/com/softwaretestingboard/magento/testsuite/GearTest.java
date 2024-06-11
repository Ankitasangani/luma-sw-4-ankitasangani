package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 6.Write down the following test into ‘GearTest’ class
 * 1. userShouldAddProductSuccessFullyTo
 * ShoppinCart()
 * * Mouse Hover on Gear Menu
 * * Click on Bags
 * * Click on Product Name ‘Overnight Duffle’
 * * Verify the text ‘Overnight Duffle’
 * * Change Qty 3
 * * Click on ‘Add to Cart’ Button.
 * * Verify the text
 * <p>
 * ‘You added Overnight Duffle to your shopping cart.’
 * * Click on ‘shopping cart’ Link into
 * message
 * * Verify the product name ‘Cronus Yoga Pant’
 * * Verify the Qty is ‘3’
 * * Verify the product price ‘$135.00’
 * * Change Qty to ‘5’
 * * Click on ‘Update Shopping Cart’ button
 * * Verify the product price ‘$225.00’
 */

public class GearTest extends TestBase {

    GearPage shoppingCartPage = new GearPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        shoppingCartPage.mouseHoverOnGear();
        shoppingCartPage.clickOnBags();
        shoppingCartPage.clickOnOverNightDuffle();
        shoppingCartPage.changeQty();
        shoppingCartPage.clickOnAddToCart();

        //  Verify the text "You added Overnight Duffle to your shopping cart."
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        String actualText = shoppingCartPage.getTextVerify();
        Assert.assertEquals(actualText, expectedText, "Text didn't match!");

        shoppingCartPage.clickOnShoppingCart();
        // Verify the product name "Overnight Duffle"
        String expectedText1 = "Overnight Duffle";
        String actualText1 = shoppingCartPage.verifyTheProductName();
        Assert.assertEquals(actualText1, expectedText1, "Text didn't match!");

        // Verify the Qty is "3"
        String expectedText2 = "3";
        String actualText2 = shoppingCartPage.verifyQuantity3();
        Assert.assertEquals(actualText2, expectedText2, "Text didn't match!");

        // Verify the product price "$135.00"
        String expectedText3 = "$135.00";
        String actualText3 = shoppingCartPage.verifyTheProductPrice();
        Assert.assertEquals(actualText3, expectedText3, "Text didn't match!");

        shoppingCartPage.changeQty5();
        shoppingCartPage.clickOnUpdateShoppingCartButton();

        // Verify the product price "$225.00"
        String expectedText4 = "$225.00";
        String actualText4 = shoppingCartPage.verifyTheProductPriceTotal();
        Assert.assertEquals(actualText4, expectedText4, "Text didn't match!");

    }
}























