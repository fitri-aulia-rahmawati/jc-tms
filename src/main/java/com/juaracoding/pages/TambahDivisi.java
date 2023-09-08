package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TambahDivisi {
    private WebDriver driver;
     public TambahDivisi(){
         this.driver = DriverSingleton.getDriver();
         PageFactory.initElements(driver,this);
     }

//================================== All Element Tambah Divisi ==============================================

// Scenario: Masuk ke Halaman Tambah Divisi========================================================
    @FindBy(xpath = "//span[normalize-space()='Master']")
    WebElement btnMenuMaster;
    @FindBy(xpath = "//a[normalize-space()='Tambah Divisi']")
    WebElement btnsubMenuTambahDivisi;
    @FindBy(xpath = "//h4[normalize-space()='Master Divisi']")
    WebElement txtTambahDivisiPage;

//  Scenario: Update nama divisi==========================================================
    @FindBy(xpath = "//tbody/tr[1]/td[3]/a[1]")
    WebElement btnEdit;
    @FindBy(xpath = "//input[@name='update']")
    WebElement btnUpdate;

// Scenario: Menginputkan nama divisi baru==========================================================
    @FindBy(xpath = "//input[@id='Privilege_Name']")
    WebElement divisiName;
    @FindBy(xpath = "//input[@value='Simpan']")
    WebElement btnSimpan;
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/strong")
    WebElement txtSukses;

// Menginputkan nama divisi yang telah ada===============================================================
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/strong")
    WebElement txtduplikat;

//  Scenario: Upload data dengan template divisi==========================================================
    @FindBy(xpath = "//*[@id=\"content\"]/a[1]")
    WebElement btnUploadData;
    @FindBy(xpath = "//*[@id=\"file\"]")
    WebElement btnChooseFile;
    @FindBy(xpath = "//input[@value='Save']")
    WebElement btnSave;

//  Scenario: Membatalkan update======================================================================
    @FindBy(xpath ="//a[@class='btn btn-block btn-danger']")
    WebElement btnCancel;
    @FindBy(xpath = "//td[normalize-space()='Bijaksanaan']")
    WebElement textMamangoltakdiubah;


//================================== All Method Tambah Divisi ==============================================

// Scenario: Masuk ke Halaman Tambah Divisi========================================================
     public void clickMenuMaster(){
         btnMenuMaster.click();
     }
     public void clickSubMenuTambahDivisi(){
         btnsubMenuTambahDivisi.click();
     }
     public String getTextTambahDivisiPage(){
         return txtTambahDivisiPage.getText();
     }


// Scenario: Menginputkan nama divisi baru==========================================================
    public void inputNamaDivisi(String name){
        divisiName.sendKeys(name);
    }
    public void klikSimpan(){
        btnSimpan.click();
        DriverSingleton.delay(2);
    }
    public String getTextDivisiName(){
        return txtSukses.getText();
    }


// Negatif test case tambah divisi=========================================================================
    public String getTextRequiredFormDivisi(){
        String output = "";
        String required = divisiName.getAttribute("required");
        if(required.equals("true")){
            output += "Please fill out this field";
        }
        System.out.println(output);
        return output;
    }

// Menginputkan nama divisi yang telah ada===============================================================
    public void inputNamaDivisiTerdaftar(String name){
        divisiName.sendKeys(name);
    }
    public String getTextDataDuplikat(){
        return txtduplikat.getText();
    }


//  Scenario: Upload data dengan template divisi==========================================================
    public void clickBtnUploadData(){
         DriverSingleton.delay(2);
         btnUploadData.click();
         DriverSingleton.delay(1);
    }
    public void setChooseFile(String path){
        btnChooseFile.sendKeys(path);
    }
    public void clickBtnSave(){
        btnSave.click();
        DriverSingleton.delay(2);
    }

//  Scenario: Mengupload file dan data yang sama==========================================================
    public void setChooseSameFile(String path){
        btnChooseFile.sendKeys(path);
    }


//  Scenario: Upload data dengan template divisi==========================================================
    public void clickBtnEdit(){
        btnEdit.click();
    }
    public void renameDivisi(String name){
        divisiName.clear();
        divisiName.sendKeys(name);
    }
    public void clickBtnUpdate(){
        btnUpdate.click();
    }


//  Scenario: Membatalkan update======================================================================
    public void clickBtnCancel(){
        btnCancel.click();
        DriverSingleton.delay(2);
    }
    public String getTextList(){
        return textMamangoltakdiubah.getText();
    }
}
