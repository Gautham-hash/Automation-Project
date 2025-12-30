package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;
import utility.ScreenShotUtil;

public class Listener extends TestBase implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Test Failed: " + result.getName());

        if (driver != null) {
            ScreenShotUtil.takeScreenshot(driver, result.getName());
        }
    }
}