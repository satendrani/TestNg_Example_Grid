package com.mypages;

import com.utils.jiraaccess.JiraPolicy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExtentReportDemo3 extends BasePage {

    public ExtentReportDemo3(WebDriver driver) {
        super(driver);
    }

    @JiraPolicy(logTicketReady = false)
    @Test(enabled = true, groups = "sanity")
    public void initialDemoThree() throws InterruptedException {
        System.out.println("initialDemoThree Test... started");
        driver = initializeDriver("chrome");
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("chrome");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        Assert.assertTrue(true);
        System.out.println("Title is : " + driver.getTitle());
        System.out.println("initialDemoThree Test... Ended");
        driver.close();
    }
}
