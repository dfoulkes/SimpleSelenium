package com.foulkes.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

/**
 * Created by danfoulkes on 12/02/2017.
 * Project: SimpleSelenium
 * Package: com.foulkes.selenium
 */
public abstract class ChromeSetup {


    private final String CHROME_DRIVER_LOCATION = "/sel/driver/chromedriver";
    private final int TIME_OUT_IN_SECONDS = 30;

    protected WebDriver driver;
    protected HashMap<String, Object> chromePrefs = new HashMap<>();
    protected ChromeOptions options = new ChromeOptions();



    public ChromeSetup(){
        prepareBrowser();
        execute();
    }


    public abstract void execute();

    public void endSession(){
        driver.quit();
    }


    private void prepareBrowser(){
        chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver(cap);
        driver.get("http://www.google.co.uk");
        new WebDriverWait(driver, TIME_OUT_IN_SECONDS);
    }


}
