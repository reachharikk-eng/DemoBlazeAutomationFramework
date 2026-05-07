package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;

import java.time.Duration;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(ConfigReader.getTimeout()));
    }

    public void waitForElement(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element) {

        waitForElement(element);
        element.click();
    }

    public void typeText(WebElement element, String text) {

        waitForElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public String getAlertText() {

        return wait.until(ExpectedConditions.alertIsPresent())
                .getText();
    }

    public void acceptAlert() {

        wait.until(ExpectedConditions.alertIsPresent())
                .accept();
    }
}
