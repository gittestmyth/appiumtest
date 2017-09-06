package cases;

import base.BaseAndroid;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Page1;

import utils.ScreenShotListener;

import static utils.Common.isExit;

@Listeners({ScreenShotListener.class})
public class Test1 extends BaseAndroid {
    private final static Logger log=Logger.getLogger(Test1.class.getName());
    private Page1 page1;
    //private Page2 page2;
    @BeforeClass
    public void setUp() throws Exception{
        page1=new Page1(driver);
        //page2=new Page2(driver);
    }
    @Test
    public void test1(){
        /*if (isExit((AndroidDriver)driver, By.name("美食1"))){
            System.out.println("走那个方法了");
            driver.findElementByName("美食").click();
            System.out.println("jinrumeishi");
        }else {
            page1.clickMeiShi();
            System.out.println("元素是否存在说明走了");
        }
        Assert.assertFalse(true);*/
        log.info("测试log1");
        page1.clickMeiShi();
        log.info("测试log21");
        log.info("hahhha");
        //Assert.assertTrue(false);
        //Assert.assertFalse(true);
        //Assert.assertEquals(1,3);
        //Assert.assertTrue(isExit((AndroidDriver)driver,By.id("xxx")));
        //Assert.assertEquals(page1.getText(),"你好");
        //Assert.assertFalse(true);
    }
    //@Test
    //public void test2(){
    //page2.clickMeiShiTwoPage();
    //}
}
