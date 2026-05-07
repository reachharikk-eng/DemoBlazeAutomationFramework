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

    @Test(priority = 2)
    public void verifyMultipleProductsInCart() {

        ProductPage productPage = new ProductPage(driver);

        CartPage cartPage = new CartPage(driver);

        // FIRST PRODUCT

        productPage.clickPhonesCategory();

        productPage.clickFirstProduct();

        productPage.clickAddToCart();

        productPage.acceptAlert();

        driver.navigate().back();

        driver.navigate().back();

        // SECOND PRODUCT

        productPage.clickLaptopsCategory();

        productPage.clickFirstProduct();

        productPage.clickAddToCart();

        productPage.acceptAlert();

        productPage.clickCart();

        Assert.assertEquals(
                cartPage.getCartProductCount(),
                2);

        System.out.println(
                "Two products added successfully");
    }

    @Test(priority = 3)
    public void verifyDeleteProductFromCart() {

        ProductPage productPage = new ProductPage(driver);

        CartPage cartPage = new CartPage(driver);

        productPage.clickPhonesCategory();

        productPage.clickFirstProduct();

        productPage.clickAddToCart();

        productPage.acceptAlert();

        productPage.clickCart();

        Assert.assertEquals(
                cartPage.getCartProductCount(),
                1);

        cartPage.deleteFirstProduct();

        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        Assert.assertEquals(
                cartPage.getCartProductCount(),
                0);

        System.out.println(
                "Product deleted successfully");
    }

    @Test(priority = 4)
    public void verifyTotalPrice() {

        ProductPage productPage = new ProductPage(driver);

        CartPage cartPage = new CartPage(driver);

        productPage.clickPhonesCategory();

        productPage.clickFirstProduct();

        productPage.clickAddToCart();

        productPage.acceptAlert();

        productPage.clickCart();

        String total =
                cartPage.getTotalPrice();

        Assert.assertFalse(total.isEmpty());

        System.out.println(
                "Total Price: " + total);
    }
}