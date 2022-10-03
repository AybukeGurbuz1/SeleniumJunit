package day16;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C02_JSExecutor extends TestBaseBeforeAfter {
    /*
1.Adim : JavascriptExecutor kullanmak icin ilk adim olarak driver’imizi JavascriptExecutor’a cast edelim
1-JavascriptExecutor jse=(JavascriptExecutor)driver;
2.Adim : Kullanacagimiz WebElement’I locate edelim
 2-WebElement xElement=driver.findElement(//Locate)
 3.Adim : Js driver ile executeScript method’unu calistiralim, icine parameter olarak ilgili script ve webelemnt’I yazalim
3-jse.executeScript("arguments[0].scrollIntoView(true);",xElement)
4.Adim : xElement elementine click yapmak icin
4-jse.executeScript("arguments[0].click();",xElement)
 */
    @Test
    public void test1(){
        // amazona gidelim
        driver.get("https://amazon.com");
        // aşağıdaki carrers butonunu gçrünceye kadar js ile scroll yapalım
        WebElement carrers = driver.findElement(By.xpath("//*[text()='Careers']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", carrers);
        // carrers butonuna js ile click yapalım
        jse.executeScript("arguments[0].click();", carrers);

        /*
        js.executeScript("arguments[0].scrollIntoView(true);", auto.downloadInvoiceButton);
        try {
        driver.findElement(By.linkText("Scans")).click();
         } catch (Exception e) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
         executor.executeScript("arguments[0].click();", driver.findElement(By.linkText("Scans")));
            }

         */

}}
