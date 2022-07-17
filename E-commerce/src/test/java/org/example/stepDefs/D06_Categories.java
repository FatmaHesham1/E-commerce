package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_Categories;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class D06_Categories extends P06_Categories {

    String verifySubCat;
    @Given("user could Hover on random category")
    public void HoverCategory() throws InterruptedException {

        Actions actions = new Actions(Hooks.driver);


        // Getting list of options
        List<WebElement> categories = AllCategories();

        // Getting size of options available
        int size = categories.size();

        // Generate a random number with in range
        int randnMumber = ThreadLocalRandom.current().nextInt(0, size);


        // Selecting random value

        WebElement element = categories.get(randnMumber);


        actions.moveToElement(element).perform();

        Thread.sleep(3000);
        System.out.println(element.getText());



    }


@And("user select specific category")
public void Select_Cat() throws InterruptedException {
    Actions actions = new Actions(Hooks.driver);
    actions.moveToElement(SpecificCategory()).perform();
    Thread.sleep(3000);


}

@And("select specific sub category")
public void SubCategory(){
        verifySubCat=subCategory().getText();
        subCategory().click();
}

@Then("user go the selected category page")
    public void Go_To_SelectedCategory(){
    Assert.assertEquals(subCategorypage().getText(),verifySubCat,"Desktop title displayed");
    Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(verifySubCat.toLowerCase().trim()),"URL contains desktops");
        System.out.println("xxx");
}

}
