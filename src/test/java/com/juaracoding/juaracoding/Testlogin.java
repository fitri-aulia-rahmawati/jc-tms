package com.juaracoding.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginAndLogoutPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Testlogin {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginAndLogoutPage loginAndLogoutPage = new LoginAndLogoutPage();

    public Testlogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User enter url HRM")
    public void user_enter_url_hrm() {
        driver.get("https://dev.ptdika.com/tiket/login");
        extentTest.log(LogStatus.PASS, "User enter url HRM");
    }

    @When("User enter valid username1")
    public void user_enter_valid_username1() {
        loginAndLogoutPage.enterUsername("D8221973");
        extentTest.log(LogStatus.PASS, "User enter valid username");
    }

    @And("User enter valid password1")
    public void user_enter_valid_password1() {
        loginAndLogoutPage.enterPassword("1996-08-06");
        extentTest.log(LogStatus.PASS, "User enter valid password");
    }
    @When("User enter valid username2")
    public void user_enter_valid_username2() {
        loginAndLogoutPage.enterUsername("D8221977");
        extentTest.log(LogStatus.PASS, "User enter valid username");
    }

    @And("User enter valid password2")
    public void user_enter_valid_password2() {
        loginAndLogoutPage.enterPassword("1995-01-01");
        extentTest.log(LogStatus.PASS, "User enter valid password");
    }
    @When("User enter valid username3")
    public void user_enter_valid_username3() {
        loginAndLogoutPage.enterUsername("D8221971");
        extentTest.log(LogStatus.PASS, "User enter valid username");
    }

    @And("User enter valid password3")
    public void user_enter_valid_password3() {
        loginAndLogoutPage.enterPassword("1994-07-13");
        extentTest.log(LogStatus.PASS, "User enter valid password");
    }

    @And("User click button login")
    public void user_click_button_login()  {
        loginAndLogoutPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("User get text title page dashboard")
    public void user_get_text_title_page_dashboard() {
        DriverSingleton.delay(2);
        Assert.assertEquals(loginAndLogoutPage.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "User get text title page dashboard");
    }

    @When("Profile Logout")
    public void profile_logout() {
        loginAndLogoutPage.profileLogout();
        extentTest.log(LogStatus.PASS, "user melakukan logout");
    }
}

