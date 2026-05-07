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
    By placeOrderBtn =
            By.xpath("//button[text()='Place Order']");

    By nameField = By.id("name");

    By countryField = By.id("country");

    By cityField = By.id("city");

    By cardField = By.id("card");

    By monthField = By.id("month");

    By yearField = By.id("year");

    By purchaseBtn =
            By.xpath("//button[text()='Purchase']");

    By confirmationPopup =
            By.cssSelector(".sweet-alert");

    By confirmationText =
            By.cssSelector(".lead");

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

    public void clickPlaceOrder() {

        clickElement(
                driver.findElement(placeOrderBtn));
    }

    public void fillOrderForm(
            String name,
            String country,
            String city,
            String card,
            String month,
            String year) {

        typeText(
                driver.findElement(nameField),
                name);

        typeText(
                driver.findElement(countryField),
                country);

        typeText(
                driver.findElement(cityField),
                city);

        typeText(
                driver.findElement(cardField),
                card);

        typeText(
                driver.findElement(monthField),
                month);

        typeText(
                driver.findElement(yearField),
                year);
    }

    public void clickPurchase() {

        clickElement(
                driver.findElement(purchaseBtn));
    }

    public boolean isOrderConfirmed() {

        try {

            waitForElement(
                    driver.findElement(
                            confirmationPopup));

            return driver.findElement(
                            confirmationPopup)
                    .isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }

    public String getConfirmationMessage() {

        return driver.findElement(
                        confirmationText)
                .getText();
    }
}
