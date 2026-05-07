package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;

public class OrderTest extends BaseTest {

    @Test(priority = 1)
    public void verifyPlaceOrder() {

        ProductPage productPage =
                new ProductPage(driver);

        CartPage cartPage =
                new CartPage(driver);

        // ADD PRODUCT

        productPage.clickPhonesCategory();

        productPage.clickFirstProduct();

        productPage.clickAddToCart();

        productPage.acceptAlert();

        productPage.clickCart();

        // PLACE ORDER

        cartPage.clickPlaceOrder();

        cartPage.fillOrderForm(
                "Hari",
                "India",
                "Chennai",
                "123456789",
                "May",
                "2026");

        cartPage.clickPurchase();

        Assert.assertTrue(
                cartPage.isOrderConfirmed());

        String confirmation =
                cartPage.getConfirmationMessage();

        System.out.println(
                confirmation);

        Assert.assertTrue(
                confirmation.contains("Id"));

        System.out.println(
                "Order placed successfully");
    }
}
