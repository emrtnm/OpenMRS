import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
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
import java.util.List;
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



    //SelenDilek
    @Test
    void US8(){

        SoftAssert _softassert= new SoftAssert();
        elements.loginUsername.sendKeys("admin");
        elements.loginPassword.sendKeys("Admin123");
        elements.inpatientWard.click();
        elements.login.click();
        elements.findPatientRecord.click();

        System.out.println(elements.showingEntries.getText());
        String[] n = elements.showingEntries.getText().trim().split(" ");
        System.out.println(n.length);
        int fifthElement = Integer.parseInt(n[5]);
        System.out.println("fifthElement = " + fifthElement);

        int rows=0;
        int pageNumberss=elements.pageNumbers.size();
        for (int i = pageNumberss-1; i >=0; i--) {
            elements.pageNumbers.get(i).click();
            System.out.println("rows = " + rows);

                for (WebElement pageRows : elements.Pagerows) {

                    rows++;

                }


        }
        System.out.println(rows);

        _softassert.assertEquals(rows,fifthElement);

        _softassert.assertAll();



    }






    public static void SaveScreenshot(File source, String prefix) throws IOException
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String timeStamp = dateFormat.format(new Date());
        String fileName = prefix + "_" + timeStamp + ".png";

        Path currentRelativePath = Paths.get("");
        String target = currentRelativePath.toAbsolutePath().toString();

        FileUtils.copyFile(source, new File(target + "/src/screenshots/" + fileName));
    }

//    @AfterClass
//    public void close() {
//        driver.quit();
//    }
}
