package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    WebDriver driver;

    By loginLink = By.id("login2");

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickLogin() {

        driver.findElement(loginLink).click();
    }
}