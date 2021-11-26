package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfiguration {
    public final String projectPath = System.getProperty("user.dir");
    public static WebDriver driver;

    public WebDriver initializeDriver() {

        System.setProperty("webdriver.chrome.driver", projectPath + "/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        return driver;
    }
}
