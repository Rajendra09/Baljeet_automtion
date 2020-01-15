package pageObjects;

import helper.Helper;
import helper.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class DropDownPage extends PageObject {
By dropdownvalue = By.xpath("//option[contains(text(),'Python')]");



    public void selectFromShowDropdown(String value) {
        new Select(Helper.getWebDriver().findElement(dropdownvalue)).selectByVisibleText(value);
        //dropdown(dropdownvalue).selectByVisibleText(value);

    }




}
