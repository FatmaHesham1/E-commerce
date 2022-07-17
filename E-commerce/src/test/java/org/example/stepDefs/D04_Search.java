package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_Search;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_Search extends P04_Search {

    SoftAssert softassert = new SoftAssert();

    @Given("user searched using product name \"(.*)\"$")
    public void ByProductName(String Name) {
        searchBar().sendKeys(Name);
    }



    @When("user clicked on Search button")
    public void SearchButton() {
        Search_Btn().click();
    }

    @Then("Results are displayed")
    public void Display_SearchResult() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;

        Thread.sleep(2000);
        List<WebElement> webElements = DisplayResults();
        int No_Items = DisplayResults().size();

        js.executeScript("arguments[0].scrollIntoView();", webElements.get(0));
       // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);


        softassert.assertTrue(Hooks.driver.getCurrentUrl().contains("search"));
        softassert.assertTrue(No_Items > 0, "Items have been found");
        softassert.assertAll();


    }
    @Given("user searched using \"(.*)\"$")
    public void searchBySerialNumber(String sku) {
        searchBar().sendKeys(sku);
    }
}
