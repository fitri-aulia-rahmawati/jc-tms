package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
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

public class LoginTest {

    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();

    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User Enter Invalid URL TMS")
    public void user_enter_invalid_url_tms(){
        driver.get(Constants.URL_INVALID);
        extentTest.log(LogStatus.PASS, "User Enter Invalid URL TMS");
    }

    @Then("User Get Text Error Login Page")
    public void user_get_text_error_login_page(){
        Assert.assertEquals(loginPage.getTxtErrorLogin(),"404 Page Not Found");
        extentTest.log(LogStatus.PASS,"User Get Text Error Login Page");
    }

    @Given("User Enter Valid URL TMS")
    public void user_enter_valid_url_tms(){
        driver.get(Constants.URL_VALID);
        extentTest.log(LogStatus.PASS, "User Enter Valid URL TMS");
        DriverSingleton.delay(3);
    }

    @Then("User Get Text Login Page")
    public void user_get_text_login_page(){
        DriverSingleton.delay(3);
        Assert.assertEquals(loginPage.getLoginPageTxt(),"DIKA");
        extentTest.log(LogStatus.PASS,"User Get Text Login Page");
    }

    @When("User Input Invalid Username")
    public void user_input_invalid_username(){
        loginPage.usernameField("admin_lms");
    }

    @And("User Input Invalid Password")
    public void user_input_invalid_password(){
        loginPage.passwordField("d1k4@passsword");
    }

    @Then("User Get Text Alert Fill")
    public void user_get_text_alert_fill(){
        Assert.assertEquals(loginPage.getTxtFillOut(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User Must Fill The Blank");
        driver.navigate().refresh();
    }

    @Then("User Get Text Wrong Credentials")
    public void user_get_text_wrong_credentials(){
        DriverSingleton.delay(3);
        Assert.assertEquals(loginPage.getTxtInvalidLogin(),"×\n" + "Wrong username or password..!");
        extentTest.log(LogStatus.PASS,"User Get Text Dashboard");
    }
    @When("User Input Username Admin")
    public void user_input_valid_username(){
        DriverSingleton.delay(3);
        loginPage.usernameField(Constants.USER_ADMIN);
    }

    @And("User Input Password Admin")
    public void user_input_password_admin(){
        loginPage.passwordField(Constants.PASSWORD_ADMIN);}

    @And("User Click Login Button")
    public void user_click_login_button(){
        loginPage.loginBtn();
    }

    @Then("User Get Text Dashboard")
    public void user_get_text_dashboard(){
        DriverSingleton.delay(3);
        Assert.assertEquals(loginPage.getTxtDashboard(),"Selamat datang, Admin TMS");
        extentTest.log(LogStatus.PASS,"User Get Text Dashboard");
    }

    @When("User Click Logout Button")
    public void user_click_logout_button(){
        loginPage.logoutBtn();
    }
}
