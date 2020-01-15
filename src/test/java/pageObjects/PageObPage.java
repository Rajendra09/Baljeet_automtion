package pageObjects;


import helper.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class PageObPage extends PageObject {
    By clickhome= By.xpath("//a[contains(text(),'Home')]");
    By ourproducts =By.xpath("//a[contains(text(),'Our Products')]");
     By contactuspage =By.xpath("//a[contains(text(),'Contact Us')]");




    public void setClickhome(){

        element(clickhome).click();
    }
    public  void setOurproducts(){

        element(ourproducts).click();

    }

    public void setContactuspage(){

            element(contactuspage).click();
    }


}
