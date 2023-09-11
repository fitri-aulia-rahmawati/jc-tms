package com.juaracoding.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AbsenPulangPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAbsenPulang {
    static WebDriver driver;
    static ExtentTest extentTest;
    static AbsenPulangPage absenPulangPage = new AbsenPulangPage();
    public TestAbsenPulang() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("User click Absen Pulang Page")
    public void user_click_absen_pulang_page() {
        absenPulangPage.clickAbsenPulangPage();
        extentTest.log(LogStatus.PASS, "user clik absen pulang page");
        DriverSingleton.delay(1);
    }

    @Then("User get text Absen Pulang")
    public void user_get_text_Absen_Pulang() {
        DriverSingleton.delay(1);
        Assert.assertEquals(absenPulangPage.TxtAbsenPulang(), "Absen Pulang");
        extentTest.log(LogStatus.PASS, "User get text Absen Pulang");
    }

}
