package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P09_Wishlist {
public WebElement ProductToBeAdded(){
    return Hooks.driver.findElement(By.linkText("Levi's 511 Jeans"));
}
public WebElement FavoriteIcon(){
    return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[3]"));
}
public WebElement ClosesIcon(){
    return Hooks.driver.findElement(By.xpath("/html/body/div[5]/div/span"));
}
public WebElement WishListTab(){
    return Hooks.driver.findElement(By.linkText("Wishlist"));
}
public List<WebElement> AllProducts(){
    return Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div"));

}
public WebElement Success_Msg(){
    return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));

}
public WebElement ItemsNumber(){
    return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input"));
}
}
