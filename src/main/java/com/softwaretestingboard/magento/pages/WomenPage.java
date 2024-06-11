package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
    By women = By.xpath("//span[contains(text(),'Women')]"); // Mouse hover on women menu
    By tops = By.xpath("//a[@id='ui-id-9']"); // Mouse Hover on Tops
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]"); // Click on Jackets
    By by = By.id("sorter"); // Select Sort By filter “Product Name”
    By beforeFilter = By.xpath("//a[@class='product-item-link']"); // before filter product name
    By afterFilter = By.xpath("//strong[@class='product name product-item-name']//a"); // Store elements after filtering
    By byPrice = By.id("sorter"); // Select Sort By filter “Price”
    By beforePrice = By.xpath("//span[@class='price-wrapper ']//span[@class='price']"); // before filter price
    By afterPrice = By.xpath("//span[@class='price-wrapper ']//span[@class='price']"); // after filter price


    public void mouseHoverOnWomen() {
        mouseHoverToElement(women);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(tops);
    }

    public void clickOnJacket() {
        mouseHoverToElementAndClick(jackets);
    }

    public void selectSortByFilter() {
        selectByVisibleTextFromDropDown(by, "Product Name");
    }

    public List<String> beforeFilterProductName() throws InterruptedException {
        List<WebElement> elements = getMultipleElements(beforeFilter);
        //Create arraylist
        List<String> beforeFilterProductNamesList = new ArrayList<>();
        //Store elements text to array list
        for (WebElement p : elements) {
            beforeFilterProductNamesList.add(p.getText());
        }
        //Sort arraylist to ascending order
        Collections.sort(beforeFilterProductNamesList);
        return beforeFilterProductNamesList;
    }

    public List<String> afterFilterProductName() {
        //Store elements after filtering
        List<WebElement> afterFilterProductNames = getMultipleElements(afterFilter);
        //Create another list to store text of elements after clicking on filter Z to A
        List<String> afterFilterProductNamesList = new ArrayList<>();
        for (WebElement s : afterFilterProductNames) {
            afterFilterProductNamesList.add(s.getText());
        }
        return afterFilterProductNamesList;
    }


    public void sortByPriceFilter() {
        selectByVisibleTextFromDropDown(byPrice, "Price");
    }

    public List<Double> beforeFilterProductPrice() throws InterruptedException {
        List<WebElement> beforeFilterProductPrice = getMultipleElements(beforePrice);
        //Create arraylist
        List<Double> beforeFilterProductPriceList = new ArrayList<>();
        //Store elements text to array list
        for (WebElement p : beforeFilterProductPrice) {
            String beforeFilterPrice = p.getText().replaceAll("[E,x,T,a,x,£,:,$]", "").replace(",", "");
            Double priceValueBeforeFilter = Double.parseDouble(beforeFilterPrice);
            beforeFilterProductPriceList.add(priceValueBeforeFilter);
        }
        //Sort arraylist to ascending order
        Collections.sort(beforeFilterProductPriceList);
        return beforeFilterProductPriceList;
    }

    public List<Double> afterFilterProductPrice() {
        //Store elements after filtering
        List<WebElement> afterFilterProductPrice = getMultipleElements(afterPrice);
        //Create another list to store text of elements after clicking on filter Price high to low
        List<Double> afterFilterProductPriceList = new ArrayList<>();
        for (WebElement s : afterFilterProductPrice) {
            String afterFilterPrice = s.getText().replaceAll("[E,x,T,a,x,£,:,$]", "").replace(",", "");
            Double afterFilterPriceValue = Double.parseDouble(afterFilterPrice);
            afterFilterProductPriceList.add(afterFilterPriceValue);
        }
        return afterFilterProductPriceList;
    }

}
