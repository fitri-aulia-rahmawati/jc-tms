package com.juaracoding.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AbsenMasukPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAbsenMasuk {
    static WebDriver driver;
    static ExtentTest extentTest;
    static AbsenMasukPage absenMasukPage = new AbsenMasukPage();

    public TestAbsenMasuk() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click Laporan Kegiatan Page")
    public void user_click_laporan_kegiatan_page() {
        DriverSingleton.delay(1);
        absenMasukPage.clickLaporanKegiatanPage();
    }
    @When("User click Laporan Kegiatan Page1")
    public void user_click_laporan_kegiatan_page1() {
        driver.navigate().back();
        absenMasukPage.clickLaporanKegiatanPage();
    }

    @And("User click Absen Masuk Page")
    public void user_click_absen_masuk_page() {
        absenMasukPage.clickAbsenMasukPage();
        extentTest.log(LogStatus.PASS, "user clik absen masuk page");
    }

    @And("User Upload File")
    public void user_upload_file()  {
        absenMasukPage.clickButtonUpload();
        extentTest.log(LogStatus.PASS, "User upload selfie photo");
    }

    @And("User click Button Submit")
    public void user_click_button_submit()  {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        absenMasukPage.clickButtonSubmit();

        extentTest.log(LogStatus.PASS, "User click button submit");
    }

    @And("User Choose Non Shift")
    public void user_choose_non_shift() {
        absenMasukPage.clickDropDownNamaShift("n");
        extentTest.log(LogStatus.PASS, "User choose non Shift in Nama Shift");
    }

    @And("User Choose Tipe Absen WFH")
    public void user_choose_tipe_absen_WFH() {
        absenMasukPage.clickDropDownTipeAbsen("w");
        extentTest.log(LogStatus.PASS, "User choose WFH in Tipe Absen");
    }

    @And("User Choose Tipe Absen WFO")
    public void user_choose_tipe_absen_WFO() {
        absenMasukPage.clickDropDownTipeAbsen("ww");
        extentTest.log(LogStatus.PASS, "User choose WFO in Tipe Absen");
    }

    @Then("User get text Absen Masuk")
    public void user_get_text_Absen_Masuk()  {
        DriverSingleton.delay(1);
        Assert.assertEquals(absenMasukPage.TxtAbsenMasuk(), "Absen Masuk");
        extentTest.log(LogStatus.PASS, "User get text Absen Masuk");
    }

    @And("User get text Absen Done")
    public void user_get_text_Absen_Done()  {
        Assert.assertTrue(absenMasukPage.txtAbsenDone().contains("Laporan berhasil"));
        extentTest.log(LogStatus.PASS, "User get text Laporan Berhasil");
    }


    @Then("User Get PopUp Upload File Required")
    public void user_get_popup_upload_file_required() {
        Assert.assertEquals(absenMasukPage.getTxtUploadFileRequired(), "Please select an item in the list.");
        extentTest.log(LogStatus.PASS, "User get popup upload file required");
    }

    @Then("User Get PopUp Nama Shift Required")
    public void user_get_popup_nama_shift_required() {
        Assert.assertEquals(absenMasukPage.getTxtNamaShiftRequired(), "Please select an item in the list.");
        extentTest.log(LogStatus.PASS, "User get popup nama shift required");
    }
    @Then("User Get PopUp Tipe Absen Required")
    public void user_get_popup_tipe_absen_required() {
        Assert.assertEquals(absenMasukPage.getTxtTipeAbsenRequired(), "Please select an item in the list.");
        extentTest.log(LogStatus.PASS, "User get popup tipe absen required");
    }
    @And("User Upload File Txt")
    public void user_upload_file_txt()  {
        absenMasukPage.txtFile();
        extentTest.log(LogStatus.PASS, "User upload txt file");
    }

    @And("User Upload file JPG 8mb")
    public void user_upload_file_jpg_8mb()  {
        absenMasukPage.largerFile();
        extentTest.log(LogStatus.PASS, "User upload photo file size 8 mb");
    }

    @Then("User Get Error Message Larger File")
    public void user_get_error_message_larger_file()  {
        Assert.assertEquals(absenMasukPage.txtErrorMessageLargerFile(),"Laporan berhasil");
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User get error message that the upload file is larger than the permitted");
    }

    @Then("User Get Error Message Wrong Type File")
    public void user_get_error_message_wrong_type_file(){
        DriverSingleton.delay(2);
        Assert.assertEquals(absenMasukPage.txtErrorWrongTypeFile(),"Only jpeg, jpg and png Images type allowed");
        extentTest.log(LogStatus.PASS, "User get error message wrong type file");
    }
//    @And("Back Button")
//    public void back_button(){
//        driver.navigate().back();
//    }
}