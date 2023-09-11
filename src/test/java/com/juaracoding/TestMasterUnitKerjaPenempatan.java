package com.juaracoding;

import com.juaracoding.pages.MasterParameterShiftingPage;
import com.juaracoding.pages.MasterUnitKerjaPenempatanPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMasterUnitKerjaPenempatan {
    static WebDriver driver;
    static ExtentTest extentTest;
    static MasterParameterShiftingPage masterParameterShiftingPage = new MasterParameterShiftingPage();
    static MasterUnitKerjaPenempatanPage masterUnitKerjaPenempatanPage = new MasterUnitKerjaPenempatanPage();

    public TestMasterUnitKerjaPenempatan(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
//    @When("User click menu master")
//    public void user_click_menu_master(){
//        masterParameterShiftingPage.clickMenuMaster();
//        extentTest.log(LogStatus.PASS,"User click menu master");
//    }
    @And("User click sub menu unit kerja penempatan")
    public void user_click_sub_menu_unit_kerja_penempatan(){
        masterUnitKerjaPenempatanPage.clickMenuUnitKerjaPenempatan();
        extentTest.log(LogStatus.PASS,"User click sub menu unit kerja penempatan");
    }
    @Then("User berhasil masuk ke menu master unit kerja penempatan")
    public void user_berhasil_masuk_ke_menu_master_unit_kerja_penempatan() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterUnitKerjaPenempatanPage.getTxtUnitKerjaPenempatan(), "Master Unit Kerja Penempatan");
        extentTest.log(LogStatus.PASS,"User berhasil masuk ke menu master unit kerja penempatan");
    }

    @When("User input unit kerja penempatan")
    public void user_input_unit_kerja_penempatan(){
        masterUnitKerjaPenempatanPage.inputWorkPlacement("Kantor Cabang PT DIKA Bogor");
        extentTest.log(LogStatus.PASS,"User input unit kerja penempatan");
    }
    @And("User input kode cabang pembayaran")
    public void user_input_kode_cabang_pembayaran(){
        masterUnitKerjaPenempatanPage.inputBranchCode("3112");
        extentTest.log(LogStatus.PASS,"User input kode cabang pembayaran");
    }
    @And("User input rcc pembayaran")
    public void user_input_rcc_pembayaran(){
        masterUnitKerjaPenempatanPage.inputRccCode("987");
        extentTest.log(LogStatus.PASS,"User input rcc pembayaran");
    }
    @And("User click status")
    public void user_click_status(){
        masterUnitKerjaPenempatanPage.clickStatusDropdown();
        extentTest.log(LogStatus.PASS,"User click status");
    }
    @And("User click pilih active")
    public void user_click_pilih_active(){
        masterUnitKerjaPenempatanPage.clickActive();
        extentTest.log(LogStatus.PASS,"User click pilih active");
    }
    @And("User click pilih non active")
    public void user_click_pilih_non_active(){
        masterUnitKerjaPenempatanPage.clickNonActive();
        extentTest.log(LogStatus.PASS,"User click pilih non active");
    }
    @And("User click button simpan")
    public void user_click_button_simpan(){
        masterUnitKerjaPenempatanPage.clickBtnSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }
    @And("User get text pop up success")
    public void user_get_text_succsess_add_work_placement_unit() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(masterUnitKerjaPenempatanPage.getDataAlert(),"Data Berhasil Disimpan!");
        extentTest.log(LogStatus.PASS,"User get text pop up success");
    }
    @Then("User click ok")
    public void user_click_ok(){
        masterUnitKerjaPenempatanPage.acceptAlert();
        extentTest.log(LogStatus.PASS,"User click ok");
    }
    @And("User get text popup workplacement")
    public void user_get_text_popup_workplacement() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(masterUnitKerjaPenempatanPage.getTextFillWorkPlacement(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User get text popup workplacement");
    }
    @And("User get text popup branch code")
    public void user_get_text_popup_branch_code() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(masterUnitKerjaPenempatanPage.getTextFillBranchCode(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User get text popup branch code");
    }
    @And("User get text popup rcc code")
    public void user_get_text_popup_rcc_code() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(masterUnitKerjaPenempatanPage.getTextFillRccCode(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User get text popup rcc code");
    }
    @And("User get text popup status")
    public void user_get_text_popup_status() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertEquals(masterUnitKerjaPenempatanPage.getTextFillStatusDropdown(), "Please select an item.");
        extentTest.log(LogStatus.PASS, "User get text popup status");
    }
    @When("Clear data master unit kerja")
    public void clear_data_master_unit_kerja(){
        masterUnitKerjaPenempatanPage.clearDataMasterUnitKerja();
        extentTest.log(LogStatus.PASS,"Clear data master unit kerja");
    }

    @When("User mencari unit kerja active")
    public void user_mencari_unit_kerja_active() throws InterruptedException{
        driver.navigate().refresh();
        masterUnitKerjaPenempatanPage.inputSearchData("Kantor Cabang PT DIKA Bogor");
        extentTest.log(LogStatus.PASS, "User mencari unit kerja active");
        Thread.sleep(1000);
    }
    @And("User scrolldown unit active")
    public void user_scrolldown_unit_active()throws InterruptedException{
        masterUnitKerjaPenempatanPage.clickBtnActive();
        extentTest.log(LogStatus.PASS, "User scrolldown unit active");
        Thread.sleep(1000);
    }
    @Then("User get text unit kerja active")
    public void user_get_text_unit_kerja_active() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterUnitKerjaPenempatanPage.getTxtUnitKerjaActive(),"ACTIVE");
        extentTest.log(LogStatus.PASS,"User get text unit kerja active");
    }
    @And("User scrolldown unit non active")
    public void user_scrolldown_unit_non_active()throws InterruptedException{
        masterUnitKerjaPenempatanPage.clickBtnNonActive();
        extentTest.log(LogStatus.PASS, "User scrolldown unit non active");
        Thread.sleep(1000);
    }
    @Then("User get text unit kerja non active")
    public void user_get_text_unit_kerja_non_active() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterUnitKerjaPenempatanPage.getTxtUnitKerjaNonActive(),"NON-ACTIVE");
        extentTest.log(LogStatus.PASS,"User get text unit kerja non active");
    }
    @When("User mencari kode cabang pembayaran")
    public void user_mencari_kode_cabang_pembayaran() throws InterruptedException{
        driver.navigate().refresh();
        masterUnitKerjaPenempatanPage.inputSearchData("3112");
        extentTest.log(LogStatus.PASS, "User mencari kode cabang pembayaran");
        Thread.sleep(2000);
    }
    @Then("User get text branch code")
    public void user_get_text_branch_code() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterUnitKerjaPenempatanPage.getTxtBranchCode(),"3112");
        extentTest.log(LogStatus.PASS,"User get text branch code");
    }
    @When("User mencari rcc pembayaran")
    public void user_mencari_rcc_pembayaran() throws InterruptedException{
        driver.navigate().refresh();
        masterUnitKerjaPenempatanPage.inputSearchData("987");
        extentTest.log(LogStatus.PASS, "User mencari rcc pembayaran");
        Thread.sleep(2000);
    }
    @Then("User get text rcc code")
    public void user_get_text_rcc_code() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterUnitKerjaPenempatanPage.getTxtRccCode(),"987");
        extentTest.log(LogStatus.PASS,"User get text rcc code");
    }
    @When("User invalid data")
    public void user_invalid_data() throws InterruptedException{
        driver.navigate().refresh();
        masterUnitKerjaPenempatanPage.inputSearchData("Kantor Dika Bandung Timur");
        extentTest.log(LogStatus.PASS, "User invalid data");
        Thread.sleep(2000);
    }
    @Then("User get text workplacement no matching records found")
    public void user_get_text_workpalcement_no_matching_record_found() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(masterUnitKerjaPenempatanPage.getTxtNoMatchingRecordsFound(),"No matching records found");
        extentTest.log(LogStatus.PASS,"User get text workplacement no matching records found");
    }
}
