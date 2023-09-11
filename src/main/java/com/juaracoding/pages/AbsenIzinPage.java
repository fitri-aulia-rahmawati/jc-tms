package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenIzinPage {
    private WebDriver driver;
    public AbsenIzinPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='Absen Izin']")
    WebElement absenIzin;
    @FindBy(xpath = "//h1[normalize-space()='Absen Izin']")
    WebElement getTxtAbsenIzin;



    public void clickAbsenIzinPage(){absenIzin.click();}


    public String TxtAbsenIzin(){return getTxtAbsenIzin.getText(); }
}
