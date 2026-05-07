package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

    WebDriver driver;

    By cartProduct = By.xpath("//td[2]");

    By deleteBtn = By.linkText("Delete");

    By totalPrice = By.id("totalp");

    By cartRows = By.xpath("//tr[@class='success']");

    By firstDeleteBtn = By.xpath("(//a[text()='Delete'])[1]");

    public CartPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    public boolean isProductInCart() {

        try {

            waitForElement(driver.findElement(cartProduct));

            return driver.findElement(cartProduct).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }

    public String getCartProductName() {

        return driver.findElement(cartProduct).getText();
    }
    public int getCartProductCount() {

        return driver.findElements(cartRows).size();
    }

    public void deleteFirstProduct() {

        clickElement(driver.findElement(firstDeleteBtn));
    }

    public String getTotalPrice() {

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(totalPrice));

        return driver.findElement(totalPrice).getText();
    }

    public void deleteProduct() {

        clickElement(driver.findElement(deleteBtn));
    }
}
