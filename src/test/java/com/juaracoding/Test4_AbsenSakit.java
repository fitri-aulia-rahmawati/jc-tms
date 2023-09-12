package com.juaracoding;

import com.juaracoding.pages.Page4_AbsenSakit;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Test4_AbsenSakit {
    static WebDriver driver;
    static ExtentTest extentTest;
    static Page4_AbsenSakit absensakitpage = new Page4_AbsenSakit();

    public Test4_AbsenSakit() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click report absen sakit")
    public void user_click_report_as() throws InterruptedException {
//        delay(3);
        Thread.sleep(3000);
        absensakitpage.clickReportAbsen();
        extentTest.log(LogStatus.PASS, "User click report absen sakit");
    }

    @And("User click absen sakit")
    public void user_click_absen_sakit(){
//        delay(5);

        absensakitpage.clickAbsenSakit();
        extentTest.log(LogStatus.PASS, "User click absen sakit");
    }
    @And("User click position absen sakit")
    public void user_click_position(){
        absensakitpage.clickDropDownPosition();
        extentTest.log(LogStatus.PASS, "User click position absen sakit");
    }
    @And("User input list in dropdown absen sakit")
    public void user_input_list_in_dropdown_as(){
        absensakitpage.listDropDownPosition("Help");
        extentTest.log(LogStatus.PASS, "User input list in dropdwon absen sakit");
    }
    @And("User click export data absen sakit")
    public void user_click_export_data_absen_sakit(){
        absensakitpage.clickExportData();
//        String alert = driver.switchTo().alert().getText();
        extentTest.log(LogStatus.PASS, "User click export data absen sakit");
    }
    @And("User click branch absen sakit")
    public void user_click_branch_as(){
        absensakitpage.clickDropDownBranch();
        extentTest.log(LogStatus.PASS, "User click branch absen sakit");
    }
    @And("User input list in dropdown branch absen sakit")
    public void user_input_list_branch_as(){
        absensakitpage.listDropDownBranch("Ja");
        extentTest.log(LogStatus.PASS, "User input list in dropdwon branch absen sakit");
    }
    @And("User click unit absen sakit")
    public void user_click_unit_as(){
        absensakitpage.clickDropDownUnit();
        extentTest.log(LogStatus.PASS, "User click unit absen sakit");
    }
    @And("User input list in dropdown unit absen sakit")
    public void user_input_list_unit(){
        absensakitpage.listDropDownUnit("BCA");
        extentTest.log(LogStatus.PASS, "User input list in dropdwon unit absen sakit");
    }
    @And("User input start date absen sakit")
    public void start_date(){
        absensakitpage.inputStartDate("2023-08-15");
        extentTest.log(LogStatus.PASS, "User input start date absen sakit");
    }
    @And("User input end date absen sakit")
    public void end_date(){
        absensakitpage.inputEndDate("2023-09-06");
        extentTest.log(LogStatus.PASS, "User input end date absen sakit");
    }
    @Then("alert popup absen sakit")
    public void alert_popup_as() throws InterruptedException {
        String alert = driver.switchTo().alert().getText();
        Assert.assertEquals(alert,"No data...!!!");
//        Assert.assertEquals(alert, "Maximal Penarikan Data adalah 1 Bulan / 30Hari !!!");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
}
