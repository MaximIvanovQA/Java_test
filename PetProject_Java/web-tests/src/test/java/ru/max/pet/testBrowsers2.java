package ru.max.pet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBrowsers2 {
    public WebDriver web;
    @BeforeEach
    public void setUp() throws Exception{
        WebDriverManager.chromedriver().setup();
        web = new ChromeDriver();
        web.get("https://www.saucedemo.com/");
    }

    @Test
    public void chromeSession()  {
        String title = web.getTitle();
        Assertions.assertEquals("Swag Labs", title);
        web.quit();
    }
}
