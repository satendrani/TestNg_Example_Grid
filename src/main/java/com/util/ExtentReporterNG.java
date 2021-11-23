package com.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

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
}
