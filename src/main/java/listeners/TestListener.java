package listeners;

import driver.DriverFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.ReportManager;
import utilities.ScreenshotUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestListener implements ITestListener {

    private ExtentReports extent =
            ReportManager.getReport();

    private ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");

    }

    @Override
    public void onTestFailure(ITestResult result) {

        String path =
                ScreenshotUtils.captureScreenshot(
                        DriverFactory.getDriver(),
                        result.getName());

        test.fail(result.getThrowable());

        test.addScreenCaptureFromPath(path);

    }
    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

    }

}