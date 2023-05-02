package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class MyAccountLoginPage extends Utility {

    By emailAddress = By.id("input-email");
    By enterPassword = By.name("password");

    By loginButton = By.xpath("//input[@value='Login']");
    By myAccountText = By.xpath("//h2[contains(text(),'My Account')]");



    public void enterEmailAddress(){
        sendTextToElement(emailAddress,"rajuS123@gmail.com");

    }
    public void enterValidPassword(){
        sendTextToElement(enterPassword,"xyz@123");
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getMyAccountText(){
        return getTextFromElement(myAccountText);
    }
}