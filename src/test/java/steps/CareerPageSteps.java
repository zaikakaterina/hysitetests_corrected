package steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import pages.CareerPage;
import pages.EventsPage;
@DefaultUrl("https://www.hys-enterprise.com/")
public class CareerPageSteps {

    CareerPage careerPage;

    EventsPage eventsPage;


    @Step
    public void openCareerPage(){
        careerPage.open();
    }

    @Step
    public  void openEventsPage(){
        eventsPage.open();
    }

    @Step
    public void clickOnJoinUsButton(){
        careerPage.joinUsButton.click();
    }

    @Step
    public void clickOnCheckBox() { careerPage.checkbox.click();
    }
}
