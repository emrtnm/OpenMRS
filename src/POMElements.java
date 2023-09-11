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
  
    @FindBy(id = "loginButton")
    public WebElement login;

    @FindBy(xpath = "//*[@id='content']//h4")
    public WebElement locationMessage;

    @FindBy(xpath = "//*[@class='nav-item logout']/a")
    public WebElement logoutButton;

    @FindBy(id = "Inpatient Ward")
    public WebElement inpatientWard;

    @FindBy (linkText = "Find Patient Record")
    public WebElement findPatientRecord;

    @FindBy(css = "div[id='patient-search-results-table_paginate'] >span>a[tabindex]")
    public  List<WebElement> pageNumbers;
    @FindBy(css = "tbody[role='alert']>tr")
    public List<WebElement> Pagerows;

    @FindBy(id = "patient-search-results-table_info")
    public WebElement showingEntries;

}
