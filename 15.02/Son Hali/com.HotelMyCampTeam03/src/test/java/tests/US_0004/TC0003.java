package tests.US_0004;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelListPage;
import pages.MainPage;
import utilities.Driver;

public class TC0003 {
    MainPage mainPage=new MainPage();
    HotelListPage hotelListPage= new HotelListPage();
    Actions actions=new Actions(Driver.getDriver());

    //1-www.hotelmycamp.com url'sine gidiniz
    //2-Sağ üstteki "Login"butonuna tıklayın
    //3-"Username" butonuna geçerli bir username girin
    //4-"Password" butonuna geçerli bir password girin
    //5-"Login" Butonuna tıklayın
    //6-"Hotel Management" menüsüne tıklayın
    //7-"Hotel List" menüsüne tıklayın
    //8-"Add Hotel" Buttonuna tıklayın
    //9-"Code" kutucuğuna tıklayıp bir Kod giriniz
    //10-"Name" kutucuğuna tıklayıp bir İsim giriniz
    //11-"Adress" kutucuğuna tıklayıp Adres giriniz
    //12-"Phone" kutucuğuna tıklayıp Telefon Numarası giriniz
    //13-"Mail" kutucuğuna tıklayıp Email Adresi giriniz
    //14-"idGroup" dropdown butonuna tıklayıp Grup seçiniz
    //15-"Save" butonuna tıklayın
    //16-"HotelRoom was inserted successfully" yazısının görünürlüğü test edilmeli
    //17. OK butonuna tıklayın.

    @Test
    public void logIn (){
        TC0001 mainPageLogin= new TC0001();
        mainPageLogin.logIn();
        actions.click(mainPage.addHotelCodeKutusu).sendKeys("1620")
                .sendKeys(Keys.TAB).sendKeys("Shelton Schumm Jr.")
                .sendKeys(Keys.TAB).sendKeys("1294 Sang Well, North Bernie, MS 47011-9638")
                .sendKeys(Keys.TAB).sendKeys("040.682.3356")
                .sendKeys(Keys.TAB).sendKeys("team3ortakhesap@gmail.com")
                .sendKeys(Keys.PAGE_DOWN)
                .perform();

        Select select=new Select(mainPage.addHotelDropdown);
        select.selectByVisibleText("Hotel Type1");

        //15-"Save" butonuna tıklayın
        mainPage.bekle(1);
        hotelListPage.addHotelSaveButonu.click();

        //16-"HotelRoom was inserted successfully" yazısının görünürlüğü test edilmeli
        Assert.assertFalse(hotelListPage.basariliGirisYaziElementi2.isDisplayed());

        //17. OK butonuna tıklayın.
        hotelListPage.addHotelokButonu.click();


    }

}