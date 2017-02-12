package com.foulkes.selenium.runMe;

import java.util.List;

import com.foulkes.selenium.ChromeSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.util.stream.Collectors.toList;


/**
 * Created by danfoulkes on 12/02/2017.
 * Project: SimpleSelenium
 * Package: com.foulkes.selenium
 *
 *
 *  This is a simple of example of extracting data from a web page based on the CSS class
 *
 *
 */
public class ExtractBbcHeadlines extends ChromeSetup {



    public ExtractBbcHeadlines(){
        super();
    }


     public void execute(){
        //gget headlines
        List<String> headlines = getNewsArticlesFromBbc();
        //print results to the console.
        headlines.stream().forEach(x -> System.out.println(x));
        //end session.
        endSession();
    }

    private List<String> getNewsArticlesFromBbc() {
        driver.get("http://www.bbc.co.uk/news");
        List<WebElement> todaysHeadlines = driver.findElements(By.className("gs-c-promo-heading__title"));
        return todaysHeadlines.stream().map(x -> x.getText()).collect(toList());
    }

    public static void main(String[] args){
        new ExtractBbcHeadlines();
    }
}
