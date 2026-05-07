package utils;

import base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil extends BaseTest {

    public static String captureScreenshot(
            String testName) {

        try {

            File srcFile =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.FILE);

            File folder =
                    new File("screenshots");

            if(!folder.exists()) {

                folder.mkdir();
            }

            File destFile =
                    new File(folder,
                            testName + ".png");

            FileUtils.copyFile(srcFile, destFile);

            System.out.println(
                    "Screenshot Saved Successfully");

        } catch (IOException e) {

            e.printStackTrace();
        }

        return testName;
    }
}