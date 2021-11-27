package com.mypages;

import com.utils.jiraaccess.JiraPolicy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExtentReportDemo2 extends BasePage {

    public ExtentReportDemo2(WebDriver driver) {
        super(driver);
    }

    @JiraPolicy(logTicketReady = false)
    @Test(enabled = true, groups = "sanity")
    public void initialDemoTwo() throws InterruptedException {
        System.out.println("initialDemoTwo Test... started");
        driver = initializeDriver("chrome");
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        Assert.assertTrue(false);
        System.out.println("Title is : " + driver.getTitle());
        System.out.println("initialDemoTwo Test... Ended");
        driver.close();
    }
}
