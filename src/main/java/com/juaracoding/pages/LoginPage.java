package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//b[normalize-space()='DIKA']")
    WebElement getLoginTxt;

    @FindBy(xpath = "//h1[normalize-space()='404 Page Not Found']")
    WebElement getTxtInvalidUrl;

    @FindBy(xpath = "//input[@placeholder='NIK']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btnLogin;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
    WebElement txtInvalidLogin;

    @FindBy(xpath = "//h1[normalize-space()='Dashboard']")
    WebElement txtDashboard;

    @FindBy(xpath = "//span[normalize-space()='Logout']")
    WebElement btnLogout;

    public String getTxtFillOut(){
        delay(2);
        String output = "";
        String required = username.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }

    public void usernameField(String inputUsername){
        this.username.sendKeys(inputUsername);
    }

    public void passwordField(String inputPassword){
        this.password.sendKeys(inputPassword);
    }

    public void loginBtn(){
        btnLogin.click();
    }
    public String getTxtErrorLogin(){
        return getTxtInvalidUrl.getText();
    }
    public String getLoginPageTxt(){
        DriverSingleton.delay(5);
        return getLoginTxt.getText();
    }

    public String getTxtInvalidLogin(){
        return txtInvalidLogin.getText();
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

    public void logoutBtn(){
        btnLogout.click();
    }
}
