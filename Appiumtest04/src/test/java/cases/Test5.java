package cases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test5 {
    @Test
    @Parameters({"name"})
    public void Test5(String name,String age){
        System.out.println("your name:"+name+"your age" +age);
    }
}
