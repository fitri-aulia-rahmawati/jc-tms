package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterUnitKerjaPenempatanPage {
    private WebDriver driver;

    public MasterUnitKerjaPenempatanPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://dev.ptdika.com/tiket/wpu/master_wpu']")
    WebElement menuUnitKerjaPenempatan;
    @FindBy(xpath = "//h4[normalize-space()='Master Unit Kerja Penempatan']")
    WebElement txtUnitKerjaPenempatan;
    @FindBy(xpath = "//input[@id='Work_Placement_Unit']")
    WebElement workPlacement;
    @FindBy(xpath = "//input[@id='Branch_Code']")
    WebElement branchCode;
    @FindBy(xpath = "//input[@id='Rcc_Code']")
    WebElement rccCode;
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
    @FindBy(xpath = "//td[normalize-space()='1354']")
    WebElement btnUnitActive;
    @FindBy(xpath = "//td[normalize-space()='1355']")
    WebElement btnUnitNonActive;
    @FindBy(xpath = "//td[normalize-space()='3112']")
    WebElement txtBranchCode;
    @FindBy(xpath = "//td[normalize-space()='987']")
    WebElement txtRccCode;
    @FindBy(xpath = "//td[@class='dataTables_empty']")
    WebElement txtNoMatchingRecordsFound;
    public void clickMenuUnitKerjaPenempatan(){
        menuUnitKerjaPenempatan.click();
    }
    public void inputWorkPlacement(String workPlacement){
        this.workPlacement.sendKeys(workPlacement);
    }
    public void inputBranchCode(String branchCode){
        this.branchCode.sendKeys(branchCode);
    }
    public void inputRccCode(String rccCode){
        this.rccCode.sendKeys(rccCode);
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
    public void clickBtnActive(){
        btnUnitActive.click();
    }
    public void clickBtnNonActive(){
        btnUnitNonActive.click();
    }

    public String getTxtUnitKerjaPenempatan(){
        return txtUnitKerjaPenempatan.getText();
    }
    public String getTxtUnitKerjaActive(){
        return pilihActive.getText();
    }
    public String getTxtBranchCode(){
        return txtBranchCode.getText();
    }
    public String getTxtRccCode(){
        return txtRccCode.getText();
    }
    public String getTxtUnitKerjaNonActive(){
        return pilihNonActive.getText();
    }
    public String getTxtNoMatchingRecordsFound(){
        return txtNoMatchingRecordsFound.getText();
    }
    public String getTextFillWorkPlacement(){
        String output = "";
        String required = workPlacement.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }
    public String getTextFillBranchCode(){
        String output = "";
        String required = branchCode.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }
    public String getTextFillRccCode(){
        String output = "";
        String required = rccCode.getAttribute("required");
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
    public void clearDataMasterUnitKerja(){
        statusDropdown.click();
        statusSearch.sendKeys("p"+ Keys.ENTER);
        workPlacement.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        branchCode.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        rccCode.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
    }
}
