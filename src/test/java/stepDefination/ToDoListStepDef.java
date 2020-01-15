package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.ToDoListPage;

import static helper.Helper.getWebDriver;

public class ToDoListStepDef {
    private ToDoListPage toDoList;

    public ToDoListStepDef(ToDoListPage toDoList) {
        this.toDoList=toDoList;
    }

    @Given("^navigate to the To do list$")
    public void navigate_to_the_To_do_list() throws Throwable {
        WebElement webElement = getWebDriver().findElement(By.xpath("//h1[contains(text(),'TO DO LIST')]"));
        webElement.click();
        String currentWindow = getWebDriver().getWindowHandle();


        for (String handle :getWebDriver().getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
                getWebDriver().switchTo().window(handle);
            }
        }

    }


    @Then("^add the new list$")
    public void add_the_new_list() throws Throwable {
        toDoList.setopentextfield();
        toDoList.setTextfield("baljeet");
    }

    @Then("^delete the old list$")
    public void delete_the_old_list() throws Throwable {
        toDoList.deletetextField();

    }


}
