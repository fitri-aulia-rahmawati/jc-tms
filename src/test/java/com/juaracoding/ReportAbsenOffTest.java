package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.ReportAbsenOffPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ReportAbsenOffTest {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ReportAbsenOffPage reportAbsenOffPage = new ReportAbsenOffPage();

    public ReportAbsenOffTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User Click Report Absen Menu")
    public void user_click_report_absen_menu(){
        reportAbsenOffPage.reportAbsen();
    }

    @And("User Click Absen Off Menu")
    public void user_click_absen_off_menu(){
        reportAbsenOffPage.absenOff();
        extentTest.log(LogStatus.PASS,"User Click Absen Off Menu");
    }

    @And("User Click Position Dropdown")
    public void user_select_position(){
        reportAbsenOffPage.positionDd();
    }

    @And("User Input Position")
    public void user_input_position(){
        reportAbsenOffPage.ddField("ALL");
    }

    @And("User Click Branch Dropdown")
    public void user_click_branch_dropdown(){
        reportAbsenOffPage.branchDd();
    }

    @And("User Input Branch")
    public void user_input_branch(){
        reportAbsenOffPage.ddField("ALL");
    }

    @And("User Click Unit Dropdown")
    public void user_click_unit_dropdown(){
        reportAbsenOffPage.unitDd();
    }

    @And("User Input Unit")
    public void user_input_unit(){
        reportAbsenOffPage.ddField("ALL");
    }

    @And("User Input Start Date")
    public void user_input_start_date(){
        reportAbsenOffPage.startDate("2023-09-01");
    }


    @And("User Input End Date")
    public void user_input_end_date(){
        reportAbsenOffPage.endDate("2023-09-30");
        DriverSingleton.delay(7);
    }

    @And("User Input End Date More Than One Month")
    public void user_input_end_date_more_than_one_month(){
        reportAbsenOffPage.endDate("2023-12-16");
        DriverSingleton.delay(7);
    }

    @Then("User Get Text Alert Month")
    public void user_get_text_alert_month(){
        Assert.assertEquals(reportAbsenOffPage.alerMonth(),"Maximal Penarikan Data adalah 1 Bulan / 31 Hari !!!");
        reportAbsenOffPage.alertMonthClick();
        extentTest.log(LogStatus.PASS,"User Get Text Alert Maximal Date");
    }

    @And("User Click Export Button")
    public void user_click_export_button(){
        reportAbsenOffPage.exportBtn();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS,"User Export Report Absen Off");
    }

    @Then("User Get Text Alert")
    public void user_get_text_alert(){
        Assert.assertEquals(reportAbsenOffPage.alert(),"No data...!!!");
        reportAbsenOffPage.alertClick();
        extentTest.log(LogStatus.PASS,"User Get Text Alert");
    }

}
