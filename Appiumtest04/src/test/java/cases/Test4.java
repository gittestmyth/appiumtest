package cases;

import org.testng.annotations.Test;

public class Test4 {
    @Test
    public void Test5(){
        System.out.println("Test5");
    }
    @Test(dependsOnMethods = {"Test7"})
    public void Test6(){
        System.out.println("Test6");
    }
    @Test(dependsOnGroups = {"ss"})
    public void Test7(){
        System.out.println("Test7");
    }
}
