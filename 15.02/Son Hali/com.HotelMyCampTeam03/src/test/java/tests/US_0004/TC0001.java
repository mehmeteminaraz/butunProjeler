package tests.US_0004;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HotelListPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0001 {
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

    }

}
