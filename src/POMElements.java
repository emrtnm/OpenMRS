
import org.openqa.selenium.By;
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

    @FindBy(id = "loginButton")
    public WebElement login;

    @FindBy(id = "Registration Desk")
    public WebElement registrationDesk;

    @FindBy (linkText = "Register a patient")
    public WebElement regPatientRecord;
  
    //@FindBy (linkText ="Name")
    // public WebElement nameBox;
    @FindBy(name = "givenName")
    public WebElement nameFirst;
  
    @FindBy(name = "middleName")
   public WebElement nameMiddle;
  
    @FindBy(name = "familyName")
    public WebElement surname;
  
    @FindBy (id = "next-button")
    public WebElement gender;
  
    @FindBy(xpath = "//*[@id='gender-field']/option[2]")
    public WebElement male;
  
    @FindBy (id = "next-button")
    public WebElement gender1;
  
    @FindBy (name = "birthdateDay")
    public WebElement birthday;
  
    @FindBy(id="birthdateMonth-field")
    public WebElement monthBox;
  
    @FindBy (id = "birthdateYear-field")
    public WebElement birthYear;
  
    @FindBy (id = "next-button")
    public WebElement nextButton;
  
    @FindBy (xpath = "(//*[@id='contactInfo'])//input[1]")
    public WebElement aders1;
  
    @FindBy (id = "address2")
    public WebElement adres2;
  
    @FindBy (id = "cityVillage")
    public WebElement mahalle;
  
    @FindBy (id = "stateProvince")
    public WebElement vilayet;
  
    @FindBy (id = "country")
    public WebElement ulke;
  
    @FindBy (id = "postalCode")
    public WebElement postaKodu;
  
    @FindBy (xpath = "//*[@id='nav-buttons']//button[contains(@class, 'confirm right')]")
    public WebElement next1Button;
  
    @FindBy (name = "phoneNumber")
    public WebElement phone;
  
    @FindBy (xpath = "//*[@id='next-button']/icon")
    public WebElement next2_Button;
  
    @FindBy(id="relationship_type")
    public WebElement relationShip;
  
    @FindBy (xpath = "//*[@id='relationship']/p[2]/input[1]")
    public WebElement personname;
  
    @FindBy (xpath = "//*[@id='next-button']/icon")
    public WebElement next3_Button;
  
    @FindBy (id = "submit")
    public WebElement confirm;
    //@FindBy (linkText = "Logout")
    //public WebElement logout;
    /*@FindBy(xpath = "//*[@id='username']")
    public WebElement loginUsername2;

    @FindBy(id = "password")
    public WebElement loginPassword2;

    @FindBy(id = "loginButton")
    public WebElement login2;

    @FindBy(id = "Registration Desk")
    public WebElement registrationDesk2;*/

    @FindBy (xpath = "//*[@id='breadcrumbs']/li[1]/a/i")
    public WebElement iconregister;
  
    @FindBy (linkText = "Register a patient")
    public WebElement regPatientRecord2;
  
    //@FindBy (linkText ="Name")
    // public WebElement nameBox;
    @FindBy(name = "givenName")
    public WebElement nameFirst2;
  
    @FindBy(name = "middleName")
    public WebElement nameMiddle2;
  
    @FindBy(name = "familyName")
    public WebElement surname2;
  
    @FindBy (id = "next-button")
    public WebElement gender2;
  
    @FindBy(xpath = "//*[@id='gender-field']/option[2]")
    public WebElement male2;
  
    @FindBy (id = "next-button")
    public WebElement gender12;
  
    @FindBy (name = "birthdateDay")
    public WebElement birthday2;
  
    @FindBy(id="birthdateMonth-field")
    public WebElement monthBox2;
  
    @FindBy (id = "birthdateYear-field")
    public WebElement birthYear2;
  
    @FindBy (id = "next-button")
    public WebElement nextButton2;
  
    @FindBy (xpath = "(//*[@id='contactInfo'])//input[1]")
    public WebElement aders12;
  
    @FindBy (id = "address2")
    public WebElement adres22;
  
    @FindBy (id = "cityVillage")
    public WebElement mahalle2;
  
    @FindBy (id = "stateProvince")
    public WebElement vilayet2;
  
    @FindBy (id = "country")
    public WebElement ulke2;
  
    @FindBy (id = "postalCode")
    public WebElement postaKodu2;
  
    @FindBy (xpath = "//*[@id='nav-buttons']//button[contains(@class, 'confirm right')]")
    public WebElement next1Button2;
  
    @FindBy (name = "phoneNumber")
    public WebElement phone2;
  
    @FindBy (xpath = "//*[@id='next-button']/icon")
    public WebElement next2_Button2;
  
    @FindBy(id="relationship_type")
    public WebElement relationShip2;
  
    @FindBy (xpath = "//*[@id='relationship']/p[2]/input[1]")
    public WebElement personname2;
  
    @FindBy (xpath = "//*[@id='next-button']/icon")
    public WebElement next3_Button2;
  
    @FindBy (id = "submit")
    public WebElement confirm2;
  
   @FindBy (xpath = "//*[@id='breadcrumbs']/li[1]/a/i")
   public WebElement backToLogin;
  
   @FindBy (id = "coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension")
   public WebElement dataManagement;
  
   @FindBy (id = "coreapps-mergePatientsHomepageLink-app")
   public WebElement mergePatient;
  
   @FindBy (id = "patient1-text")
   public WebElement patient1;
  
   @FindBy (id = "patient2-text")
   public WebElement patient2;
  
   @FindBy (xpath = "//*[@id='confirm-button']")
   public WebElement continueButton;

   @FindBy (xpath = "(//*[@id='patients'])/div[1]")
   public WebElement firstPatient;
  
   @FindBy (id = "confirm-button")
   public WebElement continueButtonYes;


    //@FindBy (name = "birthdateDay")
   // public WebElement birthday1;


    //@FindBy()
    //public WebElement  webMenu=gender1.findElement(By.id("gender-field"));
    //Select ddMenu=new Select(Webmenu);( ddMenu.deselectByIndex(0));


    //@FindBy(css= "input#fr5049-field[name='givenName']")
    //public WebElement givenName;

  @FindBy(css = "div[id='patient-search-results-table_paginate'] >span>a[tabindex]")
    public List<WebElement> pageNumbers;
    @FindBy(css = "tbody[role='alert']>tr")
    public List<WebElement> Pagerows;
    
    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='sessionLocationError']")
    public WebElement loginErrorMessage1;

    @FindBy(xpath = "//*[@id='Inpatient Ward']")
    public WebElement location;

    @FindBy(xpath = "//*[@id='error-message']")
    public WebElement loginErrorMessage2;
  
    @FindBy(id = "loginButton")
    public WebElement login2;

    @FindBy(xpath = "//*[@id='content']//h4")
    public WebElement locationMessage;

    @FindBy(xpath = "//*[@class='nav-item logout']/a")
    public WebElement logoutButton;

    @FindBy(id = "Inpatient Ward")
    public WebElement inpatientWard;

    @FindBy (linkText = "Find Patient Record")
    public WebElement findPatientRecord;

    @FindBy(css = "div[id='patient-search-results-table_paginate'] >span>a[tabindex]")
    public  List<WebElement> pageNumbers2;
    @FindBy(css = "tbody[role='alert']>tr")
    public List<WebElement> Pagerows2;

    @FindBy(id = "patient-search-results-table_info")
    public WebElement showingEntries;

    @FindBy(id = "patient-search-results-table_info")
    public WebElement showingEntries2;


    @FindBy(id = "org.openmrs.module.coreapps.deletePatient")
    public WebElement deletePatient;

    @FindBy(id = "delete-reason")
    public WebElement reason;
    @FindBy(xpath = "(//button[@class='confirm right'][text()='Confirm'])[4]")
    public WebElement confirmButton;

    @FindBy(xpath = "//div[@class='toast-container toast-position-top-right']//p")
    public WebElement deleteMsg;

    @FindBy(id = "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
    public WebElement findPatientBtn;

    @FindBy(id = "patient-search")
    public WebElement search;

    @FindBy(css = "[class=odd]")
    public WebElement patient;

    @FindBy(xpath = "//*[@id='coreapps-diagnosesList']//h3")
    public WebElement control6;

    @FindBy(xpath = "//td[@class='dataTables_empty'][text()='No matching records found']")
    public WebElement negativeControl6;

    @FindBy(xpath = "//*[@id='sessionLocation']/li")
    public List<WebElement> locations;

    @FindBy(xpath = "//*[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
    public WebElement registerApatientButton;

    @FindBy(xpath = "//*[@name='givenName']")
    public WebElement givenName;

    @FindBy(xpath = "//*[@name='familyName']")
    public WebElement familyName;

    //@FindBy(xpath = "//*[@id='next-button']")
    //public WebElement nextButton;

    @FindBy(xpath = "//*[@for='gender-field']")
    public WebElement genderQuestion;

    @FindBy(xpath = "//*[@id='gender-field']")
    public WebElement genderBox;

    @FindBy(xpath = "//*[@id='gender-field']/option[2]")
    public WebElement genderFemale;

    @FindBy(xpath = "//*[@id='gender-field']/option[1]")
    public WebElement genderMale;

    @FindBy(xpath = "//*[@id='demographics-birthdate']//label")
    public WebElement birthdateQuestion;

    @FindBy(xpath = "//*[@id='prev-button']")
    public WebElement previousButton;

    @FindBy(xpath = "//*[@id='birthdateDay-field']")
    public WebElement birthdateDay;

    @FindBy(xpath = "//*[@id='birthdateMonth-field']")
    public WebElement birthdateMonth;

    @FindBy(xpath = "//*[@id='birthdateYear-field']")
    public WebElement birthdateYear;

    @FindBy(xpath = "//*[@id='null']//label")
    public WebElement patientsAddress;

    @FindBy(xpath = "//*[@id='birthdateYears-field']")
    public WebElement estimatedYears;

    @FindBy(xpath = "//*[@id='birthdateMonths-field']")
    public WebElement estimatedMonths;

    @FindBy(xpath = "(//*[@id='demographics-birthdate']//span)[2]")
    public WebElement validDateAndRequiredMessage;

    @FindBy(xpath = "(//*[@id='demographics-birthdate']//span)[4]")
    public WebElement dayMinimumMessage;

    @FindBy(xpath = "(//*[@id='demographics-birthdate']//span)[8]")
    public WebElement yearMinimumMessage;

    @FindBy(xpath = "//*[@id='birthdateYears-field']/following::span")
    public WebElement EstimatedYearsMinimumMessage;

    @FindBy(xpath = "//*[@id='birthdateMonths-field']/following::span")
    public WebElement EstimatedMonthsMinimumMessage;

    @FindBy(xpath = "//*[@id='null']/span")
    public WebElement addressErrorMessage;

    @FindBy(xpath = "//*[@id='address1']")
    public WebElement address1Input;

    @FindBy(xpath = "//*[@id='address2']")
    public WebElement address2Input;

    @FindBy(xpath = "//*[@id='cityVillage']")
    public WebElement addressCityInput;

    @FindBy(xpath = "//*[@id='stateProvince']")
    public WebElement addressStateInput;

    @FindBy(xpath = "//*[@id='country']")
    public WebElement addressCountryInput;

    @FindBy(xpath = "//*[@id='postalCode']")
    public WebElement addressPostalCodeInput;

    @FindBy(xpath = "//*[@id='phoneNumberLabel']//label")
    public WebElement patientsPhoneNumberQuestion;

    @FindBy(xpath = "//*[@name='phoneNumber']")
    public WebElement patientsPhoneNumberInput;

    @FindBy(xpath = "//*[@id='phoneNumberLabel']//span")
    public WebElement patientsPhoneNumberMessage;

    @FindBy(xpath = "//*[@id='null']/h3")
    public WebElement patientRelatedTo;

    @FindBy(xpath = "//*[@id='relationship_type']")
    public WebElement relationshipDropbox;

    @FindBy(xpath = "(//*[@id='relationship_type'])[2]")
    public WebElement secondRelationshipDropbox;

    @FindBy(xpath = "//*[@placeholder='Person Name']")
    public WebElement personName;

    @FindBy(xpath = "//*[@id='submit']")
    public WebElement confirmButton1;

    @FindBy(xpath = "//*[@id='cancelSubmission']")
    public WebElement cancelButton;

    @FindBy(xpath = "(//*[@ng-click='addNewRelationship()'])[1]")
    public WebElement plusButton;

    @FindBy(xpath = "(//*[@ng-click='removeRelationship(relationship)'])[2]")
    public WebElement minusButton;

    @FindBy(xpath = "//*[@id='breadcrumbs']")
    public WebElement nameMessage;

    @FindBy(xpath = "//*[@class='float-sm-right']/span")
    public WebElement patientId;

    @FindBy(xpath = "//*[@class='nav-item identifier']")
    public WebElement adminHooverIcon;

    @FindBy(xpath = "//*[@id='user-account-menu']//a")
    public WebElement hooverMessage;

    @FindBy(xpath = "(//*[@id='tasks']/a)[1]")
    public WebElement changePasswordButton;

    @FindBy(xpath = "(//*[@id='tasks']/a)[2]")
    public WebElement myLanguagesButton;


}
