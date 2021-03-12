package com.project.testtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchCarTests {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        goToSite("https://www.mobile.de/");


        //To create Login form tests


    }

    @Test
    public void testCar() {
        click(By.cssSelector(".gicon-flag-ger-s"));
        click(By.cssSelector("[href='https://www.mobile.de/?lang=en']"));

        if (!isElementPresent(By.cssSelector("#qs-categories__CarsTab"))) {
            click(By.cssSelector("#qs-categories__CarsTab"));
        }

// fill Car search form
        click(By.cssSelector("#qsmakeBuy"));
        click(By.cssSelector("[value='25200']"));
        click(By.cssSelector("#qsmodelBuy"));
        click(By.cssSelector("[value='36']"));
        click(By.cssSelector("#qssub"));     // Search Button
    }




    @AfterClass(enabled = false)
    public void tearDown(){
        wd.quit();
    }



    public void click(By locator) {
        wd.findElement(locator).click();
    }


    public void goToSite(String url) {
        wd.navigate().to(url);
    }

    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }


}
