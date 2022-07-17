package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P06_Categories {
    public List<WebElement> AllCategories(){
        return Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]"));
       // return Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]"));
    }
    public WebElement SpecificCategory(){
        return  Hooks.driver.findElement(By.linkText("Apparel"));

    }
    public WebElement subCategory(){
        return  Hooks.driver.findElement(By.linkText("Shoes"));

    }
    public WebElement subCategorypage(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"));

    }




}
