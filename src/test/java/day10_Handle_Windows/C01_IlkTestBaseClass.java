package day10_Handle_Windows;

import org.junit.Test;
import utilities.TestBaseBeforeAfter;

public class C01_IlkTestBaseClass extends TestBaseBeforeAfter {

    @Test
    public void test1(){
        driver.get("https://amazon.com");
    }
}
