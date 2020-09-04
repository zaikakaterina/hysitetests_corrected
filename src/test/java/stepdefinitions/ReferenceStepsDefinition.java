package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import steps.MainPageSteps;

public class ReferenceStepsDefinition {
    @Managed
    WebDriver driver;

    @Steps
    MainPageSteps mainPageSteps;

    @Steps
    MainPage mainPage;

    @Given("^I access  https://www\\.hys-enterprise\\.com/$")
    public void iAccessHttpsWwwHysEnterpriseCom() {
        mainPageSteps.openMainPage();
    }

    @And("^I Scroll down to see ‘See more references’ button\\.$")
    public void iScrollDownToSeeSeeMoreReferencesButton() {
        mainPage.scrollToMoreReferences();

    }

    @When("^I click on ‘See more references’ button\\.$")
    public void iClickOnSeeMoreReferencesButton() {
        mainPageSteps.clickOnReference();
    }

    @Then("^references page is opened \\(https://www\\.hys-enterprise\\.com/references/\\)$")
    public void user_should_be_redirected() throws Throwable {
        Thread.sleep(5000);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://stage.hwr.hysdev.com/references/");
    }
}