package com.project.testtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchCarTests {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        goToSite("https://www.mobile.de/");

    }

    @Test
    public void testCar(){
        click(By.cssSelector(".gicon-flag-ger-s"));
        click(By.cssSelector("[href='https://www.mobile.de/?lang=en']"));


    }


//    public boolean isElementPresent(By locator) {
//        return wd.findElements(locator).size() > 0;
//    }

    private void click(By locator) {
        wd.findElement(locator).click();
    }


    private void goToSite(String url) {
        wd.navigate().to(url);
    }

}
