package day10_Handle_Windows;

import org.junit.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_IlkTestBaseClass extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1(){
        driver.get("https://amazon.com");
    }

}
