package day15_GetScreenShot;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {
    @Test
    public void ReadExcelTest1() throws IOException {
        //-Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "src/resources/ulkeler (1).xlsx";

        //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(dosyaYolu);

        //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook = WorkbookFactory.create(fis);

        //-Excel tablosundaki tüm tabloyu konsola yazdırın
        int sonSatir = workbook.getSheet("Sayfa1").getLastRowNum();
        String tablo = "";
        for (int i = 0; i < sonSatir; i++) {
            tablo = workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString() + ", "
                    + workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString() + ", "
                    + workbook.getSheet("Sayfa1").getRow(i).getCell(2).toString() + ", "
                    + workbook.getSheet("Sayfa1").getRow(i).getCell(3).toString() + ", ";
            System.out.println(tablo);

            /*
            ÖDEV
            1.satirdaki 2.hucreye gidelim ve yazdiralim
1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
Satir sayisini bulalim
Fiziki olarak kullanilan satir sayisini bulun
Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim
             */
        }

    }
}
