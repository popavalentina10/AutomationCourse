package Tests;

import org.testng.annotations.Test;
import ro.sit.course.course06_07.MyCustomException;
import ro.sit.course.course08.BaseTest;
import ro.sit.course.course08.LoginPage;
import ro.sit.course.course08.RegistrationPage;

public class RegistrationTest extends BaseTest {
    LoginPage loginPage;
    RegistrationPage registrationPage;

    @Test
    public void registerTest() throws MyCustomException {
        loginPage = new LoginPage(driver);
        loginPage.goToRegistrationPage();
        registrationPage = new RegistrationPage(driver);
//        registrationPage.clickTermsCheckboxUsingActionsScroll();
        registrationPage.clickTermsCheckboxUsingJsScroll();
    }
}