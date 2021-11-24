package com.mypages;

import com.mypages.BasePage;
import com.util.JiraPolicy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import java.net.MalformedURLException;

public class ExtentReportDemo1 extends BasePage {
    WebDriver driver;

    @JiraPolicy(logTicketReady = false)
    @Test(enabled = true, groups = "sanity")
    public void initialDemoOne() throws InterruptedException {
        System.out.println("initialDemoOne Test... started");
        driver = initializeDriver();
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        Assert.assertTrue(true);
        System.out.println("Title is : " + driver.getTitle());
        System.out.println("initialDemoOne Test... Ended");
        driver.close();
    }
}