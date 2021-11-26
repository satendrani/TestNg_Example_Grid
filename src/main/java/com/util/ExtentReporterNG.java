package com.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.tests.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ExtentReporterNG extends BaseTest {

    static String projectPath = System.getProperty("user.dir");
    static ExtentReports extent;

    public static ExtentReports extendReportGenerator() {

        String reportPath = projectPath + "/Reports/index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Satendra Dixit");
        return extent;
    }

    public static void captureScreenShot(String fileName) throws IOException {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(projectPath + "/resources/screenshots/" + fileName + ".png"));
    }
}
