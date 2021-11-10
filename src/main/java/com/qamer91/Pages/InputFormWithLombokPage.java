package com.qamer91.Pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

@Data
public class InputFormWithLombokPage {

    public InputFormWithLombokPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstname")
    private WebElement firstNameFieldInput;

    @FindBy(xpath = "//*[@for = 'firstname'] ")
    private WebElement firstNameFieldLabel;

    @FindBy(id = "surname")
    private WebElement lastNameFieldInput;

    @FindBy(xpath = "//*[@for = 'surname'] ")
    private WebElement lastNameFieldLabel;

    @FindBy(id = "age")
    private WebElement ageFieldInput;

    @FindBy(id = "country")
    private WebElement countrySelectField;

    @FindBy(id = "notes")
    private WebElement notesInputField;

    public void selectCountry(String country){
        Select countrySelection = new Select(countrySelectField);
        countrySelection.selectByVisibleText(country);

    }

}
