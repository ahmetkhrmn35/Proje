package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminDasboardPages {

    public AdminDasboardPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@name='email']")
    public WebElement TextBoxEmail;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement TextBoxPassword;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-cons m-t-10']")
    public WebElement sıgnupbutton;

    @FindBy(xpath = "//*[@class='fab fa-instagram-square']")
    public WebElement logoinstagram;

    @FindBy(xpath = "(//*[@class='text-white'])[2]")
    public WebElement linkdashboardadmindeparments;

    @FindBy(xpath = "(//*[@class='text-white'])[3]")
    public WebElement linkbedmanagers;

    @FindBy(xpath = "(//*[@class='text-white'])[4]")
    public WebElement linkroles;

    @FindBy(xpath = "(//*[@class='text-white'])[5]")
    public WebElement linksettings;

    @FindBy(xpath = "(//*[@class='text-white'])[6]")
    public WebElement linkticket;

    @FindBy(xpath = "(//*[@class='text-white'])[7]")
    public WebElement linkpetsadsense;

    @FindBy(xpath = "(//*[@class='text-white'])[8]")
    public WebElement linkmedicines;

    @FindBy(xpath = "//*[@class='fab fa-facebook-square']")
    public WebElement linkfacebook;

    @FindBy(xpath = "//*[@class='fab fa-twitter-square']")
    public WebElement linktwıtter;

    @FindBy(xpath = "//*[@class='fab fa-pinterest-square']")
    public WebElement linkpınterest;

    @FindBy(xpath = "//*[@class='fab fa-instagram-square']")
    public WebElement linkinstagram;

    @FindBy(xpath = "//*[@class='fab fa-linkedin-square']")
    public WebElement linklinkedın;

    @FindBy(xpath = "//*[@class='fab fa-tumblr-square']")
    public WebElement linktumblr;

    @FindBy(xpath = "//*[@class='fab fa-github']")
    public WebElement linkgıthub;

    @FindBy(xpath = "//*[@data-testid='signupButton']")
    public WebElement buttonhesapolustur;

    @FindBy(xpath = "//*[@class='page-sidebar']")
    public WebElement labelmenu;

    @FindBy(xpath = "(//*[text()='Roles'])[1]")
    public WebElement rowroles;

    @FindBy(xpath = "(//*[text()='Roles'])[2]")
    public WebElement rowrolesbolum;

    @FindBy(xpath = "//*[@id='tableWithSearch']")
    public WebElement linkrollersayfa;

    @FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement> rowrolisimleri;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> rowrolsayısı;

    @FindBy(xpath = "//*[text()='Create Role']")
    public WebElement testrololustur;

    @FindBy(xpath = "(//*[@class='form-control '])[1]")
    public WebElement checkboxrolisim;

    @FindBy(xpath = "(//*[@class='form-control '])[2]")
    public WebElement checkboxcrateroldisplay;

    @FindBy(xpath = "//*[text()='save']")
    public WebElement savebutton;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deletebutton;

    @FindBy(xpath = "//*[text()='Role deleted successfully']")
    public WebElement textdeleteyazı;















}
