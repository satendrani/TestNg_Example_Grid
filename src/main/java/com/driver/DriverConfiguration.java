package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class DriverConfiguration {
    public static final String projectPath = System.getProperty("user.dir");
    public static WebDriver driver;

    public WebDriver initializeDriver(String BrowserName) {

        if (BrowserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)).pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        } else if (BrowserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)).pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        } else if (BrowserName.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", projectPath + "/resources/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)).pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }
        return driver;
    }
}
