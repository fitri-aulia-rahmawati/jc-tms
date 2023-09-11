package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenOffPage {
    private WebDriver driver;
    public AbsenOffPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='Absen Off']")
    WebElement absenOff;
    @FindBy(xpath = "//h1[normalize-space()='Absen Off']")
    WebElement getTxtAbsenOff;



    public void clickAbsenOffPage(){absenOff.click();}


    public String TxtAbsenOff(){return getTxtAbsenOff.getText(); }
}
