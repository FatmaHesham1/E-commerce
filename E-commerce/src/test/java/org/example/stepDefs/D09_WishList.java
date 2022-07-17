package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P09_Wishlist;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D09_WishList extends P09_Wishlist {
    SoftAssert softAssert=new SoftAssert();
    @Given("user go to products page")
    public void GoToPage() throws InterruptedException {
        Hooks.driver.get("https://demo.nopcommerce.com/clothing");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;

        Thread.sleep(2000);
        List<WebElement> webElements = AllProducts();
        int No_Items = AllProducts().size();

        js.executeScript("arguments[0].scrollIntoView();", webElements.get(0));
        Thread.sleep(2000);

    }
    @When("user clicks favorite icon below the product")
    public void AddToList() throws InterruptedException {
        FavoriteIcon().click();
        Thread.sleep(2000);
    }
@Then("product is added and closes the message box")
    public void AddedSuccessfully() throws InterruptedException {


    softAssert.assertEquals(Success_Msg().getText(), "The product has been added to your wishlist",
            "Product added to your wishlist");
    System.out.println("Color: " + Success_Msg().getCssValue("background-color"));
    softAssert.assertEquals(Success_Msg().getCssValue("background-color"), "rgba(75, 176, 122, 1)",
            "Background color is green");
    softAssert.assertAll();


        ClosesIcon().click();
}

@When("user chooses wishlist tab")
    public void OpenWishList() throws InterruptedException {

        WishListTab().click();
        Thread.sleep(2000);
}

@Then("user check that the item has been added")
    public void CheckWishlist(){
    int quantity = Integer.parseInt(ItemsNumber().getAttribute("value"));
    softAssert.assertTrue(quantity > 0);
}
}
