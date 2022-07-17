package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_ResetPassword;
import org.testng.Assert;

public class D03_ResetPassword extends P03_ResetPassword {

    @Given("user got to My Account tab")
    public void myAccountTab(){
        MyAccount().click();
    }

    @When("user chooses change password")
    public void changePasswordTab(){
        changePassword().click();
    }

    @And("user enter current password \"(.*)\"$")
    public void EnterCurrentPass(String CurrentPass){
        CurrentPassword().sendKeys(CurrentPass);
    }
    @And("user enter new password \"(.*)\"$")
    public void EnterNewPass(String NewPass){
        NewPassword().sendKeys(NewPass);
    }
    @And("user re-enter new password \"(.*)\"$")
    public void Conf_NewPass(String NewPass) throws InterruptedException {
        Conf_NewPassword().sendKeys(NewPass);
        ChangePass_Btn().click();
        Thread.sleep(1000);
    }

    @Then("password is changed successfully")
    public void changePasswordMessage(){
        Assert.assertEquals(passwordChanged().getText(),
                "Password was changed",
                "Email with instructions has been sent to you");
    }

}
