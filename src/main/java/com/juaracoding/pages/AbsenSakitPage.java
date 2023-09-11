package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenSakitPage {
    private WebDriver driver;
    public AbsenSakitPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='Absen Sakit']")
    WebElement absenSakit;
    @FindBy(xpath = "//h1[normalize-space()='Absen Sakit']")
    WebElement getTxtAbsenSakit;



    public void clickAbsenSakitPage(){absenSakit.click();}


    public String TxtAbsenSakit(){return getTxtAbsenSakit.getText(); }
}
