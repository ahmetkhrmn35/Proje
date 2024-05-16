package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class US20_TC001 {

    @Test
    public void US20_TC001(){

        //Admin dashboarda ulaşıp bu sayfadaki sol açılır menüden Roles ve alt menülerini,
        // aktf ve doğru çalıştıklarını görüntüleyebilmeli, var olan rol sayısını
        // ve rolleri görüntüleyebilmeli, yeni rol oluşturup oluşturduğum rolleri silebilmeliyim

        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        AdminDasboardPages adminDasboardPages=new AdminDasboardPages();

        adminDasboardPages.TextBoxEmail.click();
        adminDasboardPages.TextBoxEmail.sendKeys("feyzademirci@loyalfriendcare.com");

        adminDasboardPages.TextBoxPassword.click();
        adminDasboardPages.TextBoxPassword.sendKeys("Lfc.2604");

       adminDasboardPages.sıgnupbutton.click();


        adminDasboardPages.labelmenu.click();

       adminDasboardPages.rowroles.click();


        adminDasboardPages.rowrolesbolum.click();


        Assert.assertTrue(adminDasboardPages.linkrollersayfa.isDisplayed());


        System.out.println("Sayfadaki rol isimleri " + ReusableMethods.stringListeDonustur(adminDasboardPages.rowrolisimleri));


        System.out.println("Sayfadaki var olan rol sayısı "  + adminDasboardPages.rowrolsayısı.size() + " dir");


        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().back();

        adminDasboardPages.labelmenu.click();


        adminDasboardPages.testrololustur.click();


        adminDasboardPages.checkboxrolisim.sendKeys("abcde");


        adminDasboardPages.checkboxcrateroldisplay.sendKeys("12345");


        adminDasboardPages.savebutton.click();


        String expectedrolname="abcde";

        String actualrolsayfa =Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(actualrolsayfa.contains(expectedrolname));


       adminDasboardPages.deletebutton.click();

        Assert.assertTrue(adminDasboardPages.textdeleteyazı.isDisplayed());

        ReusableMethods.bekle(1);









    }

}
