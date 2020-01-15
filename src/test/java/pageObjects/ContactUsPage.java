package pageObjects;

import helper.Helper;
import helper.PageObject;
import org.openqa.selenium.By;

public class ContactUsPage extends PageObject {
    By firstNameTxtField = By.xpath("//input[@placeholder='First Name']");
    By lastNameTxtField = By.name("last_name");
    By emailTxtField = By.name("email");
    By commentsTxtField = By.xpath("//textarea[@placeholder='Comments']");
    By submitButton = By.xpath("//div[@id='form_buttons']//input[2]");

    public void setFirstName(String firstName) {
    element(firstNameTxtField).sendKeys(firstName);

    }
    public void setLastName(String lastName){

        element(lastNameTxtField).sendKeys(lastName);
    }
    public  void setEmail(String email)
    {

        element(emailTxtField).sendKeys(email);
    }
    public void setComments(String comments)
    {

        element(commentsTxtField).sendKeys(comments);
    }
    public void clickSubmitButton(){

        element(submitButton).click();
    }


}
