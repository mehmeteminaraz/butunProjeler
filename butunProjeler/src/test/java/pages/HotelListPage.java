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
    @FindBy(xpath="//span[text()='Hotel Management']")
    public WebElement hotelManagementLink;

    //Main Page---->UserAdmin--->Hotel List Link
    @FindBy(linkText="/admin/HotelAdmin")
    public WebElement hotelListLink;


}package pages;

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
    @FindBy(xpath="//span[text()='Hotel Management']")
    public WebElement hotelManagementLink;

    //Main Page---->UserAdmin--->Hotel List Link
    @FindBy(linkText="/admin/HotelAdmin")
    public WebElement hotelListLink;


}