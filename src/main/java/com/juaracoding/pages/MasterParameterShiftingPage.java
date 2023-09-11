package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.interfaces.XECPrivateKey;

public class MasterParameterShiftingPage {
    private WebDriver driver;

    public MasterParameterShiftingPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Master']")
    WebElement menuMaster;
    @FindBy(xpath = "//a[normalize-space()='Parameter Shifting']")
    WebElement menuParameterShifting;
    @FindBy(xpath = "//h4[@class='panel-title']")
    WebElement txtParameterShifting;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement btnTambah;

    @FindBy(xpath = "//div[@class='filter-option-inner-inner']")
    WebElement unitDropdown;
    @FindBy(xpath = "//span[normalize-space()='SDM']")
    WebElement pilihUnit;
    @FindBy(xpath = "//small[normalize-space()='The Unit field is required.']")
    WebElement txtUnitRequired;
    @FindBy(xpath = "//input[@id='shift_name']")
    WebElement namaShift;
    @FindBy(xpath = "//small[normalize-space()='The Nama Shift field is required.']")
    WebElement txtNamaShiftRequired;
    @FindBy(xpath = "//input[@id='jam_mulai']")
    WebElement jamMulai;
    @FindBy(xpath = "//small[normalize-space()='The Jam Mulai field is required.']")
    WebElement txtJamMulaiRequired;
    @FindBy(xpath = "//input[@id='jam_selesai']")
    WebElement jamSelesai;
    @FindBy(xpath = "//small[normalize-space()='The Jam Selesai field is required.']")
    WebElement txtJamSelesaiRequired;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSubmit;
    @FindBy(xpath = "//strong[normalize-space()='Success!']")
    WebElement txtSuccess;
    @FindBy(xpath = "//input[@aria-label='Search']")
    WebElement dropDownSearch;
    @FindBy(xpath = "//a[normalize-space()='Back']")
    WebElement btnBack;
    @FindBy(xpath = "//input[@type='search']")
    WebElement searchShift;
    @FindBy(xpath = "//td[@class='dataTables_empty']")
    WebElement txtNoMatchingRecordsFound;
    @FindBy(xpath = "//td[normalize-space()='SDM']")
    WebElement txtUnit;
    @FindBy(xpath = "//td[normalize-space()='Shift Malam']")
    WebElement txtNamaShift;
    @FindBy(xpath = "//tbody/tr[2]/td[4]")
    WebElement txtJamMulai;
    @FindBy(xpath = "//tbody/tr[5]/td[4]")
    WebElement txtJamSelesai;

    public void clickMenuMaster(){
        menuMaster.click();
    }
    public void clickMenuParameterShifting(){
        menuParameterShifting.click();
    }
    public void clickBtnTambah(){
        btnTambah.click();
    }

    public void clickUnitDropdown(){
        unitDropdown.click();
    }
    public void clickPilihUnit(){
        pilihUnit.click();
    }
    public void inputNamaShift(String namaShift){
        this.namaShift.sendKeys(namaShift);
    }
    public void inputJamMulai(String jamMulai){
        this.jamMulai.sendKeys(jamMulai);
    }
    public void inputJamSelesai(String jamSelesai){
        this.jamSelesai.sendKeys(jamSelesai);
    }
    public void clickBtnSubmit(){
        btnSubmit.click();
    }
    public void clickBtnBack(){
        btnBack.click();
    }
    public void inputSearchShift(String searchShift){
        this.searchShift.sendKeys(searchShift);
    }

    public String getTxtParameterShifting(){
        return txtParameterShifting.getText();
    }
    public String getTxtSuccess(){
        return txtSuccess.getText();
    }
    public String getTxtUnitRequired(){
        return txtUnitRequired.getText();
    }
    public String getTxtNamaShiftRequired(){
        return txtNamaShiftRequired.getText();
    }
    public String getTxtJamMulaiRequired(){
        return txtJamMulaiRequired.getText();
    }
    public String getTxtJamSelesaiRequired(){
        return txtJamSelesaiRequired.getText();
    }
    public String getTxtNoMatchingRecordsFound(){
        return txtNoMatchingRecordsFound.getText();
    }
    public String getTxtUnit(){
        return txtUnit.getText();
    }
    public String getTxtNamaShift(){
        return txtNamaShift.getText();
    }
    public String getTxtJamMulai(){
        return txtJamMulai.getText();
    }
    public String getTxtJamSelesai(){
        return txtJamSelesai.getText();
    }

    public void clearData(){
        unitDropdown.click();
        dropDownSearch.sendKeys("p"+ Keys.ENTER);
        namaShift.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        jamMulai.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        jamSelesai.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
    }
}
