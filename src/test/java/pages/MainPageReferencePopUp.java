package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPageReferencePopUp  extends HysBasePageObject {

    @FindBy(id = "full_name")
    public WebElement referenceFormNameTextField;

    @FindBy(id = "email")
    public WebElement referenceFormEmaileTextField;

    @FindBy(xpath = "//label[@for='ch1']")
    public WebElement termsAndAgreementsCheckBox;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement referenceFormSubmitButton;

    @FindBy(xpath = "//h3[text()='Thanks for your request. We’ll get back to you shortly with the information you need.']")
    public WebElement referenceFormModalDialogThanksMessage;

    @FindBy(xpath = "//div[text()='Sorry, your message has not been sent. Please, try again!']")
    public WebElement NotSentButton;

    public void scrollDownToReferenceFormSubmitButton(){
        Actions builder = new Actions(getDriver());
        Action mouseOverHome = builder
                .moveToElement(referenceFormNameTextField).click().sendKeys(Keys.PAGE_DOWN)
                .build();

        mouseOverHome.perform();
        scrollDown("100");
    }
}
