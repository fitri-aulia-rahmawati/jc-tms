package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStaffTest {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();

    public LoginStaffTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User Input Username Staff1")
    public void user_input_username_staff1(){
        loginPage.usernameField(Constants.USER_STAFF1);
    }

    @And("User Input Password Staff1")
    public void user_input_password_staff1(){
        loginPage.passwordField(Constants.PASSWORD_STAFF1);
    }

    @When("User Input Username Staff2")
    public void user_input_username_staff2(){
        loginPage.usernameField(Constants.USER_STAFF2);
    }

    @And("User Input Password Staff2")
    public void user_input_password_staff2(){
        loginPage.passwordField(Constants.PASSWORD_STAFF2);
    }

    @When("User Input Username Staff3")
    public void user_input_username_staff3(){
        loginPage.usernameField(Constants.USER_STAFF3);
    }

    @And("User Input Password Staff3")
    public void user_input_password_staff3(){
        loginPage.passwordField(Constants.PASSWORD_STAFF3);
    }

    @When("User Input Username Staff4")
    public void user_input_username_staff4(){
        loginPage.usernameField(Constants.USER_STAFF4);
    }

    @And("User Input Password Staff4")
    public void user_input_password_staff4(){
        loginPage.passwordField(Constants.PASSWORD_STAFF4);
    }

    @When("User Input Username Staff5")
    public void user_input_username_staff5(){ loginPage.usernameField(Constants.USER_STAFF5); }

    @And("User Input Password Staff5")
    public void user_input_password_staff5(){
        loginPage.passwordField(Constants.PASSWORD_STAFF5);
    }

    @When("User Click Logout Button")
    public void user_click_logout_button(){
        loginPage.logoutBtn();
    }
}
