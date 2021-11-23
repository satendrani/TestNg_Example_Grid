package com.mypages;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BasePage {

    final String projectPath = System.getProperty("user.dir");

    public WebDriver initializeDriver() {

        System.setProperty("webdriver.chrome.driver", projectPath + "/resources/drivers/chromedriver.exe");
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        return driver;
    }
}
