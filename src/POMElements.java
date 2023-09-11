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
