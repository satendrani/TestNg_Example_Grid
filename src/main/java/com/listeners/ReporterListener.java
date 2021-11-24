package com.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ScreenCapture;
import com.util.ExtentReporterNG;
import com.util.JiraPolicy;
import com.util.JiraServiceProvider;
import net.rcarz.jiraclient.JiraException;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ReporterListener implements ITestListener {
    ExtentReports extent = ExtentReporterNG.extendReportGenerator();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        test.log(Status.PASS, "Successful");
//        test.addScreenCaptureFromPath()

    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());

        JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
        boolean isTicketReady = jiraPolicy.logTicketReady();

        if (isTicketReady) {
            //raise jira ticket
            System.out.println("is ticket ready for JIRA: " + isTicketReady);
            JiraServiceProvider jiraSp = new JiraServiceProvider("https://satendrani.atlassian.net/", "satendrani@gmail.com", "Eddnqf47Gk7GESuEz2dy8662", "SAT");
            String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName() + "got failed due to some assertion or execution";
            String issueDescription = result.getThrowable().getMessage() + "\n";
            issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));

            try {
                jiraSp.createJiraTicket("Task", issueSummary, issueDescription, "Satendra Dixit");
            } catch (JiraException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("don't raise Jira ticket ");
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
