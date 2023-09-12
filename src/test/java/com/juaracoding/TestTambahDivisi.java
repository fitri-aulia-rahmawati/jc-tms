package com.juaracoding;

import com.juaracoding.pages.TambahDivisi;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTambahDivisi {
    static WebDriver driver;
    static ExtentTest extentTest;
    static TambahDivisi tambahDivisi = new TambahDivisi();

    public TestTambahDivisi(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
//  Scenario: Masuk ke Halaman Tambah Divisi==========================================================
    @When("User click Master menu")
    public void user_click_master_menu(){
        tambahDivisi.clickMenuMaster();
        extentTest.log(LogStatus.PASS,"User click Master menu");
    }
    @And("User click submenu Tambah Divisi")
    public void user_click_submenu_tambah_divisi(){
        tambahDivisi.clickSubMenuTambahDivisi();
        extentTest.log(LogStatus.PASS,"User click submenu Tambah Divisi");
    }
    @Then("Get text Tambah Divisi page")
    public void get_text_tambah_divisi_page(){
        Assert.assertEquals(tambahDivisi.getTextTambahDivisiPage(),"Master Divisi");
        extentTest.log(LogStatus.PASS,"Get text Tambah Divisi page");
    }


//  Scenario: Update nama divisi==========================================================
    @When("User klik tombol edit")
    public void user_klik_tombol_edit(){
        tambahDivisi.clickBtnEdit();
        extentTest.log(LogStatus.PASS,"User klik tombol edit");
    }
    @And("User mengubah isi teks")
    public void user_mengubah_isi_teks(){
        tambahDivisi.renameDivisi("cukilat");
        extentTest.log(LogStatus.PASS,"User mengubah isi teks");
    }
    @And("User klik tombol update")
    public void user_klik_tombol_update(){
        tambahDivisi.clickBtnUpdate();
        extentTest.log(LogStatus.PASS,"User klik tombol update");
    }

//  Scenario: Membatalkan update==========================================================
    @And("User klik tombol cancel")
    public void user_klik_tombol_cancel(){
        tambahDivisi.clickBtnCancel();
        extentTest.log(LogStatus.PASS,"User klik tombol cancel");
    }
    @Then("Get text nama yang tak diubah")
    public void get_text_nama_yang_tak_diubah(){
        Assert.assertEquals(tambahDivisi.getTextList(),"niatan");
        extentTest.log(LogStatus.PASS,"Get text nama yang tak diubah");
    }

//  Scenario: Menginputkan nama divisi baru==========================================================
    @When("User masukan nama divisi baru")
    public void user_masukan_nama_divisi_baru(){
        tambahDivisi.inputNamaDivisi("lampokpang");
        extentTest.log(LogStatus.PASS,"User masukan nama divisi baru");
    }
    @And("User klik tombol simpan")
    public void User_klik_tombol_simpan(){
        tambahDivisi.klikSimpan();
        extentTest.log(LogStatus.PASS,"User klik tombol simpan");
    }
    @Then("Get text Success Input Data")
    public void get_text_success_input_data(){
        Assert.assertEquals(tambahDivisi.getTextDivisiName(),"BERHASIL!");
        extentTest.log(LogStatus.PASS,"Get text Success Input Data");
    }

//  Scenario: Tanpa menginputkan nama divisi==========================================================
    @Then("Get text popup perintah isi")
    public void get_text_popup_perintah_isi(){
        Assert.assertEquals(tambahDivisi.getTextRequiredFormDivisi(),"Please fill out this field");
        extentTest.log(LogStatus.PASS,"Get text popup perintah isi");
    }

//  Scenario: Menginputkan nama divisi yang telah ada==========================================================
    @When("User masukan nama divisi yang telah terdaftar")
    public void user_masukan_nama_divisi_yang_telah_terdaftar(){
        tambahDivisi.inputNamaDivisiTerdaftar("Gekk");
        extentTest.log(LogStatus.PASS,"User masukan nama divisi yang telah terdaftar");
    }
    @Then("Get text notifikasi peringatan")
    public void get_text_notifikasi_peringatan(){
        Assert.assertEquals(tambahDivisi.getTextDataDuplikat(),"PERINGATAN!");
        extentTest.log(LogStatus.PASS,"Get text notifikasi peringatan");
    }

//  Scenario: Upload data dengan template divisi==========================================================
    @When("User klik tombol upload data")
    public void user_klik_tombol_upload_data(){
        tambahDivisi.clickBtnUploadData();
        extentTest.log(LogStatus.PASS,"User klik tombol upload data");
    }
    @And("User memilih file")
    public void user_memilih_file(){
        tambahDivisi.setChooseFile("C:\\Users\\asus\\Downloads\\Templates Divisi.xlsx");
        extentTest.log(LogStatus.PASS,"User memilih file");
    }
    @And("User klik tombol save")
    public void user_klik_tombol_save(){
        tambahDivisi.clickBtnSave();
        extentTest.log(LogStatus.PASS,"User klik tombol save");
    }

//  Scenario: Mengupload file dan data yang sama==========================================================
    @And("User memilih file sama")
    public void user_memilih_file_sama(){
        tambahDivisi.setChooseSameFile("C:\\Users\\asus\\Downloads\\Templates Divisi.xlsx");
        extentTest.log(LogStatus.PASS,"User memilih file sama");
    }

}
