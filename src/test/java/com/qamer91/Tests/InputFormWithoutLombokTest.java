package com.qamer91.Tests;

import com.qamer91.Pages.InputFormWithoutLombokPage;
import com.qamer91.Utilities.DriverHandler;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;

public class InputFormWithoutLombokTest {

    DriverHandler driverHandler;
    WebDriver driver;
    InputFormWithoutLombokPage inputFormWithoutLombokPage;
    SoftAssert softAssert;

    @Test
    public void insertInputToNonLombokElements() throws MalformedURLException {
        driverHandler = new DriverHandler();
        softAssert = new SoftAssert();
        driver = driverHandler.createDriver();
        driver.get("https://testpages.herokuapp.com/styled/validation/input-validation.html");
        inputFormWithoutLombokPage = new InputFormWithoutLombokPage(driver);

        softAssert.assertEquals(inputFormWithoutLombokPage.getFirstNameFieldLabel(), "First name:" ,
                "First name Field Label is not Correct");
        softAssert.assertEquals(inputFormWithoutLombokPage.getLastNameFieldLabel(), "Last name:" ,
                "Last name Field Label is not Correct");
        inputFormWithoutLombokPage.setFirstNameFieldInput("Ahmed");
        inputFormWithoutLombokPage.setLastNameFieldInput("Amer");
        inputFormWithoutLombokPage.setAgeFieldInput("123");
        inputFormWithoutLombokPage.selectCountry("Egypt");

        softAssert.assertAll();

    }

}
