package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.ContactUsPage;
import static helper.Helper.getWebDriver;

public class ContactUsStepDef {
    private ContactUsPage contactUsPage;

    public ContactUsStepDef(ContactUsPage contactUsPage) {
        this.contactUsPage = contactUsPage;
    }


    @Given("^open web driver university web page$")
    public void open_web_driver_university_web_page() throws Throwable {
        Helper.openBrowser();
    }

    @Given("^navigate to contact us form$")
    public void navigate_to_contact_us_form() throws Throwable {
        WebElement webElement = getWebDriver().findElement(By.xpath("//h1[contains(text(),'CONTACT US')]"));
        webElement.click();
        String currentWindow = getWebDriver().getWindowHandle();

        // open the new tab here

        for (String handle :getWebDriver().getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
               getWebDriver().switchTo().window(handle);
            }
        }

    }





    @When("^i submit contact us form with correct data$")
    public void i_submit_contact_us_form_with_correct_data() throws Throwable {
        contactUsPage.setFirstName("Baljeet");
        contactUsPage.setLastName("singh");
        contactUsPage.setEmail("baljeetsinghdeol22@gmail.com");
        contactUsPage.setComments("i am here");
        contactUsPage.clickSubmitButton();
    }

    @Then("^i should get success message$")
    public void i_should_get_success_message() throws Throwable {
        String succesMessage =getWebDriver().findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Thank You for your Message!", succesMessage);
        getWebDriver().quit();
    }

    @When("^i submit contact us form with empty email$")
    public void i_submit_contact_us_form_with_empty_email() throws Throwable {
        contactUsPage.setFirstName("Baljeet");
        contactUsPage.setLastName("singh");
        contactUsPage.setEmail("");
        contactUsPage.setComments("i am here");
        contactUsPage.clickSubmitButton();
    }

    @Then("^i should get error message$")
    public void i_should_get_error_message() throws Throwable {
        String message =getWebDriver().findElement(By.xpath("//body")).getText();
        String exepctedMessage="Error: Invalid email address";
        String expectedMessageSecond="Error: all fields are required";
        Assert.assertTrue(message.contains(exepctedMessage));
        Assert.assertTrue(message.contains(expectedMessageSecond));


    }

}





