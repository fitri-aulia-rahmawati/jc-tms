package com.juaracoding;

import com.juaracoding.pages.ManagemenDivisi;
import com.juaracoding.pages.TambahDivisi;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestManagemenDivisi {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ManagemenDivisi managemenDivisi = new ManagemenDivisi();

    public TestManagemenDivisi(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Masuk halaman==============================================================
    @And("User click submenu Managemen Divisi")
    public void user_click_submenu_managemen_divisi(){
        managemenDivisi.clickSubMenuManagemenDivisi();
        extentTest.log(LogStatus.PASS,"User click submenu Managemen Divisi");
    }
    @Then("Get text Managemen Divisi Page")
    public void get_text_managemen_divisi_page(){
        Assert.assertEquals(managemenDivisi.getTextManagemenDivisiPage(),"Managemen Divisi");
        extentTest.log(LogStatus.PASS,"Get text Managemen Divisi Page");
    }

//  Scenario: Menambahkan data baru pada management divisi=======================================
    @When("User klik form nama divisi")
    public void user_klik_form_nama_divisi(){
        managemenDivisi.clickNamaDivisi();
        extentTest.log(LogStatus.PASS,"User klik form nama divisi");
    }
    @And("User pilih divisi")
    public void user_pilih_divisi(){
        managemenDivisi.pilihNamaDivisi();
        extentTest.log(LogStatus.PASS,"User pilih divisi");
    }
    @And("User klik tipe divisi")
    public void user_klik_tipe_divisi(){
        managemenDivisi.clickTipeDivisi();
        extentTest.log(LogStatus.PASS,"User klik tipe divisi");
    }
    @And("User pilih tipe divisi")
    public void user_pilih_tipe_divisi(){
        managemenDivisi.pilihTipeDivisi();
        extentTest.log(LogStatus.PASS,"User pilih tipe divisi");
    }
    @And("User klik user client")
    public void user_klik_user_client(){
        managemenDivisi.clickUser();
        extentTest.log(LogStatus.PASS,"User klik user client");
    }
    @And("User pilih user client")
    public void user_pilih_user_client(){
        managemenDivisi.pilihUser();
        extentTest.log(LogStatus.PASS,"User pilih user client");
    }
    @And("User klik tombol simpan managemen divisi")
    public void user_klik_tombol_simpan_managemen_divisi(){
        managemenDivisi.clickBtnSimpan();
        extentTest.log(LogStatus.PASS,"User klik tombol simpan managemen divisi");
    }
    @And("Get text popup berhasil")
    public void get_text_popup_berhasil(){
        Assert.assertEquals(managemenDivisi.getDataAlert(),"Berhasil input Data Tipe!");
        extentTest.log(LogStatus.PASS,"Get text popup berhasil");
    }
    @Then("User klik ok pada popup")
    public void user_klik_ok_pada_popup(){
        managemenDivisi.acceptAlert();
        extentTest.log(LogStatus.PASS,"User klik ok pada popup");
    }

//  Scenario: Tambah data tanpa ada mengisi data =====================================================
    @Then("Get text popup select item")
    public void get_text_popup_select_item(){
        Assert.assertEquals(managemenDivisi.getTextSelectItem(),"Please select an item in the list");
        extentTest.log(LogStatus.PASS,"Get text popup select item");
    }

//  Scenario: Tambah data yang sudah ada====================================================
    @And("Get text popup data duplikat")
    public void get_text_popup_data_duplikat(){
        Assert.assertEquals(managemenDivisi.getDataAlert(),"1 Divisi hanya bisa 1 tipe!");
        extentTest.log(LogStatus.PASS,"Get text popup data duplikat");
    }
    @And("Get text popup data duplikat beda")
    public void get_text_popup_data_duplikat_beda(){
        Assert.assertEquals(managemenDivisi.getDataAlert(),"Duplikat Data Tipe!");
        extentTest.log(LogStatus.PASS,"Get text popup data duplikat beda");
    }

//  Scenario: Upload data yang benar==========================================================
    @When("User klik upload data")
    public void user_klik_upload_data(){
        managemenDivisi.clickUploadData();
        extentTest.log(LogStatus.PASS,"User klik upload data");
    }
    @And("User klik form nama divisi upload")
    public void user_klik_form_nama_divisi_upload(){
        managemenDivisi.clickDivisiUpload();
        extentTest.log(LogStatus.PASS,"User klik form nama divisi upload");
    }
    @And("User pilih divisi upload")
    public void user_pilih_divisi_upload(){
        managemenDivisi.pilihDivisiUpload();
        extentTest.log(LogStatus.PASS,"User pilih divisi upload");
    }
    @And("User memilih file managemen divisi")
    public void user_memilih_file_managemen_divisi(){
        managemenDivisi.chooseFile("C:\\Users\\asus\\Downloads\\Templates Managemen Divisi.xlsx");
        extentTest.log(LogStatus.PASS,"User memilih file managemen divisi");
    }
    @Then("Get text notifikasi berhasil upload")
    public void get_text_notifikasi_berhasil_upload(){
        Assert.assertEquals(managemenDivisi.getBerhasil(),"BERHASIL!");
        extentTest.log(LogStatus.PASS,"Get text notifikasi berhasil upload");
    }
    @Then("Get text notifikasi peringatan upload")
    public void get_text_notifikasi_peringatan_upload(){
        Assert.assertEquals(managemenDivisi.getPeringatanUpload(),"PERINGATAN!");
        extentTest.log(LogStatus.PASS,"Get text notifikasi peringatan upload");
    }
    @Then("klik close")
    public void klik_close(){
        managemenDivisi.clickClose();
        extentTest.log(LogStatus.PASS,"klik close");
    }
}
