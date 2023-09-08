package com.juaracoding;

import com.juaracoding.pages.ManagemenUserV1Client;
import com.juaracoding.pages.TambahDivisi;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestManagemenUserV1Client {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ManagemenUserV1Client managemenUserV1Client = new ManagemenUserV1Client();

    public TestManagemenUserV1Client(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Masuk ke Halaman Managemen User v1 Client============================================

    @And("Klik submenu managemen user v1 client")
    public void klik_submenu_managemen_user_v1_client(){
        managemenUserV1Client.clickSubMenuManagemenUserV1Client();
        extentTest.log(LogStatus.PASS,"Klik submenu managemen user v1 client");
    }
    @Then("Get text Page Managemen User V1 Client")
    public void get_text_page_managemen_user_v1_client(){
        Assert.assertEquals(managemenUserV1Client.getTextManagemenDivisiv1Client(),"List user client V1");
        extentTest.log(LogStatus.PASS,"Get text Page Managemen User V1 Client");
    }


//  Scenario: Tambah user yang sesuai===========================================

    @When("User klik tambah user")
    public void user_klik_tambah_user(){
        managemenUserV1Client.clickTambahUser();
        extentTest.log(LogStatus.PASS,"User klik tambah user");
    }
    @And("User masukan nama user")
    public void user_masukan_nama_user(){
        managemenUserV1Client.setNamaUser("jiraiya");
        extentTest.log(LogStatus.PASS,"User masukan nama user");
    }
    @And("User masukan nama email")
    public void user_masukan_nama_email(){
        managemenUserV1Client.setEmail("jiraiya22@gmail.com");
        extentTest.log(LogStatus.PASS,"User masukan nama email");
    }
    @And("User klik tombol simpan managemen V1")
    public void user_klik_tombol_simpan_managemen_V1(){
        managemenUserV1Client.clickSimpan();
        extentTest.log(LogStatus.PASS,"User klik tombol simpan managemen V1");
    }
    @Then("Get text notifikasi berhasil")
    public void get_text_notifikasi_berhasil(){
        managemenUserV1Client.getTextSuksesTambah();
        extentTest.log(LogStatus.PASS,"Get text notifikasi berhasil");
    }


//  Scenario: Menambahkan user tanpa isi data============================================
    @Then("Get text popup perintah isi data v1")
    public void get_text_popup_perintah_isi_data_v1(){
        Assert.assertEquals(managemenUserV1Client.getTextRequiredFormv1Client(),"Please fill out this field");
        extentTest.log(LogStatus.PASS,"Get text popup perintah isi data v1");
    }

//  Scenario: Menambahkan data yang sama==============================================
    @Then("Get text notifikasi gagal")
    public void get_text_notifikasi_gagal(){
        Assert.assertEquals(managemenUserV1Client.getTextGagal(),"Gagal!");
        extentTest.log(LogStatus.PASS,"Get text notifikasi gagal");
    }

//  Scenario: Menambahkan data dengan format email yang salah
    @And("User masukan nama email dengan format salah")
    public void user_masukan_nama_email_dengan_format_salah(){
        managemenUserV1Client.setEmail("aadcs");
        extentTest.log(LogStatus.PASS,"User masukan nama email dengan format salah");
    }
    @Then("Get text popup perintah isi format email benar")
    public void get_text_popup_perintah_isi_format_email_benar(){
        Assert.assertEquals(managemenUserV1Client.getTextRequiredFormEmailCorrect(),"Please include an '@' in the email address. 'aadcs' is missing an '@'.");
        extentTest.log(LogStatus.PASS,"Get text popup perintah isi format email benar");
    }

//Scenario: Menambahkan data user dengan nama user sama dan email berbeda==================================
    @And("User masukan nama email berbeda")
    public void user_masukan_nama_email_berbeda(){
        managemenUserV1Client.setEmail("indahnya@gmail.com");
        extentTest.log(LogStatus.PASS,"User masukan nama email berbeda");
    }

//Scenario: Menambahkan data user dengan nama berbeda dan email sama=====================================
    @And("User masukan nama user berbeda")
    public void user_masukan_nama_user_berbeda(){
        managemenUserV1Client.setNamaUser("kapak");
        extentTest.log(LogStatus.PASS,"User masukan nama user berbeda");
    }
}

