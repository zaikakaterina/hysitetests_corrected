package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pages.ContactUsPage;
import pages.HysBasePageObject;
import steps.MainPageSteps;

public class ContactUsStepDef extends HysBasePageObject {
        @Steps
        MainPageSteps mainPageSteps;

        @Steps
        ContactUsPage contactUsPage;


        @Given("on the opened page I find Your Full Name field and enter there Full Name value.")
        public void fillinFullNameField() {
            contactUsPage.fillinNameField();
    }

        @And("^I find  ‘You Email’ field and enter there  ‘_____@hys-enterprise\\.com’ value\\.$")
        public void iFindYouEmailFieldAndEnterThere_____HysEnterpriseComValue() {

            contactUsPage.fillinEmailField();
    }

        @And("^I find  ‘Your Phone Number’ field and enter there  ‘(\\d+)’ value\\.$")
        public void iFindYourPhoneNumberFieldAndEnterThereValue(int arg0) {

            contactUsPage.fillinPhoneField();
    }

        @And("^I find  ‘Your Country’ field and enter there  ‘Country’ value\\.$")
        public void iFindYourCountryFieldAndEnterThereCountryValue() {
            contactUsPage.fillinCountryField();

    }

        @And("^I find  ‘Message’ field and enter there  ‘Message’ value\\.$")
        public void iFindMessageFieldAndEnterThereMessageValue() {
            contactUsPage.fillinMessageField();
    }

        @And("^I mark all necessary check-boxes\\.$")
        public void iMarkAllNecessaryCheckBoxes() throws Throwable{

            scrollDown("600");
            Thread.sleep(2000);
        contactUsPage.clickOnPrivacyPolicyCheckBox();
    }

        @When("^I click on ‘Send’ button$")
        public void iClickOnSendButton() {
            contactUsPage.clickOnSendButton();
    }

        @Then("^message ‘Sorry’ is displayed\\.$")
        public void messageSorryIsDisplayed() {

    }
}

