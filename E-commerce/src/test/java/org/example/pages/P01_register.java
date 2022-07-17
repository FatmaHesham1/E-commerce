package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P01_register {

    public WebElement register_Btn()
    {
        return  Hooks.driver.findElement(By.linkText("Register"));
    }

    public WebElement Select_Male(){
        return  Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement Select_Female(){
        return  Hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement FirstName(){
        return  Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement LastName(){
        return  Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement Day_OfBirth(){
        return  Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement Month_OfBirth(){
        return  Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement Year_OfBirth(){
        return  Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement Email(){
        return  Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement CompanyName(){
        return  Hooks.driver.findElement(By.id("Company"));
    }
    public WebElement password(){
        return  Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement Conf_password(){
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement btn_register(){
        return  Hooks.driver.findElement(By.id("register-button"));
    }
    public List<WebElement> registerMessage() {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(Hooks.driver.findElement(By.className("result")));
        webElements.add(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")));
        return webElements;
    }


}
