package stepDefination;

import cucumber.api.java.en.Given;
import pageObjects.ButtonClickPage;

public class ButtonClickStepDef {
    private ButtonClickPage buttonClickPage;

    public ButtonClickStepDef( ButtonClickPage buttonClickPage){

        this.buttonClickPage=buttonClickPage;
    }


    @Given("^navigate to Button Click$")
    public void navigate_to_Button_Click() throws Throwable {
        buttonClickPage.clickbutton();

    }

}
