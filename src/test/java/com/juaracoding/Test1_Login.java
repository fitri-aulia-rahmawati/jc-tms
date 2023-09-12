package com.juaracoding;

import com.juaracoding.pages.Page1_Login;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Test1_Login {
    static WebDriver driver;
    static ExtentTest extentTest;
    static Page1_Login loginpage = new Page1_Login();

    public Test1_Login() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User enter url HRM")
    public void user_enter_url_hrm() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User enter url HRM");
    }

    @When("User enter valid NIK")
    public void user_enter_valid_NIK() {
        loginpage.enterUser("admin_tms");
        extentTest.log(LogStatus.PASS, "User enter valid username");
    }

    @And("User enter valid password")
    public void user_enter_valid_password() {
        loginpage.enterPassword("d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "User enter valid password");

    }

    @And("User click button login")
    public void user_click_button_login(){
        loginpage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }
}