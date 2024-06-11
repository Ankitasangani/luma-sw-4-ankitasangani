package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Write down the following test into WomenTestclass
 * 1. verifyTheSortByProductNameFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click on Jackets
 * * Select Sort By filter “Product Name”
 * * Verify the products name display in
 * alphabetical order
 * 2. verifyTheSortByPriceFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click on Jackets
 * * Select Sort By filter “Price”
 * * Verify the products price display in
 * Low to High
 */

public class WomenTest extends TestBase {

    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        womenPage.mouseHoverOnWomen();
        womenPage.mouseHoverOnTops();
        womenPage.clickOnJacket();
        womenPage.selectSortByFilter();

        // Verify the products name display in alphabetical order
        List<String> actualText = womenPage.beforeFilterProductName();
        womenPage.selectSortByFilter();
        Thread.sleep(2000);
        List<String> expectedText = womenPage.afterFilterProductName();
        Assert.assertEquals(actualText, expectedText, "Text didn't match!");

    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        womenPage.mouseHoverOnWomen();
        womenPage.mouseHoverOnTops();
        womenPage.clickOnJacket();
        womenPage.sortByPriceFilter();

        // Verify the products price display in Low to High
        List<Double> actualText = womenPage.beforeFilterProductPrice();
        womenPage.sortByPriceFilter();
        Thread.sleep(2000);
        List<Double> expectedText = womenPage.afterFilterProductPrice();
        Assert.assertEquals(actualText, expectedText, "Text didn't match!");

    }
}
