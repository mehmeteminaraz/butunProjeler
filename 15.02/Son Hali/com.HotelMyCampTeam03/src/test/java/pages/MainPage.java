package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
Actions actions=new Actions(Driver.getDriver());
    @FindBy(xpath="//a[text()='Log in']")
    public WebElement firstLoginLinki;


    @FindBy(id="UserName")
    public WebElement firstUserNameBox;


    @FindBy(id="Password")
    public WebElement firstPasswordBox;


    @FindBy(id="btnSubmit")
    public WebElement secondLoginButonu;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeKutusu;


    @FindBy ( xpath="//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    public void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void managerHotelMyCampGiris (){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        firstLoginLinki.click();
        ReusableMethods.waitFor(1);
        actions.
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                perform();
        firstUserNameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        ReusableMethods.waitFor(1);
        firstPasswordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        ReusableMethods.waitFor(1);
        secondLoginButonu.click();

    }

}