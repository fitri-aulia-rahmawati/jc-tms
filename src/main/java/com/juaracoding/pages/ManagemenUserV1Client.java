package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagemenUserV1Client {
    private WebDriver driver;
    public ManagemenUserV1Client(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

//========================All of Webelement ManagemenUserV1Client=========================================

//Masuk halaman==============================================================
    @FindBy(xpath = "//a[normalize-space()='Managemen User V1 Client']")
    WebElement subMenuManagemenUserv1Client;
    @FindBy(xpath = "//li[normalize-space()='List user client V1']")
    WebElement txtV1Client;

//tambah user yang sesuai=======================================================
    @FindBy(xpath = "//button[@id='tambahUser']")
    WebElement btnTambahuser;
    @FindBy(xpath = "//*[@id=\"namaLengkap\"]")
    WebElement formNamalengkap;
    @FindBy(xpath = "//*[@id=\"emailUser\"]")
    WebElement formEmail;
    @FindBy(xpath = "//*[@id=\"btnSimpan\"]")
    WebElement btnSimpan;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/strong")
    WebElement txtSukses;

    @FindBy(xpath = "//*[@id=\"close\"]")
    WebElement btnClose;

//notifikasi gagal=================================================
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/strong")
    WebElement txtGagal;


//=============================All of Method ManagemenUserV1Client=======================================

//masuk ke halaman============================================================
    public void clickSubMenuManagemenUserV1Client(){
        subMenuManagemenUserv1Client.click();
        DriverSingleton.delay(2);
    }
    public String getTextManagemenDivisiv1Client(){
        return txtV1Client.getText();
    }


//tambah user yang sesuai==========================================================
    public void clickTambahUser(){
        driver.navigate().refresh();
        DriverSingleton.delay(3);
        btnTambahuser.click();
        DriverSingleton.delay(2);
    }
    public void setNamaUser(String nama){
        formNamalengkap.sendKeys(nama);
    }
    public void setEmail(String email){
        formEmail.sendKeys(email);
    }
    public void clickSimpan(){
        btnSimpan.click();
        DriverSingleton.delay(2);
    }
    public String getTextSuksesTambah(){
        return txtSukses.getText();
    }


//  Scenario: Menambahkan user tanpa isi data============================================

    public String getTextRequiredFormv1Client(){
        String output = "";
        String required = formNamalengkap.getAttribute("required");
        if(required.equals("true")){
            output += "Please fill out this field";
        }
        System.out.println(output);
        return output;

    }

// Data duplikat ==================================================================
    public String getTextGagal(){
        return txtGagal.getText();
    }

//Scenario: Menambahkan data dengan format email yang salah=========================
    public String getTextRequiredFormEmailCorrect(){
        String output = "";
        String required = formEmail.getAttribute("required");
        if(required.equals("true")){
            output += "Please include an '@' in the email address. 'aadcs' is missing an '@'.";
        }
        System.out.println(output);
        return output;

    }
}
