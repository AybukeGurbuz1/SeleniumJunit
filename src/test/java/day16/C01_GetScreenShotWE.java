package day16;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;

public class C01_GetScreenShotWE extends TestBaseBeforeAfter {

    @Test
    public void test1() throws IOException {
        // amazon sayfasına gidelim
        driver.get("https://amazon.com");
        // nutella aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
        // arama sonuç yazısının resmini alalım
        WebElement aramaSonucu = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        File nutellaAramaSonucu = aramaSonucu.getScreenshotAs(OutputType.FILE);
        // sadece web elementin resmini alacaksak TakesScreenshot cllasını kullanmanıza gerek yok
        // Locate ettiğimiz web elementi direk geçici bir file a atıp FileUtils ile kopyalayıp yolunu (path) belirtiriz
        FileUtils.copyFile(nutellaAramaSonucu,new File("target/ekranGoruntusuWE/WebESS.jpeg"));





        // Belirli bölgelerin ekran görüntüsünü almak istersek o bölgeyi locate etmek gerekir.
        // Aynı zamanda belirli bölgeyi çekmek istediğimizde alttaki objeyi oluşturmaya gerek yok ! Arasındaki tek fark bu !
        // TakesScreenshot ts= (TakesScreenshot) driver;




}}
