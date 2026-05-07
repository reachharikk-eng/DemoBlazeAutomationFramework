package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignupPage;
import utils.TestDataGenerator;

public class SignupTest extends BaseTest {

    @Test(priority = 1)
    public void verifySuccessfulSignup() {

        SignupPage signupPage = new SignupPage(driver);

        signupPage.clickSignup();

        String username =
                TestDataGenerator.generateUsername();

        signupPage.signup(username, "Test@123");

        String alertText = signupPage.getAlertText();

        System.out.println(alertText);

        Assert.assertEquals(alertText,
                "Sign up successful.");

        signupPage.acceptAlert();
    }

    @Test(priority = 2)
    public void verifyExistingUserSignup() {

        SignupPage signupPage = new SignupPage(driver);

        signupPage.clickSignup();

        signupPage.signup("Harikarthik", "HK@07102004s");

        String alertText = signupPage.getAlertText();

        System.out.println("Signup Alert: " + alertText);

        Assert.assertEquals(alertText,
                "This user already exist.");

        signupPage.acceptAlert();
    }
}
