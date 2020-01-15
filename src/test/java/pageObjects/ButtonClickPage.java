package pageObjects;

import helper.PageObject;
import org.openqa.selenium.By;

public class ButtonClickPage extends PageObject {
    By clickbutton = By.xpath("//h1[contains(text(),'BUTTON CLICKS')]");


    public void clickbutton (){
        element(clickbutton).click();
    }



}
