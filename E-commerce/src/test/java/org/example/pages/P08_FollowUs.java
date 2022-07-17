package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_FollowUs {
    public WebElement Facebook(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));
    }

    public WebElement Twitter(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a"));
    }

    public WebElement RSS(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a"));
    }

    public WebElement Youtube(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a"));
    }
}
