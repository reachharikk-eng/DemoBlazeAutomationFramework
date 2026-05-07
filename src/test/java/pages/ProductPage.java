package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {

    WebDriver driver;

    By phonesCategory =
            By.xpath("//a[text()='Phones']");

    By laptopsCategory =
            By.xpath("//a[text()='Laptops']");

    By monitorsCategory =
            By.xpath("//a[text()='Monitors']");

    By firstProduct =
            By.xpath("//a[@class='hrefch']");

    By productTitle = By.cssSelector(".name");

    By productPrice = By.cssSelector(".price-container");

    By productDescription = By.id("more-information");

    By homeLink = By.partialLinkText("Home");
    By addToCartBtn = By.linkText("Add to cart");

    By cartLink = By.id("cartur");

    public ProductPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    public void clickPhonesCategory() {

        clickElement(driver.findElement(phonesCategory));
    }

    public void clickLaptopsCategory() {

        clickElement(driver.findElement(laptopsCategory));
    }

    public void clickMonitorsCategory() {

        clickElement(driver.findElement(monitorsCategory));
    }

    public boolean isProductDisplayed() {

        try {

            waitForElement(driver.findElement(firstProduct));

            return driver.findElement(firstProduct).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }

    public void clickFirstProduct() {

        wait.until(ExpectedConditions
                .presenceOfAllElementsLocatedBy(firstProduct));

        driver.findElements(firstProduct)
                .get(0)
                .click();
    }
    public void clickAddToCart() {

        clickElement(driver.findElement(addToCartBtn));
    }

    public void clickCart() {

        clickElement(driver.findElement(cartLink));
    }

    public String getProductTitle() {

        waitForElement(driver.findElement(productTitle));

        return driver.findElement(productTitle).getText();
    }

    public String getProductPrice() {

        return driver.findElement(productPrice).getText();
    }

    public String getProductDescription() {

        return driver.findElement(productDescription).getText();
    }

    public void clickHome() {

        clickElement(driver.findElement(homeLink));
    }
}
