package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenMasukPage {
    private WebDriver driver;
    public AbsenMasukPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement laporanKegiatan;

    @FindBy(xpath = "//a[normalize-space()='Absen Masuk']")
    WebElement absenMasuk;
    @FindBy(xpath = "//input[@id='file']")
    WebElement btnUploadFile;

    @FindBy(xpath = "//div[@class='filter-option-inner']")
    WebElement dropDownNamaShift;
    @FindBy(xpath = "//input[@aria-label='Search']")
    WebElement listDropDownNama;

    @FindBy(xpath = "//select[@id='absen_type']")
    WebElement dropDownTipeAbsen;

    @FindBy(xpath = "//input[@value='Submit']")
    WebElement btnSubmit;

    @FindBy(xpath = "//h1[normalize-space()='Absen Masuk']")
    WebElement getTxtAbsenMasuk;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    WebElement getTxtAbsenDone;

    @FindBy(xpath = "//p[contains(text(),'The file you are attempting to upload is larger th')]")
    WebElement errorMessageLargerFile;

    @FindBy(xpath = "//span[@id='error_message']")
    WebElement errorWrongTypeFile;
    public void clickLaporanKegiatanPage(){laporanKegiatan.click();}
    public void clickAbsenMasukPage(){absenMasuk.click();}
    public void clickButtonUpload(){btnUploadFile.sendKeys("C:/Users/M S I/Desktop/547fdb8a-d281-41cd-bbbc-643f9c897d95.jpg");}
    public void clickButtonSubmit()  {btnSubmit.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-200)");
        DriverSingleton.delay(2);

    }

    public void largerFile(){
        btnUploadFile.sendKeys("C:/Users/M S I/Desktop/IMG_20220514_073450.jpg");
    }
    public void txtFile(){
        btnUploadFile.sendKeys("C:/Users/M S I/Desktop/-tambahkan test case negatif menamb.txt");
    }
    public void clickDropDownNamaShift(String dropDownNama){
        dropDownNamaShift.click();
        this.listDropDownNama.sendKeys(dropDownNama + Keys.ENTER);
    }
    public void clickDropDownTipeAbsen(String dropDownTipe){
        dropDownTipeAbsen.click();
        this.dropDownTipeAbsen.sendKeys(dropDownTipe + Keys.ENTER);
    }
    public String TxtAbsenMasuk(){return getTxtAbsenMasuk.getText(); }
    public String txtAbsenDone(){return getTxtAbsenDone.getText();}
    public String getTxtUploadFileRequired() {
        String outputOne = "";
        String requiredUploadFile = btnUploadFile.getAttribute("required");
        if (requiredUploadFile.equals("true")){
            outputOne += "Please select an item in the list.";
        }
        System.out.println(outputOne);
        return outputOne;
    }
    public String getTxtNamaShiftRequired() {
        String output = "";
        String requiredUploadFile = dropDownNamaShift.getAttribute("required");
        if (requiredUploadFile.equals("true")){
            output += "Please select an item in the list.";
        }
        System.out.println(output);
        return output;
    }
    public String getTxtTipeAbsenRequired() {
        String output = "";
        String requiredUploadFile = dropDownTipeAbsen.getAttribute("required");
        if (requiredUploadFile.equals("true")){
            output += "Please select an item in the list.";
        }
        System.out.println(output);
        return output;
    }
    public String txtErrorMessageLargerFile(){return errorMessageLargerFile.getText();}
    public String txtErrorWrongTypeFile(){return errorWrongTypeFile.getText();}
}
