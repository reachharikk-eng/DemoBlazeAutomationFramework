package tests;

import base.BaseTest;
import data.LoginData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginDataProviderTest extends BaseTest {

    @Test(dataProvider = "loginData",
            dataProviderClass = LoginData.class)

    public void verifyLoginWithMultipleData(
            String username,
            String password,
            boolean expectedResult) {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickLogin();

        loginPage.login(username, password);

        if(expectedResult) {

            Assert.assertTrue(homePage.isUserLoggedIn());

            System.out.println("Valid Login Passed");

        } else {

            String alertText = loginPage.getAlertText();

            Assert.assertEquals(alertText,
                    "Wrong password.");

            loginPage.acceptAlert();

            System.out.println("Invalid Login Passed");
        }
    }
}
