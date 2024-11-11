package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.avito.ru/");

        // wait for all elements on the site to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @Test
    public void findElementByTagName(){
        WebElement h2 = driver.findElement(By.tagName("h2"));
        System.out.println(h2.getText());

        List<WebElement> a = driver.findElements(By.tagName("a"));
        System.out.println(a.size());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
