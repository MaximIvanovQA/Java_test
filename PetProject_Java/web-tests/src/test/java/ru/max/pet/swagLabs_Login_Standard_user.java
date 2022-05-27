package ru.max.pet;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class swagLabs_Login_Standard_user {
    FirefoxDriver driver;

    @BeforeMethod
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void swagLabs_Login_Standard_user(){
        driver.get("https://www.saucedemo.com/");
    }
    @AfterMethod
    public void tearDown(){ driver.quit(); }

}
