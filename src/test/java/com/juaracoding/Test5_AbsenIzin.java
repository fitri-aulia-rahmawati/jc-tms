package com.juaracoding;

import com.juaracoding.pages.Page5_AbsenIzin;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Test5_AbsenIzin {
    static WebDriver driver;
    static ExtentTest extentTest;
    static Page5_AbsenIzin absenizinpage = new Page5_AbsenIzin();

    public Test5_AbsenIzin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click report absen izin")
    public void user_click_report_izin() throws InterruptedException {
        Thread.sleep(2000);
//        delay(2);
        absenizinpage.clickReportAbsen();
        extentTest.log(LogStatus.PASS, "User click report absen izin");
    }

    @And("User click absen izin")
    public void user_click_absen_sakit() {
        absenizinpage.clickAbsenIzin();
        extentTest.log(LogStatus.PASS, "User click absen izin");
    }

    @And("User click position absen izin")
    public void user_click_position() {
        absenizinpage.clickDropDownPosition();
        extentTest.log(LogStatus.PASS, "User click position absen izin");
    }

    @And("User input list in dropdown absen izin")
    public void user_input_list_in_dropdown_izin() {
        absenizinpage.listDropDownPosition("Sales Quality Control");
        extentTest.log(LogStatus.PASS, "User input list in dropdwon absen izin");
    }

    @And("User click export data absen izin")
    public void user_click_export_data_absen_izin() {
        absenizinpage.clickExportData();
//        String alert = driver.switchTo().alert().getText();
        extentTest.log(LogStatus.PASS, "User click export data absen izin");
    }

    @And("User click branch absen izin")
    public void user_click_branch_izin() {
        absenizinpage.clickDropDownBranch();
        extentTest.log(LogStatus.PASS, "User click branch absen izin");
    }

    @And("User input list in dropdown branch absen izin")
    public void user_input_list_branch_izin() {
        absenizinpage.listDropDownBranch("ja");
        extentTest.log(LogStatus.PASS, "User input list in dropdwon branch absen izin");
    }

    @And("User click unit absen izin")
    public void user_click_unit_izin() {
        absenizinpage.clickDropDownUnit();
        extentTest.log(LogStatus.PASS, "User click unit absen izin");
    }

    @And("User input list in dropdown unit absen izin")
    public void user_input_list_unit() {
        absenizinpage.listDropDownUnit("bn");
        extentTest.log(LogStatus.PASS, "User input list in dropdwon unit absen izin");
    }

    @And("User input start date absen izin")
    public void start_date() {
        absenizinpage.inputStartDate("2023-08-01");
        extentTest.log(LogStatus.PASS, "User input start date absen izin");
    }

    @And("User input end date absen izin")
    public void end_date() {
        absenizinpage.inputEndDate("2023-08-31");
        extentTest.log(LogStatus.PASS, "User input end date absen izin");
    }

    @Then("alert popup absen izin")
    public void alert_popup_izin() throws InterruptedException {
        String alert = driver.switchTo().alert().getText();
        Assert.assertEquals(alert, "No data...!!!");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }

    @Then("alert popup izin")
    public void alert_max30hari() throws InterruptedException {
        String alert = driver.switchTo().alert().getText();
        Assert.assertEquals(alert, "Maximal Penarikan Data adalah 1 Bulan / 31 Hari !!!");
        Thread.sleep(2000);
//        delay(2);
        driver.switchTo().alert().accept();
    }
}
