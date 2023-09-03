package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "brand")
    WebElement getTxtLogin;

    @FindBy(xpath = "//h1[normalize-space()='404 Page Not Found']")
    WebElement getTxtInvalidLogin;

    public String getTxtErrorLogin(){
        return getTxtInvalidLogin.getText();
    }

    public String getTxtLoginPage(){
        return getTxtLogin.getText();
    }
}
