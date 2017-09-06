package utils;
import java.io.File;
import java.io.IOException;

import base.BaseAndroid;
import cases.Test1;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import pages.BasePage;

import java.io.File;
import java.io.IOException;

public class ScreenShotListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr) {
        AndroidDriver driver= BaseAndroid.driver;
        //监控截图的driver
        //AndroidDriver<WebElement> driver = apkRemoteControl.driver;
        // 截图文件夹
        File location = new File("screenshots1");
        //截图位置及文件名  名称为 标识 + 类名 + 方法名
        String screenShotName = location.getAbsolutePath() + File.separator + tr.getMethod().getMethodName() + ".png";
        //
        File screenShot = driver.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File(screenShotName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

