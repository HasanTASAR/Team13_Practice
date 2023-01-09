package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class ClassEge {
    @Test
    public void testEge(){

        Driver.getDriver().get("https://www.trendyol.com");
        WebElement aramaKutusu= Driver.getDriver().findElement(By.className("vQI670rJ"));
        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);


        List<WebElement> fiyatListesi=Driver.getDriver().findElements(By.className("prc-box-dscntd"));
        System.out.println(fiyatListesi+" : ");

        for (WebElement each: fiyatListesi) {
            System.out.println(each.getText().replace("TL", "").replace(" ","").replace(",","."));
        }
        String fiyatStr;
        Double fiyatDoub;
        Double enYuksekFiyatDoub=0.0;
        for (WebElement each: fiyatListesi) {

            fiyatStr= each.getText().replace("TL", "").replace(" ","").replace(",",".");
            fiyatDoub=Double.parseDouble(fiyatStr);

            if (fiyatDoub>enYuksekFiyatDoub){
                enYuksekFiyatDoub=fiyatDoub;
            }
        }
        System.out.println("");
        System.out.println("En yuksek urun fiyati : " + enYuksekFiyatDoub);
        System.out.println("Güncelleme");

        Driver.closeDriver();
    }
}
