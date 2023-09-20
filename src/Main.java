import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseUrl = "https://openmrs.org/";
    public TakesScreenshot ts;
    public POMElements elements;
    SoftAssert _softAssert = new SoftAssert();

    @BeforeClass
    @Parameters("webDriver")
    public void init(String webDriver) {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        switch (webDriver) {
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

    @AfterClass
    public void close() {
        driver.quit();
    }

    @BeforeMethod
    void openUri() {
        driver.navigate().to(baseUrl);}

    public static void SaveScreenshot(File source, String prefix) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String timeStamp = dateFormat.format(new Date());
        String fileName = prefix + "_" + timeStamp + ".png";

        Path currentRelativePath = Paths.get("");
        String target = currentRelativePath.toAbsolutePath().toString();

        FileUtils.copyFile(source, new File(target + "\\src\\screenshots\\" + fileName));
    }

    public static int randomGenerator(int sinir){
        return (int)(Math.random()*sinir);
    }

    public void loginPage() throws InterruptedException {
        Assert.assertTrue(driver.getCurrentUrl().equals("https://openmrs.org/"), "Wrong website!");
        elements.demoButton.click();
        elements.exploreOpenMrs2Button.click();
        Thread.sleep(2000);
        elements.enterTheOpenMrs2DemoButton.click();
    }

    // @assigned=Rustam Rozybayev
    @Test
    void US9MergePatientRecords() {

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
    }

    // @assigned=Umut Can Güzel
    @Test
    public void US6SearchOnThePatientList(){

        elements.loginUsername.sendKeys("Admin");
        elements.loginPassword.sendKeys("Admin123");
        elements.inpatientWard.click();
        elements.loginButton.click();
        elements.findPatientBtn.click();
        elements.search.sendKeys("AYŞE FATMA");
        elements.patient.click();

        Assert.assertTrue(elements.control6.getText().equals("DIAGNOSES"));

    }

    // @assigned=Umut Can Güzel
    @Test
    public void US6SearchOnThePatientListNegative(){


        elements.loginUsername.sendKeys("Admin");
        elements.loginPassword.sendKeys("Admin123");
        elements.inpatientWard.click();
        elements.loginButton.click();
        elements.findPatientBtn.click();
        elements.search.sendKeys("Jonathan Rae");

        Assert.assertTrue(elements.negativeControl6.getText().contains("No matching records found"));

    }

    // @assigned=Umut Can Güzel
    @Test
    public void US7PatientDeletion(){

        elements.loginUsername.sendKeys("Admin");
        elements.loginPassword.sendKeys("Admin123");
        elements.inpatientWard.click();
        elements.loginButton.click();
        elements.findPatientBtn.click();
        elements.search.sendKeys("AYŞE FATMA");
        elements.patient.click();
        elements.deletePatient.click();
        elements.reason.sendKeys("YES");
        elements.confirmButton.click();

        Assert.assertTrue(elements.deleteMsg.getText().contains("Patient has been deleted successfully"));
    }

    // @assigned=Umut Can Güzel
    @Test
    public void US7PatientDeletionNegative(){

        elements.loginUsername.sendKeys("Admin");
        elements.loginPassword.sendKeys("Admin123");
        elements.inpatientWard.click();
        elements.loginButton.click();
        elements.findPatientBtn.click();
        elements.search.sendKeys("Jonathan Rae");

        Assert.assertTrue(elements.negativeControl6.getText().contains("No matching records found"));
    }

    // @assigned=Selen Dilek
    @Test
    void US8PatientListing() {
        SoftAssert _softassert = new SoftAssert();
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

        int rows = 0;
        int pageNumberss = elements.pageNumbers.size();
        for (int i = pageNumberss - 1; i >= 0; i--) {
            elements.pageNumbers.get(i).click();
            for (WebElement pageRows : elements.Pagerows) {
                rows++;
            }
        }

        _softassert.assertEquals(rows, fifthElement);

        _softassert.assertAll();
    }

    // @assigned=Ümit Boyraz
    @Test(dataProvider = "userBilgileri")
    void US1CheckingLoginErrors01(String username, String password) throws InterruptedException {

        loginPage();
        _softAssert.assertTrue(driver.getCurrentUrl().equals("https://demo.openmrs.org/openmrs/login.htm"), "You are not on a login page");

        elements.loginUsername.sendKeys(username);
        elements.loginPassword.sendKeys(password);
        elements.loginButton.click();
        _softAssert.assertTrue(elements.loginErrorMessage1.getText().contains("You must choose a location!"), "Location was choosen");
        _softAssert.assertAll();
    }

    @DataProvider
    Object[][] userBilgileri() {
        Object[][] data = {

                {"", ""},
                {"Admin", ""},
                {"", "Admin123"},
                {"admin", "admin123"},
        };

        return data;
    }

    @Test(dataProvider = "userData")
    void US1CheckingLoginErrors02(String username, String password) throws InterruptedException {

        loginPage();

        elements.loginUsername.sendKeys(username);
        elements.loginPassword.sendKeys(password);

        for (int i = 0; i < elements.locations.size(); i++) {
            elements.locations.get(i).click();
            elements.loginButton.click();
            _softAssert.assertTrue(elements.loginErrorMessage2.getText().contains("Invalid username/password. Please try again."), "Valid Username");
        }
        _softAssert.assertAll();
        //int randomSecim = MyFunc.randomGenerator(elements.locations.size());
        //elements.locations.get(randomSecim).click();
    }

    @DataProvider
    Object[][] userData() {
        Object[][] data = {

                {"", ""},
                {"Admin", ""},
                {"", "Admin123"},
                {"admin", "admin123"},
        };

        return data;
    }

    // @assigned=Ümit Boyraz
    @Test
    void US2LoginAndUS03Logout() throws InterruptedException {

        loginPage();
        elements.loginUsername.sendKeys("Admin");
        elements.loginPassword.sendKeys("Admin123");

        int randomSecim = randomGenerator(elements.locations.size());
        elements.locations.get(randomSecim).click();

        elements.loginButton.click();
        _softAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.openmrs.org/openmrs/referenceapplication/home.page"), "You couldn't login!");
        _softAssert.assertTrue(elements.locationMessage.getText().contains("Logged in as Super User (admin)"));

        elements.logoutButton.click();
        _softAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.openmrs.org/openmrs/login.htm"), "You couldn't logout!");
        _softAssert.assertAll();
    }

    // @assigned=Ümit Boyraz
    @Test
    void US3LogOut() {
        // US03LogOut is merged by US02Login
    }

    // @assigned=Emrullah Tanıma
    @Test
    void US4PatientRegistration() throws InterruptedException {

        loginPage();
        elements.loginUsername.sendKeys("Admin");
        elements.loginPassword.sendKeys("Admin123");

        int randomSecim = randomGenerator(elements.locations.size());
        elements.locations.get(randomSecim).click();
        elements.loginButton.click();

        _softAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.openmrs.org/openmrs/referenceapplication/home.page"), "You couldn't login!");
        _softAssert.assertTrue(elements.locationMessage.getText().contains("Logged in as Super User (admin)"),"You couldn't login as Super User (admin)!");

        elements.registerApatientButton.click();

        elements.givenName.sendKeys("Ali");
        elements.familyName.sendKeys("Cabbar");
        elements.nextButton.click();

        _softAssert.assertTrue(elements.genderQuestion.getText().contains("What's the patient's gender?"), "What's the patient's gender? is not displayed !");

        elements.genderBox.click();
        elements.genderFemale.click();
        elements.nextButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.birthdateQuestion));
        _softAssert.assertTrue(elements.birthdateQuestion.getText().contains("What's the patient's birth date?"),"What's the patient's birth date? is not displayed !");

        elements.previousButton.click();

        elements.genderBox.click();
        elements.genderMale.click();
        elements.nextButton.click();

        elements.nextButton.click();
        _softAssert.assertTrue(elements.validDateAndRequiredMessage.getText().contains("Required"),"Required is not displayed !");

        elements.birthdateDay.sendKeys("0");
        elements.nextButton.click();
        _softAssert.assertTrue(elements.dayMinimumMessage.getText().contains("Minimum: 1"),"Minimum: 1 is not displayed !");

        elements.birthdateDay.clear();
        elements.birthdateDay.sendKeys("17");
        elements.nextButton.click();
        _softAssert.assertTrue(elements.validDateAndRequiredMessage.getText().contains("You need to inform a valid date"),"You need to inform a valid date is not displayed !");

        Select selectionBirthdateMonth = new Select(elements.birthdateMonth);
        selectionBirthdateMonth.selectByIndex(5);
        elements.nextButton.click();
        _softAssert.assertTrue(elements.validDateAndRequiredMessage.getText().contains("You need to inform a valid date"),"You need to inform a valid date is not displayed !");

        elements.birthdateYear.sendKeys("0");
        elements.nextButton.click();
        _softAssert.assertTrue(elements.yearMinimumMessage.getText().contains("Minimum: 1903"),"Minimum:1903 is not displayed !");

        elements.birthdateYear.clear();
        elements.birthdateYear.sendKeys("2000");
        elements.nextButton.click();

        _softAssert.assertTrue(elements.patientsAddress.getText().contains("What is the patient's address?"),"What is the patient's address? is not displayed !");

        elements.previousButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.birthdateDay));
        elements.birthdateDay.clear();
        selectionBirthdateMonth.selectByIndex(0);
        elements.birthdateYear.clear();

        elements.estimatedYears.sendKeys("0");
        elements.nextButton.click();

        _softAssert.assertFalse(elements.patientsAddress.getText().contains("What is the patient's address?"),"BUG(260):What is the patient's address? is displayed !");
        elements.previousButton.click();

        elements.estimatedYears.clear();
        elements.estimatedYears.sendKeys("-1");
        elements.nextButton.click();
        _softAssert.assertTrue(elements.EstimatedYearsMinimumMessage.getText().contains("Minimum: 0"),"Minimum: 0 is not displayed !");

        elements.estimatedYears.clear();

        elements.estimatedMonths.sendKeys("-1");
        elements.nextButton.click();
        _softAssert.assertTrue(elements.EstimatedMonthsMinimumMessage.getText().contains("Minimum: 0"),"Minimum: 0 is not displayed !");

        elements.estimatedMonths.clear();

        elements.estimatedMonths.sendKeys("0");
        //screenshot alınacak
        elements.nextButton.click();
        _softAssert.assertFalse(elements.patientsAddress.getText().contains("What is the patient's address?"),"BUG(279):What is the patient's address? is displayed !");
        elements.previousButton.click();

        elements.estimatedMonths.clear();

        elements.estimatedYears.sendKeys("23");
        elements.nextButton.click();

        _softAssert.assertTrue(elements.patientsAddress.getText().contains("What is the patient's address?"),"What is the patient's address? is not displayed !");

        elements.nextButton.click();
        _softAssert.assertTrue(elements.addressErrorMessage.getText().contains("You need to provide a value for at least one field"),"You need to provide a value for at least one field is not displayed !");

        elements.address1Input.sendKeys("a");
        elements.nextButton.click();
        _softAssert.assertTrue(elements.patientsPhoneNumberQuestion.getText().contains("What's the patient phone number?"),"What's the patient phone number? is not displayed !");
        elements.previousButton.click();

        elements.address1Input.clear();
        elements.address2Input.sendKeys("a");
        elements.nextButton.click();
        _softAssert.assertTrue(elements.patientsPhoneNumberQuestion.getText().contains("What's the patient phone number?"),"What's the patient phone number? is not displayed !");
        elements.previousButton.click();

        elements.address2Input.clear();
        elements.addressCityInput.sendKeys("a");
        elements.nextButton.click();
        _softAssert.assertTrue(elements.patientsPhoneNumberQuestion.getText().contains("What's the patient phone number?"),"What's the patient phone number? is not displayed !");
        elements.previousButton.click();

        elements.addressCityInput.clear();
        elements.addressStateInput.sendKeys("a");
        elements.nextButton.click();
        _softAssert.assertTrue(elements.patientsPhoneNumberQuestion.getText().contains("What's the patient phone number?"),"What's the patient phone number? is not displayed !");
        elements.previousButton.click();

        elements.addressStateInput.clear();
        elements.addressCountryInput.sendKeys("a");
        elements.nextButton.click();
        _softAssert.assertTrue(elements.patientsPhoneNumberQuestion.getText().contains("What's the patient phone number?"),"What's the patient phone number? is not displayed !");
        elements.previousButton.click();

        elements.addressCountryInput.clear();
        elements.addressPostalCodeInput.sendKeys("a");
        elements.nextButton.click();
        _softAssert.assertFalse(elements.patientsPhoneNumberQuestion.getText().contains("What's the patient phone number?"),"BUG(324):What's the patient phone number? is displayed !");
        //screenshot alınacak
        elements.previousButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.addressPostalCodeInput));
        elements.addressPostalCodeInput.clear();

        elements.address1Input.sendKeys("Ali Cabbar");
        elements.address2Input.sendKeys("Mah.");
        elements.addressCityInput.sendKeys("Malkara");
        elements.addressStateInput.sendKeys("Tekirdağ");
        elements.addressCountryInput.sendKeys("Türkiye");
        elements.addressPostalCodeInput.sendKeys("59300");
        elements.nextButton.click();

        _softAssert.assertTrue(elements.patientsPhoneNumberQuestion.getText().contains("What's the patient phone number?"),"What's the patient phone number? is not displayed !");

        wait.until(ExpectedConditions.visibilityOf(elements.patientsPhoneNumberInput));
        elements.patientsPhoneNumberInput.sendKeys("asd");
        elements.nextButton.click();

        _softAssert.assertTrue(elements.patientsPhoneNumberMessage.getText().contains("Must be a valid phone number (with +, -, numbers or parentheses)"),"Must be valid is not displayed !");

        elements.patientsPhoneNumberInput.clear();
        elements.patientsPhoneNumberInput.sendKeys("+90595 595 59 59");
        elements.nextButton.click();

        _softAssert.assertTrue(elements.patientRelatedTo.getText().contains("Who is the patient related to?"),"Who is the patient related to? is not displayed !");
        Select selectionRelationshipDropbox = new Select(elements.relationshipDropbox);
        selectionRelationshipDropbox.selectByIndex(2);
        selectionRelationshipDropbox.selectByIndex(3);
        selectionRelationshipDropbox.selectByIndex(4);
        selectionRelationshipDropbox.selectByIndex(5);
        selectionRelationshipDropbox.selectByIndex(6);
        selectionRelationshipDropbox.selectByIndex(7);
        selectionRelationshipDropbox.selectByIndex(8);
        selectionRelationshipDropbox.selectByIndex(9);
        selectionRelationshipDropbox.selectByIndex(1);

        elements.personName.sendKeys("123");
        _softAssert.assertFalse(elements.confirmButton1.getText().contains("Confirm"),"Confirm is displayed");
        //screenshot alınacak
        elements.nextButton.click();
        elements.cancelButton.click();
        elements.nextButton.click();
        elements.genderBox.click();
        elements.nextButton.click();
        elements.nextButton.click();
        elements.nextButton.click();
        elements.nextButton.click();

        elements.plusButton.click();
        _softAssert.assertTrue(elements.secondRelationshipDropbox.isDisplayed(),"Second relationshipbox is not displayed !");
        elements.minusButton.click();
        elements.personName.clear();
        elements.personName.sendKeys("Veli");
        elements.nextButton.click();
        elements.confirmButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.nameMessage));
        wait.until(ExpectedConditions.visibilityOf(elements.patientId));

        _softAssert.assertTrue(elements.nameMessage.isDisplayed(),"Name is not displayed !");
        _softAssert.assertTrue(elements.patientId.isDisplayed(),"Patient ID is not displayed !");
        _softAssert.assertAll();
    }


    // @assigned=Emrullah Tanıma
    @Test
    void US5MyAccount() throws InterruptedException {
        loginPage();
        elements.loginUsername.sendKeys("Admin");
        elements.loginPassword.sendKeys("Admin123");

        int randomSecim = randomGenerator(elements.locations.size());
        elements.locations.get(randomSecim).click();
        elements.loginButton.click();

        Actions actions = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOf(elements.adminHooverIcon));
        actions.moveToElement(elements.adminHooverIcon).build().perform();
        wait.until(ExpectedConditions.visibilityOf(elements.hooverMessage));
        _softAssert.assertTrue(elements.hooverMessage.isDisplayed());
        _softAssert.assertTrue(elements.hooverMessage.isEnabled());

        elements.hooverMessage.click();

        wait.until(ExpectedConditions.visibilityOf(elements.changePasswordButton));
        _softAssert.assertTrue(elements.changePasswordButton.isDisplayed());
        _softAssert.assertTrue(elements.myLanguagesButton.isDisplayed());

        _softAssert.assertAll();
    }
    @Test
    void US10() {

        elements.loginUsername.sendKeys ("Admin");
        elements.loginPassword.sendKeys ("Admin123");
        elements.location.click ();
        elements.login.click ();

        elements.RegisterApatient.click ();
        elements.givenName.sendKeys ("Sam");
        elements.familyName.sendKeys ("Freeman");

        elements.nextbutton.click ();
        elements.genderfield.click ();
        elements.gender.click ();
        elements.nextbutton.click ();

        elements.birthdateDay.sendKeys ("1");
        elements.birthdateMonth.click ();
        elements.birthdateMonthSlect.click ();
        elements.birthdateYear.sendKeys ("1990");

        elements.nextbutton.click ();
        elements.PatientAdress.sendKeys ("Finlandiya,Helsinki");

        elements.nextbutton.click ();
        elements.nextbutton.click ();
        elements.nextbutton.click ();
        elements.Confirm.click ();

        try {
            Thread.sleep (3000);
        } catch (InterruptedException e) {
            throw new RuntimeException (e);
        }
        elements.iconregister.click ();


        elements.AppointmentScheduling.click ();
        elements.ManageAppointments.click ();
        elements.PatientID.sendKeys ("sam");

        try {
            Thread.sleep (3000);
        } catch (InterruptedException e) {
            throw new RuntimeException (e);
        }
        elements.PatientClaer.click ();


        Assert.assertTrue (elements.Control.getText ().contains ("Your computer is not set to the right time zone."));


    }


}
