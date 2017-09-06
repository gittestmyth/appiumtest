package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseAndroid {
    public static AndroidDriver driver;
    @BeforeClass
    public static void beforeClass() throws Exception{
        PropertyConfigurator.configure("D:\\IdeaProjects\\Appiumtest04\\log4j.properties");
        DesiredCapabilities cap = new DesiredCapabilities();
        //cap.setCapability(CapabilityType.BROWSER_NAME, "");
        //cap.setCapability("app","D:\\BaiduNetdiskDownload\\group-545_0-meituan.apk");
        //cap.setCapability("noReset","True");//是否从新安装APK
        //cap.setCapability("noSign","True");//跳过重签名
        //cap.setCapability("fullReset","True");//卸载应用
        cap.setCapability("autoLaunch","True");
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "127.0.0.1:62001");
        cap.setCapability("platformVersion", "4.4.2");
        cap.setCapability("unicodeKeyboard",true);
        cap.setCapability("resetKeyboard",true);
        cap.setCapability("appPackage", "com.sankuai.meituan");
        cap.setCapability("appActivity", "com.sankuai.meituan.activity.Welcome");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    }
    @AfterClass
    public static void afterClass() throws Exception{
        driver.quit();
    }
}
