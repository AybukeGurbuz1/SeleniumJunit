package practice;

import io.github.bonigarcia.wdm.WdmAgent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LoginTest {

    // 1) https://www.koalaresorthotels.com/ sayfasina gidelim
    WebDriver driver;

    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test1() {
        driver.get("https://www.koalaresorthotels.com/");

        // 2) Login butonuna tıkla
        driver.findElement(By.xpath("(//*[@class='nav-link'])[7]")).click();

        //driver.findElement(By.xpath("//*[text()='Login']")).click();
        //driver.findElement(By.cssSelector("#navLogon")).click();

        // login ekranına girdiğinizi 4 farklı web elementi kullanarak doğrulayınız

            // I)
        Assert.assertTrue("Login Ekranina Giris YApilmadi",driver.getTitle().contains("Log in"));


            // II)
        String expectedUrl = "https://www.koalaresorthotels.com/Account/Logon";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals( "Login Ekranina Giris YApilmadi", expectedUrl, actualUrl); // mesaj test fail olduğunda çıkıyor

            // III)

        WebElement L3 = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
        Assert.assertTrue(L3.isDisplayed());

            // IV)
        Assert.assertTrue("Url Yanlis", driver.getCurrentUrl().contains("Logon"));





}}
