package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    WebDriver driver;

    By cartProduct = By.xpath("//td[2]");

    By deleteBtn = By.linkText("Delete");

    By totalPrice = By.id("totalp");

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

    public String getTotalPrice() {

        return driver.findElement(totalPrice).getText();
    }

    public void deleteProduct() {

        clickElement(driver.findElement(deleteBtn));
    }
}
