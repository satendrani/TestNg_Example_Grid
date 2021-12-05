package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utils.jiraaccess.JiraPolicy;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class ExtentReportDemo1 extends BasePage {


    public ExtentReportDemo1(WebDriver driver) {
        super(driver);
    }

    @JiraPolicy(logTicketReady = false)
    @Test(enabled = true, groups = "sanity")
    public void initialDemoOne(Method method) throws InterruptedException {
        //ExtentReports Description
        startTest(method.getName(), "initial demo one");

        System.out.println("initialDemoOne Test... started");
        driver = initializeDriver("chrome");
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Satendra Dxit");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        Assert.assertTrue(true);
        System.out.println("Title is : " + driver.getTitle());
        System.out.println("initialDemoOne Test... Ended");
        driver.quit();
    }
}
