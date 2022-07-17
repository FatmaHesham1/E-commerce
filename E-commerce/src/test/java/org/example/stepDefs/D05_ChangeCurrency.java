package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P05_ChangeCurrency;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D05_ChangeCurrency extends P05_ChangeCurrency {
    SoftAssert softassert=new SoftAssert();
    @Given("user choosed \"(.*)\"$")
    public void ChangeCurrency(String type) throws InterruptedException {

        Select select = new Select(CurrencyMenu());

        if(type.equalsIgnoreCase("Euro")){
            select.selectByVisibleText("Euro");
            Thread.sleep(2000);
        }
        else{
            select.selectByVisibleText("US Dollar");
            Thread.sleep(2000);
        }
    }
    @Then("Currency selected is diplayed \"(.*)\"$")
    public void DisplayCurrency(String type) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;

        Select select = new Select(CurrencyMenu());
        String option = select.getFirstSelectedOption().getText();
        if(type.equalsIgnoreCase("Euro")){

            softassert.assertEquals("Euro",option);

            List<WebElement> webElements = DisplayResults();
            //int No_Items = DisplayResults().size();

            js.executeScript("arguments[0].scrollIntoView();", webElements.get(0));
            // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            Thread.sleep(1000);

        }
        else {
            softassert.assertEquals("US Dollar",option);
            List<WebElement> webElements = DisplayResults();


            js.executeScript("arguments[0].scrollIntoView();", webElements.get(0));
            // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            Thread.sleep(1000);
        }
    }

}
