package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test(priority = 1)
    public void verifyPhonesCategory() {

        ProductPage productPage = new ProductPage(driver);

        productPage.clickPhonesCategory();

        Assert.assertTrue(productPage.isProductDisplayed());

        System.out.println("Phones category loaded");
    }

    @Test(priority = 2)
    public void verifyLaptopsCategory() {

        ProductPage productPage = new ProductPage(driver);

        productPage.clickLaptopsCategory();

        Assert.assertTrue(productPage.isProductDisplayed());

        System.out.println("Laptops category loaded");
    }

    @Test(priority = 3)
    public void verifyMonitorsCategory() {

        ProductPage productPage = new ProductPage(driver);

        productPage.clickMonitorsCategory();

        Assert.assertTrue(productPage.isProductDisplayed());

        System.out.println("Monitors category loaded");
    }

    @Test(priority = 4)
    public void verifyProductDetails() {

        ProductPage productPage = new ProductPage(driver);

        productPage.clickPhonesCategory();

        productPage.clickFirstProduct();

        Assert.assertFalse(
                productPage.getProductTitle().isEmpty());

        Assert.assertFalse(
                productPage.getProductPrice().isEmpty());

        Assert.assertFalse(
                productPage.getProductDescription().isEmpty());

        System.out.println(
                productPage.getProductTitle());

        System.out.println(
                productPage.getProductPrice());
    }

    @Test(priority = 5)
    public void verifyHomeNavigation() {

        ProductPage productPage = new ProductPage(driver);

        productPage.clickPhonesCategory();

        productPage.clickHome();

        Assert.assertTrue(productPage.isProductDisplayed());

        System.out.println("Home navigation successful");
    }
}