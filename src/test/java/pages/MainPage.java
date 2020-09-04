package pages;

        import net.thucydides.core.annotations.DefaultUrl;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

public class MainPage extends HysBasePageObject {

    @FindBy(xpath = "//button[@data-target='#getReferenceModal']")
    public WebElement askForReferenceButton;

    @FindBy(xpath = "(//a[@href='/references'])[2]")
    public WebElement ReferenceButton;

    @FindBy(xpath = "//*[contains(text(),\"Let's network\")]")
    public WebElement letsNetworkBlock;

    @FindBy(xpath = "(//a[@href='/career/events'])[2]")
    public WebElement seeMoreEventsButton;

    @FindBy(xpath = "//span[contains(text(),  'See more publications')]")
    public WebElement seeMorePublications;


    @FindBy(xpath = "//a[contains(text(),  'Contact us')]")
    public WebElement contactUs_button;

    @FindBy(xpath = "//a[contains(text(),  'About us')]")
    public WebElement aboutUs_button;

    @FindBy(xpath = "//*[@id=\"primary-menu-affix\"]/li[2]/a")
    public WebElement services_button;

    @FindBy(xpath = "//a[contains(text(),  'Software Modernization')]")
    public WebElement soft_modernization;


    @FindBy(xpath = " //a[contains(text(),  'Quality Assurance')]")
    public WebElement qiality_assurance;

    @FindBy(xpath = " //a[contains(text(),  'Software Maintenance')]")
    public WebElement software_maintenance;

    @FindBy(xpath = " //a[contains(text(),  'IT Consulting and Advising')]")
    public WebElement services_consulting;

    @FindBy(xpath = " //a[contains(text(),  'Custom Software and Product Development')]")
    public WebElement services_custom_software;

    @FindBy(xpath = " //a[contains(text(),  'Enterprise Applications')]")
    public WebElement services_enterprise;

    @FindBy(xpath = "(//a[@href='/references'])[2]")
    public WebElement seeMoreReferencesbutton;




    public void scrollToReferenceButton(){
        scrollDown("300");
    }

    public void scrollToLetsNetworkBlock(){
        scrollDown(letsNetworkBlock);
    }
    public void scrollToEventsButton() {
        scrollDown(seeMoreEventsButton);
    }
    public void scrollToMoreReferences() {
        scrollDown(seeMoreReferencesbutton);
    }

    public void clickOnSeeMoreEvents() {
        seeMoreEventsButton.click();
    }
    public void setSeeMorePublications() {
        seeMorePublications.click();
    }
    public void contactUs() {
        contactUs_button.click();
    }
    public void aboutUs () {
        aboutUs_button.click();
    }
    public void services () {
        services_button.click();
    }
    public void modernization () {
        soft_modernization.click();
    }
    public void services_qa () {
        qiality_assurance.click();
    }
    public void services_maintenance () {
        software_maintenance.click();

    }
    public void services_consulting () {
        services_consulting.click();

    }
    public void services_custom_software () {
        services_custom_software.click();

    }
    public void services_enterprise () {
        services_enterprise.click();

       }
}

