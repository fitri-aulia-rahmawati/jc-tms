package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenPulangPage {
    private WebDriver driver;
    public AbsenPulangPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='Absen Pulang']")
    WebElement absenPulang;
    @FindBy(xpath = "//h1[normalize-space()='Absen Pulang']")
    WebElement getTxtAbsenPulang;



    public void clickAbsenPulangPage(){absenPulang.click();}


    public String TxtAbsenPulang(){return getTxtAbsenPulang.getText(); }

}
