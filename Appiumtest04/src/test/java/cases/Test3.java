package cases;

import org.testng.annotations.Test;

public class Test3 {
    @Test(groups = {"group1"})
    public void Test3()throws Exception{
        System.out.println("Test3");
    }
    @Test(groups = {"group2"})
    public void Test4()throws Exception{
        System.out.println("Test4");
    }
}
