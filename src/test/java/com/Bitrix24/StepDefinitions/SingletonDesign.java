package com.Bitrix24.StepDefinitions;

import com.Bitrix24.Pages.HomePage;
import com.Bitrix24.Utilities.Driver;
import io.cucumber.java.en.Given;

public class SingletonDesign {
        HomePage homePage = new HomePage();


    public void userisoncybertekpracticewebpage(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");


    }
}
