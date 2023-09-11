package com.juaracoding.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAfterValidAbsen {
    static WebDriver driver;
    static ExtentTest extentTest;
    public TestAfterValidAbsen() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Then("alert popup izin")
    public void alert_popup_izin()  {
        DriverSingleton.delay(1);
        String alert = driver.switchTo().alert().getText();
        Assert.assertEquals(alert, "Anda sedang izin !!");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS, "user get alert izin");
    }

    @Then("alert popup sakit")
    public void alert_popup_sakit()  {
        DriverSingleton.delay(1);
        String alert = driver.switchTo().alert().getText();
        Assert.assertEquals(alert, "Anda sedang sakit !!");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS, "user get alert sakit");
    }

    @Then("alert popup off")
    public void alert_popup_off()  {
        DriverSingleton.delay(1);
        String alert = driver.switchTo().alert().getText();
        Assert.assertEquals(alert, "Anda sedang off !!");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS, "user get alert off");
    }

    @Then("alert popup")
    public void alert_popup() {
        try {
            String alert = driver.switchTo().alert().getText();
            switch (alert) {
                case "Anda sedang izin !!" -> {
                    Assert.assertEquals(alert, "Anda sedang izin !!");
                    extentTest.log(LogStatus.PASS, "user get alert izin");
                }
                case "Anda sedang sakit !!" -> {
                    Assert.assertEquals(alert, "Anda sedang sakit !!");
                    extentTest.log(LogStatus.PASS, "user get alert sakit");
                }
                case "Anda sedang off !!" -> {
                    Assert.assertEquals(alert, "Anda sedang off !!");
                    extentTest.log(LogStatus.PASS, "user get alert off");
                }
                default -> extentTest.log(LogStatus.FAIL, "wrong alert");
            }
            System.out.println("tidak ditemukan");
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            DriverSingleton.delay(1);
            extentTest.log(LogStatus.FAIL, "user cant get alert");
            driver.switchTo().alert().accept();
        }
    }
}
