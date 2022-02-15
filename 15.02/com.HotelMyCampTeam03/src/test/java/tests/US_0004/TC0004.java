package tests.US_0004;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelListPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0004 {
    MainPage mainPage=new MainPage();
    Actions actions=new Actions(Driver.getDriver());
    HotelListPage hotelListPage=new HotelListPage();

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
        //1-www.hotelmycamp.com url'sine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        //2-Sağ üstteki "Login"butonuna tıklayın
        mainPage.firstLoginLinki.click();
        actions.
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                perform();

        //3-username  kutusuna manager datasi gonderilir (sendkeys)
        mainPage.firstUserNameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        ReusableMethods.waitFor(1);

        //4-ve password  kutusuna Manager! (datasi gonderilir sendkeys)
        mainPage.firstPasswordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

        //5-"Login" Butonuna tıklayın
        mainPage.secondLoginButonu.click();

        //6-"Hotel Management" menüsüne tıklayın
        hotelListPage.hotelManagementLinki.click();

        //7-"Hotel List" menüsüne tıklayın
        hotelListPage.hotelListLinki.click();

        //8-"Add Hotel" Buttonuna tıklayın
        hotelListPage.addHotelLinki.click();


          Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(hotelListPage.addHotelCodeKutusu)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        Select select=new Select(hotelListPage.addHotelDropdown);
        select.selectByVisibleText("Hotel Type1");

        //14-"idGroup" dropdown butonuna tıklayıp Grup seçiniz




        //15-"Save" butonuna tıklayın
        mainPage.bekle(1);
        hotelListPage.addHotelSaveButonu.click();

        //17. OK butonuna tıklayın.
        hotelListPage.addHotelokButonu.click();

        //16-"HotelRoom was inserted successfully" yazısının görünürlüğü test edilmeli
        Assert.assertFalse(hotelListPage.basariliGirisYaziElementi2.isDisplayed());



        //"OK" butonuna tıklayın ve otel listesini tıklayın
        //"İd" kutusuna otel kayıt yaptığınız otel "id" giriniz
        //"Search" butonuna tıklayın ve unique bir kaydın yapılıp yapılmadıgını dogrulayın
        //1620
        // 87411
        // Shelton Schumm Jr.	1294
        // Sang Well, North Bernie, MS 47011-9638
        // 040.682.3356
        // team3ortakhesap@gmail.com
        // Hotel Type1


    }

}