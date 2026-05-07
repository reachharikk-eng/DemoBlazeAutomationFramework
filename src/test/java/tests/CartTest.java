package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;

public class CartTest extends BaseTest {

    @Test(priority = 1)
    public void verifyAddToCart() {

        ProductPage productPage = new ProductPage(driver);

        CartPage cartPage = new CartPage(driver);

        productPage.clickPhonesCategory();

        productPage.clickFirstProduct();

        productPage.clickAddToCart();

        String alertText =
                productPage.getAlertText();

        System.out.println(alertText);

        productPage.acceptAlert();

        productPage.clickCart();

        Assert.assertTrue(cartPage.isProductInCart());

        System.out.println(
                cartPage.getCartProductName());
    }
}