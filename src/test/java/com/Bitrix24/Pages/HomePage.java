package com.Bitrix24.Pages;

import com.Bitrix24.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[1]/div[1]/input")
    public WebElement userName;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[1]/div[2]/input")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[2]/input")
    public WebElement loginButton;

}
