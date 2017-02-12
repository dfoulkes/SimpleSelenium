package com.foulkes.selenium.runMe;

import com.foulkes.selenium.ChromeSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by danfoulkes on 12/02/2017.
 * Project: SimpleSelenium
 * Package: com.foulkes.selenium
 */
public class NavigatePageTutorial extends ChromeSetup {

    WebDriverWait wait;

    public NavigatePageTutorial(){
        super();

    }

    @Override
    public void execute() {
        try{
            iterateOverLinks();
        }
       catch(Exception e){
           //since we're going to force  an exception we will want to catch the error to close the browser.
           endSession();
       }
    }

    public void iterateOverLinks(){
        driver.get("https://www.reddit.com/");
         wait = new WebDriverWait(driver, 15);

        //iterate over arrange until no more next buttons exist.
        for(int i=0; i < Integer.MAX_VALUE; i++){
            clickNextWhenButtonRendersOnPageExplicit();
            findLinksThatContainKeyWord("wife");
        }


    }

    /**
     * An explicit wait is code you define to wait for a certain condition to occur before proceeding further in the code.
     * The worst case of this is Thread.sleep(), which sets the condition to an exact time period to wait
     */
    private void clickNextWhenButtonRendersOnPageExplicit()  {
     //an explicit wait holds the thread in this position for upto 15 seconds to render the page, if nothing returns then the app will throw an exception.
        wait.until(ExpectedConditions.elementToBeClickable(By.className("next-button"))).click();
    }

    /**
     * find links that contain a keyword.
     * @param word
     */
    private void findLinksThatContainKeyWord(String word){
        driver.findElements(By.className("title"))
                            .stream()
                            .filter(x -> x.getText().contains(word))
                            .forEach( y-> System.out.println(y.getText()));

    }



    public static void main(String[] args){
        new NavigatePageTutorial();
    }

}
