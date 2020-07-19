package com.Bitrix24.StepDefinitions;

import com.Bitrix24.Pages.DownloadPage;
import com.Bitrix24.Pages.HomePage;
import com.Bitrix24.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDef {
    HomePage homePage = new HomePage();
    DownloadPage downloadPage = new DownloadPage();


@Given("user is on cybertek practice webpage")
    public void userisoncybertekpracticewebpage(){
    Driver.getDriver().get("http://practice.cybertekschool.com/");


}

    @Then("user click on file download link")
    public void userClickOnFileDownloadLink() {
        homePage.fileDownloadLink.click();
    }

    @Then("user clicks on file download")
    public void userClicksOnFileDownload() {
        downloadPage.FileDownload.click();
    }
    }

