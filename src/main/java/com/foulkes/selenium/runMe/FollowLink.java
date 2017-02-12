package com.foulkes.selenium.runMe;

import com.foulkes.selenium.ChromeSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/**
 * Created by danfoulkes on 12/02/2017.
 * Project: SimpleSelenium
 * Package: com.foulkes.selenium
 */
public class FollowLink extends ChromeSetup {


    public FollowLink(){
        super();

    }

    @Override
    public void execute() {
        try{
            iterateOverLinks();
        }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }

    public void iterateOverLinks(){
        driver.get("https://www.reddit.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        for(int i=0; i < 10; i++){
            clickNext();
        }

        endSession();
    }


    private void clickNext()  {
     //dynamic wait holds the thread in this position for upto 15 seconds to render the page, if nothing returns then the app will throw an exception.
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("next-button"))).click();
    }

    public static void main(String[] args){
        new FollowLink();
    }

}
