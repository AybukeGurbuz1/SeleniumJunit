package day15_GetScreenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_GetScreenshot extends TestBaseBeforeAfter {
@Test
    public void test1() throws IOException {
    // amazon sayfasına gidelim
    driver.get("https://kitapyurdu.com");
    /*
    bir web sayfasının resmini alabilmek için TakesScreenshot class ın dan obje oluşturup
    geçici bir File class ından değişkene TakesScreenshot dan oluşturduğum obje den
    getScreenshotAs methodunu kullanarak  geçici bir file oluştururuz
     */

    TakesScreenshot ts = (TakesScreenshot) driver;
    File tumSayfaResmi = ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(tumSayfaResmi,new File("target/ekranGoruntusu/AllPage"+tarih+".jpeg"));

    //resmi resmin uzerine degil de yeni bir resim olarak alabilmek icin image ismine tarih ekleyip atadik
    //tarih in normal formati dosya isimlendirmeye uygun olmadigi icin tarih yazim formati ile oynayip uygun hale getirdik
    //sonra bu sekil bize her zaman lazim olabilir diye TestDataBase imize attik
}

}
