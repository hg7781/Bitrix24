package com.Bitrix24.Pages;

import com.Bitrix24.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage {
    public DownloadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
}
@FindBy(xpath = "//a[@href='download/some-file.txt']")
   public WebElement FileDownload;
}
