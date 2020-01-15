package pageObjects;


import helper.PageObject;
import org.openqa.selenium.By;

public class ToDoListPage extends PageObject {

    By setopentextfield = By.xpath("//i[@id='plus-icon']");
    By setTextfield =By.xpath("//input[@placeholder='Add new todo']");
    By deletetextField =By.xpath("//li[contains(text(),'Go to potion class')]//span");

    public void setopentextfield(){

        element(setopentextfield).click();
    }
    public void setTextfield(String Password ){

        element(setTextfield).sendKeys(Password);
    }
    public void deletetextField()
    {
        element(deletetextField).click();
    }


}
