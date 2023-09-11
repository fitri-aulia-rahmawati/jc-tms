package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAndLogoutPage {
    private WebDriver driver;

    public LoginAndLogoutPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //locator @FindBy
@FindBy(xpath = "//input[@placeholder='NIK']" )
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']" )
    WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Login']" )
    WebElement btnLogin;
    @FindBy(xpath = "//h1[normalize-space()='Dashboard']")
    static
    WebElement txtDashboard;
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    WebElement profile;
    @FindBy(xpath = "//a[normalize-space()='Log Out']")
    WebElement logout;

    @FindBy(xpath = "//*[@id=\"header\"]/div/a")
    WebElement dashboard;
    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
    public void enterUsername(String username){
        this.username.sendKeys(username);
    }

    public void enterPassword(String password){this.password.sendKeys(password); }

    public void clickBtnLogin()  {
        btnLogin.click();
        DriverSingleton.delay(2);
    }
    public void profileLogout(){
        profile.click();
        logout.click();
    }
    public void setDashboard(){
        dashboard.click();
    }
}
