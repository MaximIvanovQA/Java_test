package ru.max.pet;

import org.junit.jupiter.api.*;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;

public class ValueTitleEqualSwagLabs {

    @Test
    public void setUp() throws Exception{
        ChromeOptions options = new ChromeOptions();
        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            put("enableVideo", false);
        }});
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        Assertions.assertEquals("Swag Labs", title);
        driver.quit();
    }

}
