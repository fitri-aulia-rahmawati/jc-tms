package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User enter url TMS")
    public void user_enter_url_tms(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User enter url TMS");
    }

    @When("User enter valid username")
    public void user_enter_valid_username(){
        loginPage.enterUsername("admin_tms");
        extentTest.log(LogStatus.PASS,"User enter valid username");
    }

    @And("User enter valid password")
    public void user_enter_valid_password(){
        loginPage.enterPassword("d1k4@passw0rd");
        extentTest.log(LogStatus.PASS,"User enter valid password");
    }

    @And("User click button login")
    public void user_click_button_login(){
        loginPage.clickButton();
        extentTest.log(LogStatus.PASS,"User click button login");
    }

    @Then("User get text title dashboard page")
    public void user_get_text_title_dashboard_page(){
        Assert.assertEquals(loginPage.getTxtDashboard(),"Dashboard");
        extentTest.log(LogStatus.PASS,"User get text title dashboard page");
    }


}
