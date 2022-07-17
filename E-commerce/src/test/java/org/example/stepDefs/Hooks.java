package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {






    public static WebDriver driver = null;

    @Before
    public void openBrowser() {
        String chromeDriver = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
    }

