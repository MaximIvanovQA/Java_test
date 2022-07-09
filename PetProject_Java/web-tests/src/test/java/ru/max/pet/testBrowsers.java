package ru.max.pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;


public class testBrowsers {
    public RemoteWebDriver driver;
    @BeforeEach
    public void setUp () throws Exception{
        ChromeOptions options = new ChromeOptions();
        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            put("enableVideo", false);
        }});
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void chromeSession()  {
        String title = driver.getTitle();
        Assertions.assertEquals("Swag Labs", title);
        driver.quit();
    }

    @Test
    public void edgeSession() {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);

        driver.quit();
    }

    @Test
    public void firefoxSession() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);

        driver.quit();
    }
}
