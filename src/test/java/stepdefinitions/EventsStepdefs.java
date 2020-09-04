package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.HysBasePageObject;
import pages.MainPage;
import steps.CareerPageSteps;
import steps.MainPageSteps;
import steps.VacanciesPageSteps;

public class EventsStepdefs extends HysBasePageObject {
    @Steps
    MainPageSteps mainPageSteps;

    @Steps
    MainPage mainPage;

    @Steps
    CareerPageSteps careerPageSteps;

    @Given("^I access career page of HysSite$")
    public void iAccessCareerPageOfHysSite() {
        careerPageSteps.openCareerPage();
    }

    @And("^I Scroll down to Event button$")
    public void iScrollDownToEventButton() {
        mainPage.scrollToEventsButton();
    }

    @When("^I click on ‘Event’ button$")
    public void iClickOnEventButton() {
        mainPageSteps.clickOnSeeMoreEvents();
    }

    @Then("^page \"([^\"]*)\" isopened$")
    public void iGo(String arg0) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        careerPageSteps.openEventsPage();
    }


}
