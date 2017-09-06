package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBys;

import java.util.List;

//import static utils.Common.isExit;

public class Page1 extends BasePage {

    public Page1(AndroidDriver driver) {
        super(driver);
    }
    @AndroidFindBy(id = "com.sankuai.meituan:id/tv_icon_text")
    private  AndroidElement meishiButton;

    //@AndroidFindBys({@AndroidFindBy(id = "com.sankuai.meituan:id/tv_icon_text")})
    /*@AndroidFindBys({@AndroidFindBy(className = "android.widget.TextView")})
    List<WebElement> movieButton;*/
    //public setOp(){
    //@AndroidFindBys({@AndroidFindBy(id = "kk")})
    //List<WebElement> aa;
    //}


    //@AndroidFindBys({@AndroidFindBy(id = "com.sankuai.meituan:id/tv_icon_text")})
    //@AndroidFindBys({@AndroidFindBy(className = "xx")})
    //List <WebElement>  aa;

    public void clickMeiShi(){
        meishiButton.click();
        //aa.get(1).click();
        //movieButton.get(1).click();

    }
    /*public String getText(){
        return meishiButton.getText();
    }*/

}
