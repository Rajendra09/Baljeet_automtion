package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.AccordionPage;
import pageObjects.ContactUsPage;

import static helper.Helper.getWebDriver;

public class AccordionStepDef {

    private AccordionPage accordionPage;
    private ContactUsPage contactUsPage;
        public AccordionStepDef(AccordionPage accordionPage,ContactUsPage contactUsPage){
            this.accordionPage=accordionPage;
            this.contactUsPage=contactUsPage;
        }
    @Given("^navigate to the accordion and text affect$")
    public void navigate_to_the_accordion_and_text_affect() throws Throwable {
        WebElement webElement = getWebDriver().findElement(By.xpath("//h1[contains(text(),'ACCORDION & TEXT AFFECTS (APPEAR & DISAPPEAR)')]"));
        webElement.click();
        String currentWindow = getWebDriver().getWindowHandle();


        for (String handle :getWebDriver().getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
                getWebDriver().switchTo().window(handle);
            }
        }

    }

    @Then("^open the manual testing$")
    public void open_the_manual_testing() throws Throwable {
            accordionPage.setManualtesting();
        getWebDriver().quit();

    }




}
