package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_HomeSliders;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D07_HomeSliders extends P07_HomeSliders {
   // SoftAssert softAssert=new SoftAssert();
    @Given("user clicked on \"(.*)\"$")
    public void SelectSquare(String num) throws InterruptedException {
        if(num.equalsIgnoreCase("1")){
            FirstSquare().click();
            Thread.sleep(2000);
        }
        else{
            SecondSquare().click();
            Thread.sleep(2000);

        }
    }
    @When("user click on this slider")
    public void ClickOnslider() throws InterruptedException {
        Slider().click();
        Thread.sleep(2000);

    }
    @Then("user go the selected \"(.*)\"$")
    public void NavigateTo(String slider){
        if (slider.equalsIgnoreCase("Nokia")){
            Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");


        }
        else {
            Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-8");

        }
    }
}
