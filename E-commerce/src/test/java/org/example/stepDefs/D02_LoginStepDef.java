package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef extends P02_Login {
    SoftAssert softassert=new SoftAssert();

    @Given("user go to login page")
    public void Navigate_to_login() throws InterruptedException {

        Login_page().click();
        Thread.sleep(1000);
    }
    @When("user fill email field with \"(.*)\"$")
    public void email(String email){
Email().clear();
Email().sendKeys(email);
    }
    @And("user fill password field with \"(.*)\"$")
    public void Password(String pass){
        password().clear();
        password().sendKeys(pass);
    }
    @And("user clicked on login button")
    public void clickLogin() throws InterruptedException {
        Login_Btn().click();
        Thread.sleep(2000);



    }
@Then("user logged in successfully")
    public void loginSuccess(){
    softassert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "Login Successfully");
    softassert.assertTrue(MyAcc_tab().isDisplayed());
    softassert.assertAll();
   // softassert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/login?returnurl=%2F");


}
    @When("user enter invalid email \"(.*)\"$")
    public void invalidData(String email) {

        Email().sendKeys(email);

    }
    @And("user enter invalid password \"(.*)\"$")
    public void invalidpass(String pass) {

        password().sendKeys(pass);

    }
    @Then("Error Message Appears")
    public void loginUserFailed() {

        softassert.assertEquals(failedLoginMessage().getText(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                        "No customer account found",
                "Login Failed");
        softassert.assertTrue(failedLoginMessage().getCssValue("color").equals("rgba(228, 67, 75, 1)"),
                "Color is red");
        softassert.assertAll();
    }
}
