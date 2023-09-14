import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseUrl = "https://demo.openmrs.org/";
    public TakesScreenshot ts;
    public POMElements elements;

    @BeforeClass
    @Parameters("webDriver")
    public void init(String webDriver) {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        switch (webDriver)
        {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        ts = (TakesScreenshot) driver;

        elements = new POMElements(driver);
    }

    @BeforeMethod
    void openUri() {
        driver.navigate().to(baseUrl);
    }


    //Rustam Rozybayev
    @Test
    void US9() {

      //  SoftAssert _softassert = new SoftAssert();
        elements.loginUsername.sendKeys("Admin");
        elements.loginPassword.sendKeys("Admin123");
        elements.registrationDesk.click();
        elements.login.click();
        elements.regPatientRecord.click();
        elements.nameFirst.sendKeys("Salih");
        elements.nameMiddle.sendKeys("Rasit");
        elements.surname.sendKeys("Turkoglu");
        elements.gender.click();
        elements.male.click();
        elements.gender1.click();
        int foo=1;
        elements.birthday.sendKeys(String.valueOf(foo));

        Select  month=new Select(elements.monthBox);
        month.selectByIndex(4);

        int year=2002;
        elements.birthYear.sendKeys(String.valueOf(year));

        elements.nextButton.click();
        elements.aders1.sendKeys("Saadet Sokak.11");
        elements.adres2.sendKeys("Kahraman mah");
        elements.mahalle.sendKeys("Aydin");
        elements.vilayet.sendKeys("Trabzon");
        elements.ulke.sendKeys("Turkiya");
        elements.postaKodu.sendKeys("p1235");
        elements.next1Button.click();
        elements.phone.sendKeys("+90545522222");
        elements.next2_Button.click();
        Select  relation=new Select(elements.relationShip);
        relation.selectByIndex(4);
        elements.personname.sendKeys("Ayse Dilaver");
        elements.next3_Button.click();
        elements.confirm.click();
        elements.iconregister.click();
        elements.regPatientRecord2.click();
        elements.nameFirst2.sendKeys("Salih");
        elements.nameMiddle2.sendKeys(" ");
        elements.surname2.sendKeys("Turkoglu");
        elements.gender2.click();
        elements.male2.click();
        elements.gender12.click();
        int foo2=1;
        elements.birthday2.sendKeys(String.valueOf(foo2));

        Select  month2=new Select(elements.monthBox);
        month2.selectByIndex(4);

        int year2=2002;
        elements.birthYear2.sendKeys(String.valueOf(year2));

        elements.nextButton2.click();
        elements.aders12.sendKeys("Saadet Sokak.11");
        elements.adres22.sendKeys("Kahraman mah");
        elements.mahalle2.sendKeys("Aydin");
        elements.vilayet2.sendKeys("Trabzon");
        elements.ulke2.sendKeys("Turkiya");
        elements.postaKodu2.sendKeys("p1235");
        elements.next1Button2.click();
        elements.phone2.sendKeys("+90545522222");
        elements.next2_Button2.click();
        Select  relation2=new Select(elements.relationShip2);
        relation2.selectByIndex(4);
        elements.personname2.sendKeys("Veli Dilaver");
        elements.next3_Button2.click();
        elements.confirm2.click();
        elements.backToLogin.click();
        elements.dataManagement.click();
        elements.mergePatient.click();
        elements.patient1.sendKeys("100RWA");
        elements.patient2.sendKeys("100RUF");
        elements.continueButton.click();
        elements.firstPatient.click();

        Assert.assertTrue(true, " Merging cannot be undone! yazisi gorulmedi");
        elements.continueButtonYes.click();
        String text=driver.getPageSource();
        Assert.assertTrue(text.contains("100ROW") && text.contains("100TPL"), "Metinler bulunamadı.");







       // elements.findPatientRecord.click();


    }public static void SaveScreenshot(File source, String prefix) throws IOException
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String timeStamp = dateFormat.format(new Date());
        String fileName = prefix + "_" + timeStamp + ".png";

        Path currentRelativePath = Paths.get("");
        String target = currentRelativePath.toAbsolutePath().toString();

        FileUtils.copyFile(source, new File(target + "/src/screenshots/" + fileName));
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}
