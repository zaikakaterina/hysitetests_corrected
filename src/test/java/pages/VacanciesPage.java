package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.hys-enterprise.com/")
public class VacanciesPage extends HysBasePageObject {
    @FindBy(xpath = "//div[@class='vacancies-list']/div/div[1]//span/span[1]")
    public WebElement firsVacancyInList;

    @FindBy(id = "full_name")
    public WebElement nameField;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "phone")
    public WebElement phoneField;

    @FindBy(xpath = "//div[@class='form-group checkbox-wrap']")
    public WebElement checkBox;

    @FindBy(xpath = "//strong[1]")
    public WebElement DragDropButton;


    @FindBy(xpath = "/html/body/section/div[4]/div/div/div/div/div/form/div/div[5]/div[2]/button")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='form-message success-message']")
    public WebElement succeedMessage;

}
