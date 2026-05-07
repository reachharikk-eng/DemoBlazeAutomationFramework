package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    WebDriver driver;

    By loginLink = By.id("login2");
    By logoutLink = By.id("logout2");
    By welcomeUser = By.id("nameofuser");

    public HomePage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    public void clickLogin() {

        driver.findElement(loginLink).click();
    }

    public boolean isUserLoggedIn() {

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    welcomeUser));

            return true;

        } catch (Exception e) {

            return false;
        }
    }

    public String getLoggedInUsername() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                welcomeUser));

        return driver.findElement(welcomeUser).getText();
    }

    public boolean isUserLoggedOut() {

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("login2")));

            return true;

        } catch (Exception e) {

            return false;
        }
    }
    public void clickLogout() {

        clickElement(driver.findElement(logoutLink));
    }
}