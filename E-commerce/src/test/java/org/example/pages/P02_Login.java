package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {
    public WebElement Login_page()
    {
        return  Hooks.driver.findElement(By.linkText("Log in"));
    }
    public WebElement Email()
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password()
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement Login_Btn()
    {
        return  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }
    public WebElement Logout_Btn()
    {
        return  Hooks.driver.findElement(By.linkText("Log out"));
    }
    public WebElement failedLoginMessage() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
    }
    public WebElement MyAcc_tab()
    {
        return  Hooks.driver.findElement(By.linkText("My account"));
    }




}
