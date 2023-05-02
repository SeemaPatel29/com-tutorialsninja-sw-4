package com.tutorialsninja.pages;
/*
* /*1. create class "TopMenuTest"
        1.1 create method with name "selectMenu" it has one parameter name "menu" of type
        string
        1.2 This method should click on the menu whatever name is passed as parameter.*/

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By mouseHoverDesktop = By.linkText("Desktops");
    By mouseHoverLaptopsAndNotebooks = By.linkText("Laptops & Notebooks");
    By mouseHoverComponents = By.linkText("Components");
    By desktopText = By.xpath("//h2[contains(text(),'Desktops')]");
    By laptopNotebookText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    public void mouseHoverAndClickDesktops() {
        mouseHoverToElementAndClick(mouseHoverDesktop);
    }
    public void mouseHoverAndClickLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(mouseHoverLaptopsAndNotebooks);
    }
    public void mouseHoverAndClickComponents(){
        mouseHoverToElementAndClick(mouseHoverComponents);
    }
    public void selectMenu(String menu) {
        try {
            List<WebElement> list = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
            for (WebElement listOfElement : list) {
                if (listOfElement.getText().equals(menu)) {
                    listOfElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> list = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }

    }
    public String getDesktopText(){
        return getTextFromElement(desktopText);
    }

    public String getLaptopsNotebooksText(){
        return getTextFromElement(laptopNotebookText);
    }
    public String getComponents(){
        return getTextFromElement(componentsText);
    }
}
