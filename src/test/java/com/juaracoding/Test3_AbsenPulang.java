package com.juaracoding;

import com.juaracoding.pages.Page3_AbsenPulang;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class Test3_AbsenPulang {
    static WebDriver driver;
    static ExtentTest extentTest;
    static Page3_AbsenPulang absenpulangpage = new Page3_AbsenPulang();

    public Test3_AbsenPulang() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click report absen pulang")
    public void user_click_report_absen_pulang() throws InterruptedException {
//        Thread.sleep(2000);
        delay(2);
        absenpulangpage.clickReportAbsen();
        extentTest.log(LogStatus.PASS, "User click report absen pulang");
    }

    @And("User click absen pulang")
    public void user_click_absen_pulang(){
        absenpulangpage.clickAbsenPulang();
        extentTest.log(LogStatus.PASS, "User click absen pulang");
    }
    @And("User click position absen pulang")
    public void user_click_position_ap(){
        absenpulangpage.clickDropDownPosition();
        extentTest.log(LogStatus.PASS, "User click position absen pulang");
    }
    @And("User input list in dropdown absen pulang")
    public void user_input_list_in_dropdown_ap(){
        absenpulangpage.listDropDownPosition("hel");
        extentTest.log(LogStatus.PASS, "User input list in dropdwon absen pulang");
    }
    @And("User click export data absen pulang")
    public void user_click_export_data_absen_pulang(){
        absenpulangpage.clickExportData();
//        String alert = driver.switchTo().alert().getText();
        extentTest.log(LogStatus.PASS, "User click export data absen pulang");
    }
    @And("User click branch absen pulang")
    public void user_click_branch_ap(){
        absenpulangpage.clickDropDownBranch();
        extentTest.log(LogStatus.PASS, "User click branch absen pulang");
    }
    @And("User input list in dropdown branch absen pulang")
    public void user_input_list_branch_ap(){
        absenpulangpage.listDropDownBranch("ja");
        extentTest.log(LogStatus.PASS, "User input list in dropdwon branch absen pulang");
    }
    @And("User click unit absen pulang")
    public void user_click_unit_ap(){
        absenpulangpage.clickDropDownUnit();
        extentTest.log(LogStatus.PASS, "User click unit absen pulang");
    }
    @And("User input list in dropdown unit absen pulang")
    public void user_input_list_unit(){
        absenpulangpage.listDropDownUnit("bca");
        extentTest.log(LogStatus.PASS, "User input list in dropdwon unit absen pulang");
    }
    @And("User input start date absen pulang")
    public void start_date(){
        absenpulangpage.inputStartDate("2023-08-07");
        extentTest.log(LogStatus.PASS, "User input start date absen pulang");
    }
    @And("User input end date absen pulang")
    public void end_date(){
        absenpulangpage.inputEndDate("2023-09-04");
        extentTest.log(LogStatus.PASS, "User input end date absen pulang");
    }
    @Then("alert popup absen")
    public void alert_popup_ap() throws InterruptedException {
        delay(3);
        String alert = driver.switchTo().alert().getText();
        Assert.assertEquals(alert,"No data...!!!");
//        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
    @Then("alert popup absen pulang")
    public void alert_max30hari() throws InterruptedException {
        delay(3);
        String alert = driver.switchTo().alert().getText();
        Assert.assertEquals(alert, "Maximal Penarikan Data adalah 1 Bulan / 31 Hari !!!");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
}
