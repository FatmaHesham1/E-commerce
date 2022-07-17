package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_Search {

    public WebElement searchBar() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement Search_Btn() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button"));
    }

    public List<WebElement> DisplayResults() {
        return Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div"));
       // return Hooks.driver.findElements(By.cssSelector("div[class=\"item-grid\"] div[class=\"item-box\"]"));
    }

}
