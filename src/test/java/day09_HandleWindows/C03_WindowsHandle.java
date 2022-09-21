package day09_HandleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WindowsHandle {

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        //driver.close();
    }
    /*
1-Yeni bir class olusturun: WindowHandle
2-Amazon anasayfa adresine gidin.
3-Sayfa'nin window handle degerini String bir degiskene atayin
4-Sayfa title'nin "Amazon" icerdigini test edin
5-Yeni bir tab olusturup, acilan tab'da techproeducation.com adresine gidin
6-Sayfa title'nin "TECHPROEDUCATION" icerdigini test edin
7-Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
8-Sayfa title'nin "Walmart" icerdigini test edin
9-Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
 */

   @Test
    public void test1(){

       //Amazon anasayfa adresine gidin.
       driver.get("https://amazon.com");
       //Sayfa'nin window handle degerini String bir degiskene atayin
       String amazonWindowHandle = driver.getWindowHandle();

       //Sayfa title'nin "Amazon" icerdigini test edin
       String expectedTitle = "Amazon";
       String actualTitle = driver.getTitle();
       Assert.assertTrue(actualTitle.contains(expectedTitle));

       //Yeni bir tab olusturup, acilan tab'da techproeducation.com adresine gidin
       driver.switchTo().newWindow(WindowType.TAB);  //yeni bir sekme açmak için bu method kullanılır --> WindowType.TAB
       driver.get("https://www.techproeducation.com");

       //Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
       Assert.assertFalse(driver.getTitle().contains("TECHPROEDUCATION")); //manuel olarak baktığımızda içermediği için assertFalse

       //Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
       driver.switchTo().newWindow(WindowType.WINDOW); //yeni bir window sayfası için WindowType.WINDOW
       driver.get("https://walmart.com");

       //Sayfa title’nin “Walmart” icerdigini test edin
       Assert.assertTrue(driver.getTitle().contains("Walmart"));

       //Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
       driver.switchTo().window(amazonWindowHandle);
       Assert.assertTrue(driver.getTitle().contains(actualTitle));

}}