package Clarusway.tests;

import Clarusway.utilities.BaseCrossBrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Day03_C07_CrossBrowser extends BaseCrossBrowserTest {
    // Go to https://www.amazon.com/
// Search for 'headset' 'mouse' 'keyboard' in order with dataProvider
// Assert that first item contains searched keyword in the item description
// Go to product page
// Add first item to cart
// Click Go to cart on cart section
// Assert shopping cart heading
// Assert that added item is in shopping cart
// Check this is a gift
// Assert that checkbox is checked
// Click on proceed to checkout
// Assert that login page is opened

// Do it for chrome and firefox with crossbrowser testing

    @Test(dataProvider = "data")
    public void amazonTest(String key) {
        driver.get("https://www.amazon.com/");

        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(key+ Keys.ENTER);

        WebElement firstProduct= driver.findElement(By.xpath("//div[@data-component-type='s-search-result']"));
        String firstProductDescription=firstProduct.getText().toLowerCase();

        Assert.assertTrue(firstProductDescription.contains(key));

        firstProduct.findElement(By.tagName("img")).click();

        WebElement addTOCartBtn= driver.findElement(By.id("add-to-cart-button"));
        addTOCartBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("attach-sidesheet-checkout-button"))));

        WebElement goToCartLink=driver.findElement(By.id("attach-view-cart-button-form"));
       goToCartLink.submit();

        List<WebElement> shoppingCartHeaderList=driver.findElements(By.tagName("h1"));
        Assert.assertTrue(shoppingCartHeaderList.size()>0);

        WebElement shoppingCartHeader = shoppingCartHeaderList.get(0);
        Assert.assertTrue(shoppingCartHeader.isDisplayed());
        Assert.assertEquals(shoppingCartHeader.getText(), "Shopping Cart");

        // Check this is a gift
        WebElement thisIsAGiftCb = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        thisIsAGiftCb.click();

        // Assert that checkbox is checked
        Assert.assertTrue(thisIsAGiftCb.isSelected());

        // Click on proceed to checkout
        WebElement proceedToCheckoutBtn = driver.findElement(By.name("proceedToRetailCheckout"));
        proceedToCheckoutBtn.click();

        // Assert that login page is opened
        Assert.assertTrue(driver.getCurrentUrl().startsWith("https://www.amazon.com/ap/signin"));

    }

    @DataProvider
    public Object[][] data(){
        return new Object[][]{
                {"headset"},
                {"mouse"},
                {"keyboard"}
        };
    }
}
