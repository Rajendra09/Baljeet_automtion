package pageObjects;

import helper.PageObject;
import org.openqa.selenium.By;

public class LoginPortalPage extends PageObject {
    By UserNametxtfield = By.xpath("//input[@id='text']");
    By Passwordtxtfield = By.xpath("//input[@id='password']");
    By LoginButton = By.xpath("//button[@id='login-button']");

    public void setUserName(String UserName){

        element(UserNametxtfield).sendKeys(UserName);
    }
    public void setpassword(String Password ){

        element(Passwordtxtfield).sendKeys(Password);
    }
    public void LoginButton(){

        element(LoginButton).click();
    }

}
