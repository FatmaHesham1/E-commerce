package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_HomeSliders {
    public WebElement FirstSquare(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]"));
    }
    public WebElement SecondSquare(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]"));
    }
    public WebElement Slider(){
        return Hooks.driver.findElement(By.className("nivoSlider"));
    }
}
