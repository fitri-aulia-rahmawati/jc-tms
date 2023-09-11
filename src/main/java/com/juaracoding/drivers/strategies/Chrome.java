package com.juaracoding.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy{
    @Override
    public WebDriver setStrategy() {
        String path = "C:\\MyTools\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("useAutomationExtension",false);
        chromeOptions.addArguments("--no-sandbox");
        return new ChromeDriver(chromeOptions);
    }
}
