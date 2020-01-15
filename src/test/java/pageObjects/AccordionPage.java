package pageObjects;
import helper.PageObject;
import org.openqa.selenium.By;

public class AccordionPage extends PageObject {
    By manualtesting = By.xpath("//button[@id='manual-testing-accordion']");


    public void setManualtesting() {
        element(manualtesting).click();

    }


}
