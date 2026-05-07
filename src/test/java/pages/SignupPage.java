package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage extends BasePage {

    WebDriver driver;

    By signupLink = By.id("signin2");

    By username = By.id("sign-username");
    By password = By.id("sign-password");

    By signupBtn = By.xpath("//button[text()='Sign up']");

    public SignupPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    public void clickSignup() {

        clickElement(driver.findElement(signupLink));
    }

    public void signup(String user, String pass) {

        typeText(driver.findElement(username), user);

        typeText(driver.findElement(password), pass);

        clickElement(driver.findElement(signupBtn));
    }
}
