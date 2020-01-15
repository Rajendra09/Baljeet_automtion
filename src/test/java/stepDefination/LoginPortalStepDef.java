package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObjects.LoginPortalPage;
import static helper.Helper.getWebDriver;

public class LoginPortalStepDef {
    private LoginPortalPage loginPortalPage;

   public LoginPortalStepDef(LoginPortalPage loginPortalPage){
       this.loginPortalPage=loginPortalPage;
   }
    @Given("^open web driver university web page1$")
    public void open_web_driver_university_web_page() throws Throwable {
        Helper.openBrowser();
    }
    @Given("^navigate to the login portal$")
    public void navigate_to_the_login_portal() throws Throwable {
        WebElement webElement= getWebDriver().findElement(By.xpath("//h1[contains(text(),'LOGIN PORTAL')]"));
        webElement.click();
        String currentWindow = getWebDriver().getWindowHandle();
        for (String handle :getWebDriver().getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
                getWebDriver().switchTo().window(handle);
            }
        }

    }

    @When("^fill the email and password$")
    public void when_navigate_the_login_portal() throws Throwable {
       loginPortalPage.setUserName("baljeet");
       loginPortalPage.setpassword("123456");

    }

    @Then("^click on login button successfully$")
    public void login_successfully() throws Throwable {
       loginPortalPage.LoginButton();

    }

    @When("^either email or password is incorrect$")
    public void either_email_or_password_is_incorrect() throws Throwable {
        loginPortalPage.setUserName("baljeet");
        loginPortalPage.setpassword("");

    }
    @Then("^not login$")
    public void not_login() throws Throwable {

        loginPortalPage.LoginButton();
    }

}
