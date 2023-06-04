package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.VerifyResultsСomponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendar = new CalendarComponent();
    VerifyResultsСomponent verify = new VerifyResultsСomponent();

    SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderValue = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDayInput = $("#dateOfBirthInput"),
            hobbyCheckBox = $("#hobbiesWrapper"),
            subjectsInput = $("#subjectsInput"),
            subjectsMathInput = $("#react-select-2-option-0"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input"),
            addressInput = $("#currentAddress"),
            selectPicture = $("#uploadPicture"),
            submitButton = $("#submit"),
            closeButton = $("#closeLargeModal");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage closeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirsName(String name) {
        firstNameInput.setValue(name);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setUserEmail(String email) {
        userEmailInput.setValue(email);
        return this;
    }

    public RegistrationPage setGender(String gender) {
        genderValue.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage setUserNumber(String number) {
        userNumberInput.setValue(number);
        return this;
    }

    public RegistrationPage setHobbies(String hobby) {
        hobbyCheckBox.$(byText(hobby)).click();
        return this;
    }

    public RegistrationPage setBirthDay(String day, String month, String year) {
        birthDayInput.click();
        calendar.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setSubject(String subject) {
        subjectsInput.setValue(subject);
        subjectsMathInput.click();
        return this;
    }

    public RegistrationPage setState(String state) {
        stateInput.setValue(state).pressEnter();
        return this;
    }

    public RegistrationPage setCity(String city) {
        cityInput.setValue(city).pressEnter();
        return this;
    }

    public RegistrationPage setAddress(String address) {
        addressInput.setValue(address);
        return this;
    }

    public RegistrationPage selectPicture(String filename) {
        selectPicture.uploadFromClasspath(filename);
        return this;
    }

    public RegistrationPage submitForm() {
        submitButton.click();
        return this;
    }

    public RegistrationPage verifyGreeting() {
        verify.verifyGreeting();
        return this;
    }

    public RegistrationPage verifyStudentName(String key, String firsAndLastName) {
        verify.verifyResult(key, firsAndLastName);
        return this;
    }

    public RegistrationPage verifyStudentEmail(String key, String email) {
        verify.verifyResult(key, email);
        return this;
    }

    public RegistrationPage verifyGender(String key, String genderValue) {
        verify.verifyResult(key, genderValue);
        return this;
    }

    public RegistrationPage verifyMobile(String key, String mobile) {
        verify.verifyResult(key, mobile);
        return this;
    }

    public RegistrationPage verifyDateOfBirth(String key, String date) {
        verify.verifyResult(key, date);
        return this;
    }

    public RegistrationPage verifySubjects(String key, String subject) {
        verify.verifyResult(key, subject);
        return this;
    }

    public RegistrationPage verifyHobbies(String key, String hobby) {
        verify.verifyResult(key, hobby);
        return this;
    }

    public RegistrationPage verifyPicture(String key, String filename) {
        verify.verifyResult(key, filename);
        return this;
    }

    public RegistrationPage verifyAddress(String key, String address) {
        verify.verifyResult(key, address);
        return this;
    }

    public RegistrationPage verifyStateAndCity(String key, String stateAndCity) {
        verify.verifyResult(key, stateAndCity);
        return this;
    }

    public RegistrationPage closeModalForm() {
        closeButton.click();
        return this;

    }
}

