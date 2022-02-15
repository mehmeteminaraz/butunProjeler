package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelListPage {

    public HotelListPage(){
    PageFactory.initElements(Driver.getDriver(),this);
    }
    //Hotel Management, Hotel List, Add Hotel Search ve Clear sekmeleri

    //Main Page---->UserAdmin--->SystemManagement Link
    @FindBy(xpath="//span[.='System Management']")
    public WebElement systemManagementLink;

    //Main Page---->UserAdmin--->Hotel Management Link
    @FindBy(xpath="//span[contains(text(),'Hotel Management')]")
    public WebElement hotelManagementLink;

    //Main Page---->UserAdmin--->Hotel List Link
    @FindBy(linkText="/admin/HotelAdmin")
    public WebElement hotelListLink;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeKutusu;

    @FindBy(id = "Email")
    public WebElement emailHotelListKutusuWebElementi;

    @FindBy ( xpath="//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    @FindBy(id = "IDGroup")
    public WebElement idGroupKutusuWebElementi;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement addHotelSaveButonu;

    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement addHotelokButonu;

    //admin/HotelAdmin/Create
    @FindBy(xpath = "// div[@class='bootbox-body']")
    public WebElement basariliGirisYaziElementi2;



}
