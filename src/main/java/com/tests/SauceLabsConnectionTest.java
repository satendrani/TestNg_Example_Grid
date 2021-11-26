package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsConnectionTest {

    WebDriver driver;
    String projectPath = System.getProperty("user.dir");

    public static String USER_NAME = "oauth-satendrani-63d14";
    public static String ACCESS_KEY = "b878f0fb-41b1-4359-a133-81aedfdfcdcd";
    public static String URL_ = "https://" + USER_NAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

    @Test
    public void runOnSauceLabs() throws MalformedURLException {
        System.out.println("Sauce Lab test... started");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "96");
        capabilities.setCapability("name", "LinkedinLoginTest");
        capabilities.setCapability("extendedDebugging", "true");

        WebDriver driver = new RemoteWebDriver(new URL(URL_), capabilities);

//        System.setProperty("webdriver.chrome.driver", projectPath+"/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();

        driver.get("https://www.linkedin.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        driver.findElement(By.name("session_key")).sendKeys("satendra@gmail.com");
        driver.findElement(By.name("session_password")).sendKeys("ndskjiGskjfrm");
        driver.findElement(By.name("session_password")).sendKeys(Keys.ENTER);
        System.out.println("Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Security Verification | LinkedIn");

        driver.close();
        System.out.println("Sauce Lab test... ended");
    }

}