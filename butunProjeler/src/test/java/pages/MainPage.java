package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Home Page---->Log-in
    @FindBy(xpath="//a[text()='Log in']")
    public WebElement firstLoginLinki;


    //Home Page---->Log-in------>Username TextBox
    @FindBy(id="UserName")
    public WebElement firstUserNameBox;


    //Home Page---->Log-in------>Password TextBox
    @FindBy(id="Password")
    public WebElement firstPasswordBox;


    //Home Page---->Log-in------>Log-in Button
    @FindBy(id="btnSubmit")
    public WebElement secondLoginButonu;

    public void managerHotelMyCampGiris (){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        firstLoginLinki.click();
        ReusableMethods.waitFor(1);
        firstUserNameBox.sendKeys(ConfigReader.getProperty("HMCManagerValidUsername"));
        ReusableMethods.waitFor(1);
        firstPasswordBox.sendKeys(ConfigReader.getProperty("HMCManagerValidPassword"));
        ReusableMethods.waitFor(1);
        secondLoginButonu.click();

    }

}
