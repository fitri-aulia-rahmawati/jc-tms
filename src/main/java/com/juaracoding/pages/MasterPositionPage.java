package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPositionPage {
    private WebDriver driver;

    public MasterPositionPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Master Position']")
    WebElement menuMasterPosition;
    @FindBy(xpath = "//h4[normalize-space()='Master Position TMS']")
    WebElement txtMasterPositionTms;
    @FindBy(xpath = "//input[@id='Type_Of_Work']")
    WebElement typeOfWork;
    @FindBy(xpath = "//input[@id='Position']")
    WebElement position;
    @FindBy(xpath = "//input[@id='Standar_Wage']")
    WebElement standarWage;
    @FindBy(xpath = "//div[@class='filter-option-inner-inner']")
    WebElement statusDropdown;
    @FindBy(xpath = "//input[@aria-label='Search']")
    WebElement statusSearch;
    @FindBy(xpath = "//span[normalize-space()='ACTIVE']")
    WebElement pilihActive;
    @FindBy(xpath = "//span[normalize-space()='NON-ACTIVE']")
    WebElement pilihNonActive;
    @FindBy(xpath = "//input[@name='simpan']")
    WebElement btnSimpan;
    @FindBy(xpath = "//input[@type='search']")
    WebElement searchData;
    @FindBy(xpath = "//td[@class='dataTables_empty']")
    WebElement txtNoMatchingRecordsFound;
    @FindBy(xpath = "//td[normalize-space()='Cyber Security']")
    WebElement txtTypeOfWork;
    @FindBy(xpath = "//td[normalize-space()='ACTIVE']")
    WebElement txtActive;
    @FindBy(xpath = "//td[normalize-space()='Security Analyst']")
    WebElement txtPosition;
    @FindBy(xpath = "//td[normalize-space()='5500000']")
    WebElement txtStandarWage;
    public void clickMenuMasterPosition(){
        menuMasterPosition.click();
    }
    public void inputTypeOfWork(String typeOfWork){
        this.typeOfWork.sendKeys(typeOfWork);
    }
    public void inputPosition(String position){
        this.position.sendKeys(position);
    }
    public void inputStandarWage(String standarWage){
        this.standarWage.sendKeys(standarWage);
    }
    public void clickStatusDropdown(){
        statusDropdown.click();
    }
    public void clickActive(){
        pilihActive.click();
    }
    public void clickNonActive(){
        pilihNonActive.click();
    }
    public void clickBtnSimpan(){
        btnSimpan.click();
    }
    public void inputSearchData(String searchData){
        this.searchData.sendKeys(searchData);
    }

    public String getTxtMasterPositionTms(){
        return txtMasterPositionTms.getText();
    }
    public String getTxtTypeOfWork(){
        return txtTypeOfWork.getText();
    }
    public String getTxtStatusOfWorkActive(){
        return txtActive.getText();
    }
    public String getTxtPosition(){
        return txtPosition.getText();
    }
    public String getTxtStandarWage(){
        return txtStandarWage.getText();
    }
    public String getTxtTypeOfWorkNonActive(){
        return txtNoMatchingRecordsFound.getText();
    }
    public String getTxtNoMatchingRecordsFound(){
        return txtNoMatchingRecordsFound.getText();
    }
    public String getTextFillTypeOfWork(){
        String output = "";
        String required = typeOfWork.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }
    public String getTextFillPosition(){
        String output = "";
        String required = position.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }
    public String getTextFillStandarWage(){
        String output = "";
        String required = standarWage.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }
    public String getTextFillStatusDropdown(){
        String output = "";
        String required = statusDropdown.getAttribute("required");
        if (required.equals("true")){
            output += "Please select an item.";
        }
        System.out.println(output);
        return output;
    }
    public String getDataAlert(){
        String getAlert = driver.switchTo().alert().getText();
        return getAlert;
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void clearDataMasterPosition(){
        statusDropdown.click();
        statusSearch.sendKeys("p"+ Keys.ENTER);
        typeOfWork.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        position.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        standarWage.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
    }
}
