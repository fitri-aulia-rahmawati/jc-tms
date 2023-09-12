package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4_AbsenSakit {
    private WebDriver driver;

    public Page4_AbsenSakit() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Report Absen']")
    WebElement reportAbsen;

    @FindBy(xpath = "//a[normalize-space()='Absen Sakit']")
    WebElement absenSakit;

//    delay(5);

    @FindBy(xpath = "//button[@title='-- Position --']//div[@class='filter-option-inner']")
    WebElement dropDownPosition;
    @FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
    WebElement listDropDownPosition;
    @FindBy(xpath = "//button[@title='-- Branch --']//div[@class='filter-option']")
    WebElement dropDownBranch;
    @FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
    WebElement listDropDownBranch;
    @FindBy(xpath = "//button[@title='-- Unit --']//div[@class='filter-option-inner']")
    WebElement dropDownUnit;
    @FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
    WebElement listDropDownUnit;
    @FindBy(xpath = "//input[@id='datepicker']")
    WebElement inputStartDate;
    @FindBy(xpath = "//input[@id='datepicker2']")
    WebElement inputEndDate;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement clickExportData;

    public void clickReportAbsen() {
        reportAbsen.click();
    }

    public void clickAbsenSakit() {
        absenSakit.click();
    }

    public void clickDropDownPosition() {
        dropDownPosition.click();
    }

    public void listDropDownPosition(String listdropDownPosition) {
        listDropDownPosition.sendKeys(listdropDownPosition + Keys.ENTER);
    }

    public void clickDropDownBranch() {
        dropDownBranch.click();
    }

    public void listDropDownBranch(String listdropDownBranch) {
        listDropDownBranch.sendKeys(listdropDownBranch + Keys.ENTER);
    }

    public void clickDropDownUnit() {
        dropDownUnit.click();
    }

    public void listDropDownUnit(String listdropDownUnit) {
        listDropDownUnit.sendKeys(listdropDownUnit + Keys.ENTER);
    }

    public void inputStartDate(String startDate) {
        inputStartDate.sendKeys(startDate + Keys.ENTER);
    }

    public void inputEndDate(String endDate) {
        inputEndDate.sendKeys(endDate + Keys.ENTER);
    }

    public void clickExportData() {
        clickExportData.click();
    }

//    public static void delay(long detik) {
//        try {
//            Thread.sleep(detik * 5000); // untuk delay close selama 3detik
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
