package com.juaracoding;

import com.juaracoding.pages.MasterParameterShiftingPage;
import com.juaracoding.pages.MasterPositionPage;
import com.juaracoding.pages.MasterUnitKerjaPenempatanPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMasterPosition {
    static WebDriver driver;
    static ExtentTest extentTest;
    static MasterParameterShiftingPage masterParameterShiftingPage = new MasterParameterShiftingPage();
    static MasterUnitKerjaPenempatanPage masterUnitKerjaPenempatanPage = new MasterUnitKerjaPenempatanPage();
    static MasterPositionPage masterPositionPage = new MasterPositionPage();

    public TestMasterPosition(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
//    @When("User click menu master")
//    public void user_click_menu_master(){
//        masterParameterShiftingPage.clickMenuMaster();
//        extentTest.log(LogStatus.PASS,"User click menu master");
//    }
    @And("User click sub menu master position")
    public void user_click_sub_menu_master_position(){
        masterPositionPage.clickMenuMasterPosition();
        extentTest.log(LogStatus.PASS,"User click sub menu master position");
    }
    @Then("User berhasil masuk ke menu master position")
    public void user_berhasil_masuk_ke_menu_master_position() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterPositionPage.getTxtMasterPositionTms(), "Master Position TMS");
        extentTest.log(LogStatus.PASS,"User berhasil masuk ke menu master position");
    }

    @When("User input jenis pekerjaan")
    public void user_input_jenis_pekerjaan(){
        masterPositionPage.inputTypeOfWork("Cyber Security");
        extentTest.log(LogStatus.PASS,"User input jenis pekerjaan");
    }
    @And("User input posisi")
    public void user_input_posisi(){
        masterPositionPage.inputPosition("Security Analyst");
        extentTest.log(LogStatus.PASS,"User input posisi");
    }
    @And("User input standarisasi upah")
    public void user_input_standarisasi_upah(){
        masterPositionPage.inputStandarWage("5500000");
        extentTest.log(LogStatus.PASS,"User input standarisasi upah");
    }
    @And("User click status posisi")
    public void user_click_status_posisi(){
        masterPositionPage.clickStatusDropdown();
        extentTest.log(LogStatus.PASS,"User click status posisi");
    }
    @And("User click pilih posisi active")
    public void user_click_pilih_posisi_active(){
        masterPositionPage.clickActive();
        extentTest.log(LogStatus.PASS,"User click pilih posisi active");
    }
    @And("User click pilih posisi non active")
    public void user_click_pilih_posisi_non_active(){
        masterPositionPage.clickNonActive();
        extentTest.log(LogStatus.PASS,"User click pilih posisi non active");
    }
    @And("User click button save")
    public void user_click_button_save() throws InterruptedException{
        Thread.sleep(2000);
        masterPositionPage.clickBtnSimpan();
        extentTest.log(LogStatus.PASS,"User click button save");
    }
    @And("User get text pop up success add position")
    public void user_get_text_pop_up_succsess_add_position() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals( masterPositionPage.getDataAlert(),"Data Berhasil Disimpan!");
        extentTest.log(LogStatus.PASS,"User get text pop up success add position");
    }
    @Then("User click button ok")
    public void user_click_button_ok(){
        masterPositionPage.acceptAlert();
        extentTest.log(LogStatus.PASS,"User click button ok");
    }
    @And("User get text popup type of work")
    public void user_get_text_popup_type_of_work() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals( masterPositionPage.getTextFillTypeOfWork(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User get text type of work");
    }
    @And("User get text popup position")
    public void user_get_text_popup_position() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(masterPositionPage.getTextFillPosition(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User get text popup position");
    }
    @And("User get text popup standar wage")
    public void user_get_text_popup_standar_wage() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(masterPositionPage.getTextFillStandarWage(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User get text popup standar wage");
    }
    @And("User get text popup status position")
    public void user_get_text_popup_status_position() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(masterPositionPage.getTextFillStatusDropdown(), "Please select an item.");
        extentTest.log(LogStatus.PASS, "User get text popup status position");
    }
    @When("Clear data master posisi")
    public void clear_data_master_posisi(){
        masterPositionPage.clearDataMasterPosition();
        extentTest.log(LogStatus.PASS,"Clear data master posisi");
    }

    @When("User mencari jenis pekerjaan active")
    public void user_mencari_jenis_pekerjaan_active() throws InterruptedException{
        driver.navigate().refresh();
        masterPositionPage.inputSearchData("Cyber Security");
        extentTest.log(LogStatus.PASS, "User mencari jenis pekerjaan active");
        Thread.sleep(2000);
    }
    @And("User get text type of work")
    public void user_get_text_type_of_work() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(masterPositionPage.getTxtTypeOfWork(),"Cyber Security");
        extentTest.log(LogStatus.PASS,"User get text type of work");
    }
    @Then("User get text status of work active")
    public void user_get_text_status_of_work_active() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(masterPositionPage.getTxtStatusOfWorkActive(),"ACTIVE");
        extentTest.log(LogStatus.PASS,"User get text status of work active");
    }
    @When("User mencari status pekerjaan non active")
    public void user_mencari_status_pekerjaan_non_active() throws InterruptedException{
        driver.navigate().refresh();
        masterPositionPage.inputSearchData("Non-active");
        extentTest.log(LogStatus.PASS, "User mencari status pekerjaan non active");
        Thread.sleep(1000);
    }
    @Then("User get text type of work non active")
    public void user_get_text_type_of_work_non_active() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterPositionPage.getTxtTypeOfWorkNonActive(),"No matching records found");
        extentTest.log(LogStatus.PASS,"User get text type of work non active");
    }
    @Then("User get text position no matching records found")
    public void user_get_text_position_no_matching_record_found() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterPositionPage.getTxtNoMatchingRecordsFound(),"No matching records found");
        extentTest.log(LogStatus.PASS,"User get text position no matching records found");
    }
    @When("User mencari posisi")
    public void user_mencari_posisi() throws InterruptedException{
        driver.navigate().refresh();
        masterPositionPage.inputSearchData("Security Analyst");
        extentTest.log(LogStatus.PASS, "User mencari posisi");
        Thread.sleep(2000);
    }
    @Then("User get text position")
    public void user_get_text_positon() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterPositionPage.getTxtPosition(),"Security Analyst");
        extentTest.log(LogStatus.PASS,"User get text position");
    }
    @When("User mencari standarisasi upah")
    public void user_mencari_standarisasi_upah() throws InterruptedException{
        driver.navigate().refresh();
        masterPositionPage.inputSearchData("5500000");
        extentTest.log(LogStatus.PASS, "User mencari standarisasi upah");
        Thread.sleep(2000);
    }
    @Then("User get text standar wage")
    public void user_get_text_standar_wage() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterPositionPage.getTxtStandarWage(),"5500000");
        extentTest.log(LogStatus.PASS,"User get text standar wage");
    }
    @When("User invalid data master posisi")
    public void user_invalid_data() throws InterruptedException{
        driver.navigate().refresh();
        masterPositionPage.inputSearchData("sgsdt");
        extentTest.log(LogStatus.PASS, "User invalid data master posisi");
        Thread.sleep(2000);
    }
}
