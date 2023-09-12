package com.juaracoding;

import com.juaracoding.pages.Page2_AbsenMasuk;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class Test2_AbsenMasuk {
    static WebDriver driver;
    static ExtentTest extentTest;

    static Page2_AbsenMasuk absenmasukpage = new Page2_AbsenMasuk();

    public Test2_AbsenMasuk() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
// Scenario : User input position

    @When("User click report absen masuk")
    public void user_click_report_absen_masuk() throws InterruptedException {
//        Thread.sleep(2000);
        delay(2);
        absenmasukpage.clickReportAbsen();
        extentTest.log(LogStatus.PASS, "User click report absen masuk");
    }
    @And("User click absen masuk")
    public void user_click_absen_masuk(){
//        Thread.sleep(2000);
        delay(2);
        absenmasukpage.clickAbsenMasuk();
        extentTest.log(LogStatus.PASS, "User click absen masuk");
    }
    @And("User click position absen masuk")
    public void user_click_position_absen_masuk(){
        absenmasukpage.clickDropDownPosition();
        extentTest.log(LogStatus.PASS, "User click position absen masuk");
    }
    @And("User input list in dropdown absen masuk")
    public void user_input_list_in_dropdown_absen_masuk(){
        absenmasukpage.listDropDownPosition("Super");
        extentTest.log(LogStatus.PASS, "User input list in dropdwon absen masuk");
    }
    @And("User click export data absen masuk")
    public void user_click_export_data_absen_masuk(){
        absenmasukpage.clickExportData();
//        String alert = driver.switchTo().alert().getText();
        extentTest.log(LogStatus.PASS, "User click export data absen masuk");
    }
    @And("User click branch absen masuk")
    public void user_click_branch_absen_masuk(){
        absenmasukpage.clickDropDownBranch();
        extentTest.log(LogStatus.PASS, "User click branch absen masuk");
    }
    @And("User input list in dropdown branch absen masuk")
    public void user_input_list_dropdown_branch_absen_masuk(){
        absenmasukpage.listDropDownBranch("ja");
//        String alert = driver.switchTo().alert().getText();
        extentTest.log(LogStatus.PASS, "User input list in dropdwon branch absen masuk");
    }
    @And("User click unit absen masuk")
    public void user_click_unit_absen_masuk(){
        absenmasukpage.clickDropDownUnit();
        extentTest.log(LogStatus.PASS, "User click unit absen masuk");
    }
    @And("User input list in dropdown unit absen masuk")
    public void user_input_list_in_dropdown_unit_absen_masuk(){
        absenmasukpage.listDropDownUnit("Air");
//        String alert = driver.switchTo().alert().getText();
        extentTest.log(LogStatus.PASS, "User input list in dropdwon unit absen masuk");
    }
    @And("User input start date absen masuk")
    public void start_date(){
        absenmasukpage.inputStartDate("2023-08-14");
        extentTest.log(LogStatus.PASS, "User input start date absen masuk");
    }
    @And("User input end date absen masuk")
    public void end_date(){
        absenmasukpage.inputEndDate("2023-09-04");
        extentTest.log(LogStatus.PASS, "User input end date absen masuk");
    }
    @Then("alert popup masuk")
    public void alert_popup() throws InterruptedException {
        String alert = driver.switchTo().alert().getText();
        Assert.assertEquals(alert,"No data...!!!");
//        Assert.assertEquals(alert, "Maximal Penarikan Data adalah 1 Bulan / 30Hari !!!");
        Thread.sleep(2000);
    driver.switchTo().alert().accept();
    }

}
