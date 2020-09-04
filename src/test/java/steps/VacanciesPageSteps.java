package steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.VacanciesPage;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://www.hys-enterprise.com/")
public class VacanciesPageSteps {

    WebDriver driver;
    VacanciesPage vacanciesPage;




    @Step
    public boolean isPageOpened(){
        return vacanciesPage.getDriver().getCurrentUrl().contains("career/vacancies/");
    }

    @Step
    public void clickOnFirstVacancyInList(){
        vacanciesPage.scrollDown("100");
        vacanciesPage.firsVacancyInList.click();
    }

    @Step
    public void enterName(String name){
        vacanciesPage.nameField.sendKeys(name);
    }

    @Step
    public void enterEmail(String email){
        vacanciesPage.emailField.sendKeys(email);
    }

    @Step
    public void enterPhone(String phone){
        vacanciesPage.phoneField.sendKeys(phone);
    }


    @Step
    public void submitCV() throws  Exception{ ;

    }
    @Step
    public void clickOnPrivacyPolicyCheckbox(){
        vacanciesPage.checkBox.click();
    }

    @Step
    public void clickOnSubmitButton(){
        vacanciesPage.submitButton.click();
    }

    @Step
    public boolean isSuccessMessageDisplayed(){
        return vacanciesPage.succeedMessage.isDisplayed();
    }
}
