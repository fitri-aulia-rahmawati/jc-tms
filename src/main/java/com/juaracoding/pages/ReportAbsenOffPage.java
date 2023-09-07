package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ReportAbsenOffPage {
    private WebDriver driver;

    public ReportAbsenOffPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Report Absen']")
    WebElement reportAbsenMenu;

    @FindBy(xpath = "//a[normalize-space()='Absen Off']")
    WebElement absenOffMenu;

    @FindBy(xpath = "//div[contains(text(),'-- Position --')]")
    WebElement ddPosition;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
    WebElement inputDd;

    @FindBy(xpath = "//div[contains(text(),'-- Branch --')]")
    WebElement ddBranch;

    @FindBy(xpath = "//div[contains(text(),'-- Unit --')]")
    WebElement ddUnit;

    @FindBy(xpath = "//input[@id='datepicker']")
    WebElement startDatePicker;

    @FindBy(xpath = "//input[@id='datepicker2']")
    WebElement endDatePicker;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement btnExport;

    public void reportAbsen(){
        reportAbsenMenu.click();
    }

    public void absenOff(){
        absenOffMenu.click();
    }

    public void positionDd(){
        ddPosition.click();
    }

    public void ddField(String inputSearch){
        this.inputDd.sendKeys(inputSearch+ Keys.ENTER);
    }

    public void branchDd(){
        ddBranch.click();
    }

    public void unitDd(){
        ddUnit.click();
    }

    public void startDate(String inputStartDate){
        startDatePicker.sendKeys(inputStartDate + Keys.ENTER);
    }

    public void endDate(String inputEndDate){
        endDatePicker.sendKeys(inputEndDate + Keys.ENTER);
    }

    public void exportBtn(){
        btnExport.click();
    }

    public String  alert(){
        return driver.switchTo().alert().getText();
    }

    public void alertClick(){
        driver.switchTo().alert().accept();
    }
}
