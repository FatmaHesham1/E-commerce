package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_ResetPassword {
    public WebElement MyAccount() {
        return Hooks.driver.findElement(By.linkText("My account"));
    }


    public WebElement changePassword() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[7]/a"));
    }

    public WebElement CurrentPassword(){
        return Hooks.driver.findElement(By.id("OldPassword"));
    }
    public WebElement NewPassword(){
        return Hooks.driver.findElement(By.id("NewPassword"));
    }
    public WebElement Conf_NewPassword(){
        return Hooks.driver.findElement(By.id("ConfirmNewPassword"));
    }
    public WebElement ChangePass_Btn(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/di" +
                "v[3]/div/div[2]/div/div[2]/form/div[2]/button"));
    }


    public WebElement passwordChanged() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[5]/div/p"));
    }


}
