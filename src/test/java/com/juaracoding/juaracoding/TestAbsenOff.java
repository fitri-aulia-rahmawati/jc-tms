package com.juaracoding.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AbsenOffPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAbsenOff {
    static WebDriver driver;
    static ExtentTest extentTest;
    static AbsenOffPage absenOffPage = new AbsenOffPage();
    public TestAbsenOff() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("User click Absen Off Page")
    public void user_click_absen_off_page() {
        DriverSingleton.delay(1);
        absenOffPage.clickAbsenOffPage();
        extentTest.log(LogStatus.PASS, "user clik absen off page");
    }

    @Then("User get text Absen Off")
    public void user_get_text_Absen_Off(){
        DriverSingleton.delay(1);
        Assert.assertEquals(absenOffPage.TxtAbsenOff(), "Absen Off");
        extentTest.log(LogStatus.PASS, "User get text Absen Off");
    }

}
