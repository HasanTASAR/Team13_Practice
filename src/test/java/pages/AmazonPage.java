package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    //pages sayfaları o web sayfasında kullanılacak locateler
    // ve varsa login işlemi gibi basit methodlar için kullanılır.

    public  AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox" )
    public WebElement amazonAramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']" )
    public WebElement amazonActualKelime;

}
