package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagemenDivisi {
    private WebDriver driver;
    public ManagemenDivisi(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

//========================All of Webelement ManagemenDivisi=========================================

//Masuk halaman==============================================================
    @FindBy(xpath = "//ul[@class='sub-menu']//a[normalize-space()='Managemen Divisi']")
    WebElement subMenuManagemenDivisi;
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[1]/h4")
    WebElement txtManagemenDivisiPage;

//  Scenario: Menambahkan data baru pada management divisi======================================
    @FindBy(xpath = "//div[contains(text(),'-- Pilih Divisi --')]")
    WebElement klikNamaDivisi;
    @FindBy(xpath = "//span[normalize-space()='kabarin aja']")
    WebElement namaDivisi;
    @FindBy(xpath = "//button[@data-id='tipe']//div[@class='filter-option-inner-inner'][normalize-space()='-- Pilih --']")
    WebElement klikTipeDivisi;
    @FindBy(xpath = "//span[normalize-space()='Client']")
    WebElement pilihTipeDivisiClient;
    @FindBy(xpath = "//div[contains(text(),'-- Pilih User --')]")
    WebElement klikUser;
    @FindBy(xpath = "//span[normalize-space()='TEST']")
    WebElement pilihUser;
    @FindBy(xpath = "//input[@value='Simpan']")
    WebElement btnSimpan;


//  Scenario: Tambah data tanpa ada mengisi data =====================================================
    @FindBy(xpath = "//*[@id=\"tipe\"]")
    WebElement txtPopupSelectItem;

//  Scenario: Upload data yang benar==========================================================
    @FindBy(xpath = "//a[@class='btn btn-success']")
    WebElement btnUploadData;
    @FindBy(xpath = "//*[@id=\"file\"]")
    WebElement btnChooseFile;
    @FindBy(xpath = "//button[@data-id='divisi']//div[@class='filter-option-inner-inner'][normalize-space()='-- Pilih --']")
    WebElement klikDivisiUpload;
    @FindBy(xpath = "//div[@aria-expanded='true']//span[@class='text'][normalize-space()='EHS']")
    WebElement pilihDivisiUpload;
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/strong")
    WebElement txtBerhasilUpload;
    @FindBy(xpath = "//strong[normalize-space()='PERINGATAN!']")
    WebElement txtGagalUpload;
    @FindBy(xpath = "//button[@data-dismiss='modal']//span[@aria-hidden='true'][normalize-space()='×']")
    WebElement btnCloseUpload;


//========================All of Method ManagemenDivisi=========================================
//Masuk halaman==============================================================

    public void clickSubMenuManagemenDivisi(){
        subMenuManagemenDivisi.click();
    }
    public String getTextManagemenDivisiPage(){
        return txtManagemenDivisiPage.getText();
    }

//  Scenario: Menambahkan data baru pada management divisi===================================
    public void clickNamaDivisi(){
        klikNamaDivisi.click();
    }
    public void pilihNamaDivisi(){
        namaDivisi.click();
    }
    public void clickTipeDivisi(){
        klikTipeDivisi.click();
    }
    public void pilihTipeDivisi(){
        pilihTipeDivisiClient.click();
    }
    public void clickUser(){
        klikUser.click();
    }
    public void pilihUser(){
        pilihUser.click();
    }
    public void clickBtnSimpan(){
        btnSimpan.click();
        DriverSingleton.delay(3);
    }
    public String getDataAlert(){
        String getAlert = driver.switchTo().alert().getText();
        System.out.println(getAlert);
        return getAlert;
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

//  Scenario: Tambah data tanpa ada mengisi data =====================================================
    public String getTextSelectItem(){
        String output = "";
        String required = txtPopupSelectItem.getAttribute("required");
        if(required.equals("true")){
            output += "Please select an item in the list";
        }
        System.out.println(output);
        return output;
    }

//  Scenario: Upload data yang benar==========================================================
    public void clickUploadData(){
        driver.navigate().refresh();
        DriverSingleton.delay(2);
        btnUploadData.click();
    }
    public void clickDivisiUpload(){
        klikDivisiUpload.click();
    }
    public void pilihDivisiUpload(){
        DriverSingleton.scrolling();
        DriverSingleton.delay(2);
        pilihDivisiUpload.click();
    }
    public void chooseFile(String path){
        btnChooseFile.sendKeys(path);
    }
    public String getBerhasil(){
        DriverSingleton.delay(2);
        return txtBerhasilUpload.getText();
    }
    public String getPeringatanUpload(){
        DriverSingleton.delay(2);
        return txtGagalUpload.getText();
    }
    public void clickClose(){
        btnCloseUpload.click();
    }
}
