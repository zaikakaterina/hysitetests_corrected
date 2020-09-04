package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.hys-enterprise.com/career/")
public class CareerPage extends HysBasePageObject {

    @FindBy(linkText = "Join Us")
    public WebElement joinUsButton;

    @FindBy(xpath = "//*[contains(text(),\"Let's network\")]")
    public WebElement letsNetworkBlock;

    @FindBy(partialLinkText = "events")
    public WebElement seeMoreEventsButton;

    @FindBy(xpath = "//*[@id=\"cv-form\"]/div/div[5]/div[1]/label/label")
    public WebElement checkbox;

}
