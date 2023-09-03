package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage;

    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User Enter Invalid URL TMS")
    public void user_enter_invalid_url_tms(){
        driver.get("https://dev.ptdika.com/tiket/loggin");
        extentTest.log(LogStatus.PASS, "User Enter Invalid URL TMS");
    }

    @Then("User Get Text Error Login Page")
    public void user_get_text_error_login_page(){
        Assert.assertEquals(loginPage.getTxtErrorLogin(),"404 Page Not Found");
        extentTest.log(LogStatus.PASS,"User Get Text Error Login Page");
    }
    @Given("User Enter Valid URL TMS")
    public void user_enter_valid_url_tms(){
        driver.get("https://dev.ptdika.com/tiket/login");
        extentTest.log(LogStatus.PASS, "User Enter Valid URL TMS");
    }

    @Then("User Get Text Login Page")
    public void user_get_text_login_page(){
        Assert.assertEquals(loginPage.getTxtLoginPage(),"TMS");
        extentTest.log(LogStatus.PASS,"User Get Text Login Page");
    }
}
