package tests;

import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class US19_TC001 {

    @Test
    public void US19_TC001(){

        //Doğru bilgilerle admin grişi yapıp admin dashboard sayfasını
        // görüntüleyebilmeli ve dasboard sayfasındaki öğelerin ayrıntılarına ulaşabilmeliyim


        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        AdminDasboardPages adminDasboardPages=new AdminDasboardPages();

        adminDasboardPages.TextBoxEmail.click();
        adminDasboardPages.TextBoxEmail.sendKeys("feyzademirci@loyalfriendcare.com");

        adminDasboardPages.TextBoxPassword.click();
        adminDasboardPages.TextBoxPassword.sendKeys("Lfc.2604");

       adminDasboardPages.sıgnupbutton.click();


        adminDasboardPages.linkfacebook.click();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();


        adminDasboardPages.linktwıtter.click();
        ReusableMethods.bekle(1);
        adminDasboardPages.buttonhesapolustur.click();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


        adminDasboardPages.linkpınterest.click();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();

        adminDasboardPages.linkinstagram.click();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();

        adminDasboardPages.linklinkedın.click();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();

        adminDasboardPages.linktumblr.click();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();

        adminDasboardPages.linkgıthub.click();
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();

        adminDasboardPages.linkdashboardadmindeparments.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        adminDasboardPages.linkbedmanagers.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        adminDasboardPages.linkroles.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        adminDasboardPages.linksettings.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        adminDasboardPages.linkticket.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        adminDasboardPages.linkpetsadsense.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        adminDasboardPages.linkmedicines.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();











    }


}
