package pages;

import data.RandomDataGenerator;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.hys-enterprise.com/")
public class ContactUsPage extends HysBasePageObject{
    @FindBy(css = "input#full_name")
    WebElement FullNameField;

    @FindBy(css = "input#email")
    WebElement EmailField;

    @FindBy(css = "#phone")
    WebElement PhoneField;

    @FindBy (css = "input#country")
    WebElement CountryField;

    @FindBy (css = "textarea#message")
    WebElement MessageField;

    @FindBy (xpath = "//div[@class='form-group checkbox-wrap']")
    WebElement PrivacyPolicyCheckBox;

    @FindBy (xpath = "/html/body/section/div/div/div/div[1]/div/div[1]/div/form/div/div[6]/div[4]/button")
    WebElement SendButton;

    @FindBy(xpath = "//div[@class='submit-wrap']//div[1]")
    WebElement SorryButton;

    public void fillinNameField() {FullNameField.sendKeys("Maria Ivanova");}

    public void fillinEmailField() {EmailField.sendKeys(RandomDataGenerator.getRandomEmail("hsjkgfjdgh", "hys-enterprise.com"));}

    public void fillinPhoneField() {PhoneField.sendKeys("123456789");}

    public void fillinCountryField() {CountryField.sendKeys("Ukraine");}

    public void fillinMessageField() {MessageField.sendKeys("You've been tested. Thank you!");}

    public void clickOnPrivacyPolicyCheckBox() {PrivacyPolicyCheckBox.click();}

    public void clickOnSendButton() {SendButton.click();}



}
