package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HotelRoomPage {
    public HotelRoomPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //  -->hotelManagement-->HotelRooms--> List Of Hotel Rooms
    @FindBy(xpath = "//a[@id='menuHotels']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[3]")
    public WebElement hotelRoomsLinki;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement listOfUsersYazisi;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement listOfHotelYazisi;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotelRoomButtonu;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement createHotelRoomYazisi;

    @FindBy(xpath = "//select[@id='IDHotel']")
    public WebElement iDHotelDropBox;

    @FindBy(xpath = "//option[text()='Select Hotel']")
    public List<WebElement> selectHotelListesi;

}
