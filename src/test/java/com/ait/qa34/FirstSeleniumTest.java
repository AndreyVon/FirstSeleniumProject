package com.ait.qa34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public  void setUp(){
        driver = new ChromeDriver();
        //driver.get("https://www.google.ru/?hl=ru"); // without history
        driver.navigate().to("https://www.google.ru/?hl=ru"); // with history
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
    //test - name
    @Test
    public void openGoogleTest(){
        System.out.println("Google open");
    }
    //after - tearDown
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit(); // close browser(all tabs)
        // driver.close(); // only one tab
    }
}
