package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.MasterParameterShiftingPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMasterParameterShifting {
    static WebDriver driver;
    static ExtentTest extentTest;
    static MasterParameterShiftingPage masterParameterShiftingPage = new MasterParameterShiftingPage();

    public TestMasterParameterShifting(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click menu master")
    public void user_click_menu_master(){
        masterParameterShiftingPage.clickMenuMaster();
        extentTest.log(LogStatus.PASS,"User click menu master");
    }

    @And("User click sub menu parameter shifting")
    public void user_click_sub_menu_parameter_shifting(){
        masterParameterShiftingPage.clickMenuParameterShifting();
        extentTest.log(LogStatus.PASS,"User click sub menu parameter shifting");
    }

    @Then("User berhasil masuk ke menu parameter shifting")
    public void user_berhasil_masuk_ke_menu_parameter_shifting() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterParameterShiftingPage.getTxtParameterShifting(),"Parameter Shift");
        extentTest.log(LogStatus.PASS,"User berhasil masuk ke menu parameter shifting");
    }

    @When("User click button tambah")
    public void user_click_button_tambah(){
        masterParameterShiftingPage.clickBtnTambah();
        extentTest.log(LogStatus.PASS, "User click button tambah");
    }

    @And("User click unit")
    public void user_click_unit(){
        masterParameterShiftingPage.clickUnitDropdown();
        extentTest.log(LogStatus.PASS,"User click unit");
    }

    @And("User click pilih unit")
    public void user_click_pilih_unit(){
        masterParameterShiftingPage.clickPilihUnit();
        extentTest.log(LogStatus.PASS,"User click pilih unit");
    }

    @And("User input nama shift")
    public void user_input_nama_shift(){
        masterParameterShiftingPage.inputNamaShift("Shift Malam");
        extentTest.log(LogStatus.PASS,"User input nama shift");
    }

    @And("User input jam mulai")
    public void user_input_jam_mulai(){
        masterParameterShiftingPage.inputJamMulai("22:00");
        extentTest.log(LogStatus.PASS, "User input jam mulai");
    }

    @And("User input jam selesai")
    public void user_input_jam_selesai(){
        masterParameterShiftingPage.inputJamSelesai("07:00");
        extentTest.log(LogStatus.PASS,"User input jam selesai");
    }

    @And("User click button submit")
    public void user_click_button_submit(){
        masterParameterShiftingPage.clickBtnSubmit();
        extentTest.log(LogStatus.PASS,"User click button submit");
    }

    @And("User get text succsess")
    public void user_get_text_success() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterParameterShiftingPage.getTxtSuccess(),"Success!");
        extentTest.log(LogStatus.PASS,"User get text succsess");
    }

    @And("User get text unit required")
    public void user_get_text_unit_required() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterParameterShiftingPage.getTxtUnitRequired(),"The Unit field is required.");
        extentTest.log(LogStatus.PASS,"User get text unit required");
    }

    @And("User get text nama shift required")
    public void user_get_text_nama_shift_required() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterParameterShiftingPage.getTxtNamaShiftRequired(),"The Nama Shift field is required.");
        extentTest.log(LogStatus.PASS,"User get text nama shift required");
    }

    @And("User get text jam mulai required")
    public void user_get_text_jam_mulai_required() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterParameterShiftingPage.getTxtJamMulaiRequired(),"The Jam Mulai field is required.");
        extentTest.log(LogStatus.PASS,"User get text jam mulai required");
    }

    @And("User get text jam selesai required")
    public void user_get_text_jam_selesai_required() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(masterParameterShiftingPage.getTxtJamSelesaiRequired(),"The Jam Selesai field is required.");
        extentTest.log(LogStatus.PASS,"User get text jam selesai required");
    }

    @When("Clear data")
    public void clear_data(){
        masterParameterShiftingPage.clearData();
        extentTest.log(LogStatus.PASS,"Clear data");
    }

    @When("User click button back")
    public void user_click_button_back(){
        masterParameterShiftingPage.clickBtnBack();
        extentTest.log(LogStatus.PASS,"User click button back");
    }

    @When("User mencari unit")
    public void user_mencari_unit() throws InterruptedException{
        masterParameterShiftingPage.inputSearchShift("SDM");
        extentTest.log(LogStatus.PASS, "User mencari unit");
        Thread.sleep(2000);
    }
    @Then("User get text unit")
    public void user_get_text_unit() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterParameterShiftingPage.getTxtUnit(),"SDM");
        extentTest.log(LogStatus.PASS,"User get text unit");
    }

    @When("User mencari nama shift")
    public void user_mencari_nama_shift() throws InterruptedException{
        driver.navigate().refresh();
        masterParameterShiftingPage.inputSearchShift("Shift Malam");
        extentTest.log(LogStatus.PASS, "User mencari nama shift");
        Thread.sleep(2000);
    }
    @Then("User get text nama shift")
    public void user_get_text_nama_shit() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterParameterShiftingPage.getTxtNamaShift(),"Shift Malam");
        extentTest.log(LogStatus.PASS,"User get text nama shift");
    }

    @When("User mencari jam mulai")
    public void user_mencari_jam_mulai() throws InterruptedException{
        driver.navigate().refresh();
        masterParameterShiftingPage.inputSearchShift("22:00");
        extentTest.log(LogStatus.PASS, "User mencari jam mulai");
        Thread.sleep(2000);
    }
    @Then("User get text jam mulai")
    public void user_get_text_jam_mulai() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterParameterShiftingPage.getTxtJamMulai(),"22:00");
        extentTest.log(LogStatus.PASS,"User get text jam mulai");
    }

    @When("User mencari jam selesai")
    public void user_mencari_jam_selesai() throws InterruptedException{
        driver.navigate().refresh();
        masterParameterShiftingPage.inputSearchShift("07:00");
        extentTest.log(LogStatus.PASS, "User mencari jam selesai");
        Thread.sleep(2000);
    }
    @Then("User get text jam selesai")
    public void user_get_text_jam_selesai() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterParameterShiftingPage.getTxtJamSelesai(),"07:00");
        extentTest.log(LogStatus.PASS,"User get text jam selesai");
    }

    @When("User input invalid data master unit")
    public void user_input_invalid_data_master_unit(){
        driver.navigate().refresh();
        masterParameterShiftingPage.inputSearchShift("Sumber Dayaaa Manusia");
        extentTest.log(LogStatus.PASS, "User input invalid data master unit");
    }

    @Then("User get text no matching records found")
    public void user_get_text_no_matching_record_found() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterParameterShiftingPage.getTxtNoMatchingRecordsFound(),"No matching records found");
        extentTest.log(LogStatus.PASS,"User get text no matching records found");
    }
}