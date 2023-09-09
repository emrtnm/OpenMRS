import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class POMElements {
    public POMElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='zak-button']")
    public WebElement demoButton;

    @FindBy(xpath = "//*[@href='#openmrs2']")
    public WebElement exploreOpenMrs2Button;

    @FindBy(xpath = "//*[text()='Enter the OpenMRS 2 Demo']")
    public WebElement enterTheOpenMrs2DemoButton;

    @FindBy(id = "username")
    public WebElement loginUsername;

    @FindBy(id = "password")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='sessionLocationError']")
    public WebElement loginErrorMessage1;

    @FindBy(xpath = "//*[@id='Inpatient Ward']")
    public WebElement location;

    @FindBy(xpath = "//*[@id='error-message']")
    public WebElement loginErrorMessage2;


}
