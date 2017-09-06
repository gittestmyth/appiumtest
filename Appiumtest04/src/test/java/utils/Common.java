package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Common {
    public static boolean isExit(AndroidDriver driver,By selector){
        try {
            driver.findElement(selector);
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }
}
