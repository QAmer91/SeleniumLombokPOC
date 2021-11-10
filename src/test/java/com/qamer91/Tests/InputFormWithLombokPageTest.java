package com.qamer91.Tests;

import com.qamer91.Pages.InputFormWithLombokPage;
import com.qamer91.Utilities.DriverHandler;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;

public class InputFormWithLombokPageTest {

    DriverHandler driverHandler;
    WebDriver driver;
    InputFormWithLombokPage inputFormWithLombokPage;
    SoftAssert softAssert;

    @Test
    public void insertInputToLombokElements() throws MalformedURLException {
        driverHandler = new DriverHandler();
        softAssert = new SoftAssert();
        driver = driverHandler.createDriver();
        driver.get("https://testpages.herokuapp.com/styled/validation/input-validation.html");
        inputFormWithLombokPage = new InputFormWithLombokPage(driver);
        softAssert.assertEquals(inputFormWithLombokPage.getFirstNameFieldLabel().getText() , "First name:",
                "First Name Label is not Correct");
        softAssert.assertEquals(inputFormWithLombokPage.getLastNameFieldLabel().getText() , "Last name:",
                "Last Name Label is not Correct");

        inputFormWithLombokPage.getFirstNameFieldInput().sendKeys("Ahmed");
        inputFormWithLombokPage.getLastNameFieldInput().sendKeys("Amer");
        inputFormWithLombokPage.getAgeFieldInput().sendKeys("123");
        inputFormWithLombokPage.selectCountry("Egypt");

        softAssert.assertAll();




    }

}
