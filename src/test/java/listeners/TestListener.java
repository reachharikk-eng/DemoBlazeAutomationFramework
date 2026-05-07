package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtil;

public class TestListener
        implements ITestListener {

    @Override
    public void onTestFailure(
            ITestResult result) {

        String testName =
                result.getName();

        ScreenshotUtil
                .captureScreenshot(testName);

        System.out.println(
                "Screenshot captured for failed test");
    }
}