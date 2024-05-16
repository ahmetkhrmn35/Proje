package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.Driver;

public class US34_TC001 {



    @Test
    public void US34_TC001(){

        //Admin yetkisi ile giriş yapabilmek için admin sayfasına ulaşabilmeliyim

        AdminDasboardPages adminDasboardPages=new AdminDasboardPages();

        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");


        adminDasboardPages.TextBoxEmail.click();
        adminDasboardPages.TextBoxEmail.sendKeys("feyzademirci@loyalfriendcare.com");

        adminDasboardPages.TextBoxPassword.click();
        adminDasboardPages.TextBoxPassword.sendKeys("Lfc.2604");

       adminDasboardPages.sıgnupbutton.click();

        Assert.assertTrue(adminDasboardPages.logoinstagram.isDisplayed());


    }

}
