package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_ChangeCurrency {

    public WebElement CurrencyMenu(){
        return Hooks.driver.findElement(By.id("customerCurrency"));

    }
    public List<WebElement> DisplayResults(){
        return Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]"));
    }
}
