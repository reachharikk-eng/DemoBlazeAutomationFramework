package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void verifyValidLogin() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickLogin();

        loginPage.login("Harikarthik", "HK@07102004s");

        Assert.assertTrue(homePage.isUserLoggedIn());

        System.out.println(
                "Logged in User: " +
                        homePage.getLoggedInUsername());
    }

    @Test(priority = 2)
    public void verifyInvalidLogin() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickLogin();

        loginPage.login("Joey", "user1111");

        String alertText = loginPage.getAlertText();

        System.out.println("Alert Message: " + alertText);

        Assert.assertEquals(alertText,
                "Wrong password.");

        loginPage.acceptAlert();
    }
    @Test(priority = 3)
    public void verifyLogout() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickLogin();

        loginPage.login("Harikarthik", "HK@07102004s");

        Assert.assertTrue(homePage.isUserLoggedIn());

        homePage.clickLogout();

        Assert.assertTrue(homePage.isUserLoggedOut());

        System.out.println("Logout Successful");
    }

}