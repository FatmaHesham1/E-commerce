package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_FollowUs;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.util.ArrayList;

public class D08_FollowUs extends P08_FollowUs {

    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
    ArrayList<String> All_tabs = null;

    @When("user click on facebook")
    public void Select_FacebookIcon() throws InterruptedException {

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");        Thread.sleep(2000);
        Facebook().click();
        Thread.sleep(2000);
        All_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }


    @Then("user go to facebook page")
    public void Navigate_to_Facebook() throws InterruptedException {
        String FirstTab=All_tabs.get(0);
        Hooks.driver.switchTo().window(FirstTab);
        Thread.sleep(3000);


        String SecondTab=All_tabs.get(1);
        Hooks.driver.switchTo().window(SecondTab);
        Thread.sleep(3000);

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        Hooks.driver.close();

        Hooks.driver.switchTo().window(FirstTab);
        Thread.sleep(3000);
    }

    @When("user click on twitter")
    public void Select_TwitterIcon() throws InterruptedException {
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");        Thread.sleep(2000);

        Twitter().click();
        Thread.sleep(2000);

        All_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user go to twitter page")

    public void Navigate_toTwitter() throws InterruptedException {
        String FirstTab=All_tabs.get(0);
        Hooks.driver.switchTo().window(FirstTab);
        Thread.sleep(3000);

        String SecondTab=All_tabs.get(1);
        Hooks.driver.switchTo().window(SecondTab);
        Thread.sleep(3000);


        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(FirstTab);

    }

    @When("user click on rss")
    public void Select_RssIcon() throws InterruptedException {
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");        Thread.sleep(2000);

        RSS().click();
        Thread.sleep(3000);
        All_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user go to rss page")
    public void Navigate_toRssPage() throws InterruptedException {

        String FirstTab=All_tabs.get(0);
        Hooks.driver.switchTo().window(FirstTab);
        Thread.sleep(3000);

        String SecondTab=All_tabs.get(1);
        Hooks.driver.switchTo().window(SecondTab);
        Thread.sleep(3000);

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(FirstTab);

    }

    @When("user click on youtube")
    public void Select_YoutubeIcon() throws InterruptedException {
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");        Thread.sleep(2000);

        Youtube().click();
        Thread.sleep(3000);

        All_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user go to youtube page")
    public void Navigate_toYoutubePage() throws InterruptedException {

        String FirstTab=All_tabs.get(0);
        Hooks.driver.switchTo().window(FirstTab);
        Thread.sleep(3000);

        String SecondTab=All_tabs.get(1);
        Hooks.driver.switchTo().window(SecondTab);
        Thread.sleep(3000);

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(FirstTab);

    }

}

