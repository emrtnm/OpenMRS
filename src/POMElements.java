import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMElements {
    public POMElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    public WebElement loginUsername;

    @FindBy(id = "password")
    public WebElement loginPassword;
    @FindBy (xpath = "//ul[@id='breadcrumbs']//a")
    public WebElement iconregister;
    @FindBy(linkText = "Appointment Scheduling")
    public WebElement AppointmentScheduling;
    @FindBy(linkText = "Manage Appointments")
    public WebElement ManageAppointments;
    @FindBy(xpath = "//*[@placeholder='Search by ID or Name']")
    public WebElement PatientID;
    @FindBy(xpath = "//*[@class='float-sm-right']/span")
    public WebElement PatientName;

    @FindBy(css = "[class='odd']")
    public WebElement PatientClaer;

    @FindBy(id = "time-zone-warning")
    public WebElement Patient;
    @FindBy(xpath = "//div[@class='text']//p")
    public WebElement Control;



}
