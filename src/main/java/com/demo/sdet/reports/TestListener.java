package com.demo.sdet.reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.demo.sdet.utils.ScreenshotUtils;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {

        ExtentManager.getExtentReports();

    }

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest test =
                ExtentManager
                        .getExtentReports()
                        .createTest(result.getMethod().getMethodName());

        ExtentTestManager.setTest(test);

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        String screenshot =
                ScreenshotUtils.captureScreenshot(
                        result.getMethod().getMethodName()
                );

        ExtentTestManager
                .getTest()
                .pass("Test Passed");

        try {

            ExtentTestManager
                    .getTest()
                    .addScreenCaptureFromPath(screenshot);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    @Override
    public void onTestFailure(ITestResult result) {

        String screenshot =
                ScreenshotUtils.captureScreenshot(
                        result.getMethod().getMethodName());

        ExtentTestManager
                .getTest()
                .fail(result.getThrowable());

        try {

            ExtentTestManager
                    .getTest()
                    .addScreenCaptureFromPath(screenshot);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {

        ExtentTestManager
                .getTest()
                .skip("Test Skipped");

    }

    @Override
    public void onFinish(ITestContext context) {

        ExtentManager
                .getExtentReports()
                .flush();

    }

}