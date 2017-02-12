package com.foulkes.selenium;

/**
 * Created by danfoulkes on 12/02/2017.
 * Project: SimpleSelenium
 * Package: com.foulkes.selenium
 */
public class FollowLink extends ChromeSetup  {


    public FollowLink(){
        super();

    }

    @Override
    void execute() {
        iterateOverLinks();
    }

    public void iterateOverLinks(){
        driver.get("http://www.bbc.co.uk/news");
        endSession();
    }
}
