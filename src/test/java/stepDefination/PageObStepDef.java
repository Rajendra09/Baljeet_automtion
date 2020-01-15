package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.ContactUsPage;
import pageObjects.PageObPage;

import static helper.Helper.getWebDriver;

public class PageObStepDef {
    private PageObPage pageObPage;
    private ContactUsPage contactUsPage;


    public PageObStepDef (PageObPage pageObPage, ContactUsPage contactUsPage){
        this.pageObPage = pageObPage;
        this.contactUsPage=contactUsPage;

    }

    @Given("^navigate to page object model$")
    public void navigate_to_page_object_model() throws Throwable {
        WebElement webElement = getWebDriver().findElement(By.xpath("//h1[contains(text(),'PAGE OBJECT MODEL')]"));
        webElement.click();
        String currentWindow = getWebDriver().getWindowHandle();


        for (String handle :getWebDriver().getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
                getWebDriver().switchTo().window(handle);
            }
        }

    }


    @Then("^show the items$")
    public void show_the_items() throws Throwable {
        pageObPage.setClickhome();
    }

        @Then("^open the new items$")
        public void open_the_new_items() throws Throwable {
            pageObPage.setOurproducts();

        }

        @Then("^back to the  contact us page$")
        public void back_to_the_contact_us_page () throws Throwable {
            pageObPage.setContactuspage();

        }

          @Then("^fill the  correct data$")
          public void fill_the_correct_data() throws Throwable {



        }

        @Then("^click submit$")
        public void click_submit() throws Throwable {

        }


    }








