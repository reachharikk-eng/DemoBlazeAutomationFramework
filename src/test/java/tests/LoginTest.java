package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickLogin();

        loginPage.login("Harikarthik", "HK@07102004s");
    }
}
