package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    WebDriver driver;

    By username = By.id("loginusername");
    By password = By.id("loginpassword");
    By loginBtn = By.xpath("//button[text()='Log in']");

    public LoginPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    public void login(String user, String pass) {

        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}
