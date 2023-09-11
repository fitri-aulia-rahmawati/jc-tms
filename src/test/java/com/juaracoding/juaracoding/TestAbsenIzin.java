package com.juaracoding.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AbsenIzinPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAbsenIzin {static WebDriver driver;
    static ExtentTest extentTest;
    static AbsenIzinPage absenIzinPage = new AbsenIzinPage();
    public TestAbsenIzin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("User click Absen Izin Page")
    public void user_click_absen_izin_page() {
        DriverSingleton.delay(1);
        absenIzinPage.clickAbsenIzinPage();
        extentTest.log(LogStatus.PASS, "user clik absen izin page");
    }

    @Then("User get text Absen Izin")
    public void user_get_text_Absen_Izin() {
        DriverSingleton.delay(1);
        Assert.assertEquals(absenIzinPage.TxtAbsenIzin(), "Absen Izin");
        extentTest.log(LogStatus.PASS, "User get text Absen Izin");
    }

}
