package steps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;

public class SeeMoreReferencesSteps {
    @Managed
    WebDriver driver;

    MainPage seeMoreReferences;
    MainPage mainPage;

    @Step
    public void openMainPage() {
        mainPage.open();
    }

    @Step
    public void clickOnSeeMoreReferencesbutton() {
        seeMoreReferences.scrollDown("100");
        seeMoreReferences.seeMoreReferencesbutton.click();
    }


    @Then("^User should be redirected$")
    public void user_should_be_redirected() throws Throwable {
        Thread.sleep(5000);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.hys-enterprise.com/references/");
    }
}
