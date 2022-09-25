package day14_ReadExcel_WriteExcel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {  // extends yapmıyoruz driver lık bir durum olmadığı için

    @Test

    public void ReadExcelTest1() throws IOException {

        //- Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "src/resources/ulkeler (1).xlsx";

        //- FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(dosyaYolu); //Olusturmuş olduğumuz dosyayı sistemde işleme alır

        //- Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        //- WorkbookFactory.create(fileInputStream)
        Workbook workbook = WorkbookFactory.create(fis); //Workbook objesiyle fis oblesi ile akışa aldığımız dosyamızla bir excell dosyası create ettik

        //- Sheet objesi olusturun workbook.getSheetAt(index)
        Sheet sheet = workbook.getSheet("Sayfa1"); //Excel dosyamızda çalışmak istediğimiz sayfayı bu şekilde seçeriz

        //- Row objesi olusturun sheet.getRow(index)
        Row row = sheet.getRow(3); // Sayfa bir deki 3. satırı bu şekilde seçeriz

        //- Cell objesi olusturun row.getCell(index)
        Cell cell = row.getCell(3); // Satır seçimi yapıldıktan sonra hücre seçimi bu şekilde yapılır
        System.out.println(cell);

        //- index'deki satirin 3. index'indeki datanin Cezayir oldugunu test edin
        String expectedData = "Cezayir";
        String actualData = cell.toString();
        Assert.assertEquals(expectedData,actualData);
        Assert.assertEquals(expectedData,cell.getStringCellValue());



    }}
