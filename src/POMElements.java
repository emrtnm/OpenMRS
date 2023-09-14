import com.sun.org.apache.bcel.internal.generic.Select;
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

   /* @FindBy(css = "div[id='patient-search-results-table_paginate'] >span>a[tabindex]")
    public List<WebElement> pageNumbers;
    @FindBy(css = "tbody[role='alert']>tr")
    public List<WebElement> Pagerows;

    @FindBy(id = "patient-search-results-table_info")
    public WebElement showingEntries;
//mundanyokarsyuytgedi*/
}
