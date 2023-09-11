package com.juaracoding.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AbsenSakitPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAbsenSakit {
    static WebDriver driver;
    static ExtentTest extentTest;
    static AbsenSakitPage absenSakitPage = new AbsenSakitPage();
    public TestAbsenSakit() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("User click Absen Sakit Page")
    public void user_click_absen_sakit_page() {
        DriverSingleton.delay(1);
        absenSakitPage.clickAbsenSakitPage();
        extentTest.log(LogStatus.PASS, "user clik absen sakit page");
    }

    @Then("User get text Absen Sakit")
    public void user_get_text_Absen_Sakit()  {
        DriverSingleton.delay(1);
        Assert.assertEquals(absenSakitPage.TxtAbsenSakit(), "Absen Sakit");
        extentTest.log(LogStatus.PASS, "User get text Absen Sakit");
    }

}
