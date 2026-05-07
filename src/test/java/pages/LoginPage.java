package pages;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

        typeText(driver.findElement(username), user);
        typeText(driver.findElement(password), pass);

        clickElement(driver.findElement(loginBtn));

    }
}