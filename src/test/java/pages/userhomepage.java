package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomepage {
    UserHomepage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //ON NAVBAR
    //User anasayfa Logo Simgesi
    @FindBy(xpath="//img[@class='logo']")
    public WebElement logoHome;

    //User anasayfa Home linki
    @FindBy(xpath="(//li[@class])[1]")
    public WebElement linkMenuHome;

    //User anasayfa Listing linki
    @FindBy(xpath="(//li[@class])[2]")
    public WebElement linkMenuListing;

    //User anasayfa Projects linki
    @FindBy(xpath="(//li[@class])[3]")
    public WebElement linkMenuProjects;

    //User anasayfa Agents linki
    @FindBy(xpath="(//li[@class])[4]")
    public WebElement linkMenuAgents;

    //User anasayfa Blog linki
    @FindBy(xpath="(//li[@class])[5]")
    public WebElement linkMenuBlog;

    //User anasayfa Contact linki
    @FindBy(xpath="(//li[@class])[6]")
    public WebElement linkMenuContact;

    //User anasayfa Sign Up linki
    @FindBy(xpath="(//li[@class])[7]")
    public WebElement linkMenuSingUp;

    //User anasayfa Add Property linki
    @FindBy(xpath="//a[@class='text-success']")
    public WebElement linkAddProperty;

    //User anasayfa Sign In linki
    @FindBy(xpath="(//li[@class])[8]")
    public WebElement linkSignIn;

    //User anasayfa Wishlist linki
    @FindBy(xpath="//*[@class='text-white']")
    public WebElement linkWishlist;

    //ON FOOTER

    //IN HOME PAGE

    //IN LISTING PAGE

    //IN PROJECTS PAGE

    //IN AGENTS PAGE

    //IN BLOG PAGE

    //IN CONTACT PAGE

    //IN SIGN UP PAGE

    //SIGN IN PAGE

    //IN ADD PROPERTY PAGE


}
