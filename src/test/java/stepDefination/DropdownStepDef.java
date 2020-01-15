package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.DropDownPage;

import static helper.Helper.getWebDriver;

public class DropdownStepDef {
    private DropDownPage dropDownPage;


    public DropdownStepDef( DropDownPage dropDownPage){
        this.dropDownPage=dropDownPage;
    }
    @Given("^navigate to the dropdown$")
    public void navigate_to_the_dropdown() throws Throwable {
        WebElement webElement = getWebDriver().findElement(By.xpath("//h1[contains(text(),'DROPDOWN, CHECKBOXE(S) & RADIO BUTTON(S)')]"));
        webElement.click();
        String currentWindow = getWebDriver().getWindowHandle();

        // open the new tab here

        for (String handle : getWebDriver().getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
                getWebDriver().switchTo().window(handle);
            }
        }
    }

    @When("^click on the dropdown list$")
    public void click_on_the_dropdown_list() throws Throwable {
        dropDownPage.selectFromShowDropdown("python");

    }





}
