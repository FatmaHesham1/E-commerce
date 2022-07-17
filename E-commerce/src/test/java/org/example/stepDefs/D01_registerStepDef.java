package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D01_registerStepDef extends P01_register {
SoftAssert softassert=new SoftAssert();

@Given("user go to register page")
    public void Navigate_to_Reg() throws InterruptedException {

    register_Btn().click();
    Thread.sleep(1000);
}

@When("user selected \"(.*)\"$")
    public void select_Gender(String gender) throws InterruptedException {
    if(gender.equalsIgnoreCase("f")){
        Select_Female().click();
        softassert.assertTrue(Select_Female().isSelected());
        Thread.sleep(1000);


    }
    else{
       Select_Male().click();
       softassert.assertTrue(Select_Male().isSelected());
        Thread.sleep(1000);

    }

}

@And("user type \"(.*)\"$")
public void FisrtName(String FirstName) throws InterruptedException {
    FirstName().clear();
    FirstName().sendKeys(FirstName);
    Thread.sleep(1000);


}
    @And("user entered \"(.*)\"$")
    public void LastName(String LastName) throws InterruptedException {
       LastName().clear();
        LastName().sendKeys(LastName);
        Thread.sleep(1000);

    }

    @And("user selected date of birth")
    public void DOB() throws InterruptedException {
        Select D_select = new Select(Day_OfBirth());
        Select M_select = new Select(Month_OfBirth());
        Select Y_select=new Select(Year_OfBirth());

        D_select.selectByVisibleText("17");
        M_select.selectByIndex(3);
        Y_select.selectByValue("1999");

        Thread.sleep(1000);


    }
    @And("user enter \"(.*)\"$")
    public void Email(String Email) throws InterruptedException {
        Email().clear();
        Email().sendKeys(Email);
        Thread.sleep(1000);

    }
    @And("user entered company Name")
    public void companyName(){
        CompanyName().clear();
        CompanyName().sendKeys("DXC");

    }
    @And("user enters \"(.*)\"$")
    public void Password(String password){
        password().clear();
        password().sendKeys(password);
    }
    @And("user re-enter \"(.*)\"$")
    public void ConfirmPassword(String Confpassword){
        Conf_password().clear();
        Conf_password().sendKeys(Confpassword);
    }

   @And("user clicked on register button")
    public void RegisterButton() throws InterruptedException {
btn_register().click();
Thread.sleep(1000);
   }
    @Then("user registered successfully")
    public void RegisterCompleted() throws InterruptedException {

            List<WebElement> webElements = registerMessage();
            softassert.assertTrue(webElements.get(0).getText().equalsIgnoreCase("Your registration completed"),
                    "Registration Complete");
            System.out.println(webElements.get(0).getCssValue("color"));
            softassert.assertTrue(webElements.get(0).getCssValue("color").equals(("rgba(76, 177, 124, 1)")),"Color is green");
            softassert.assertAll();
            Thread.sleep(1000);
            webElements.get(1).click();

    }







}
