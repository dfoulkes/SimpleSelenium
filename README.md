# Simple Selenium
Welcome, this is a fast guide for setting up Selenium environment within Eclipse. 


## What is Selenium?
as seen on [thier website](http://www.seleniumhq.org)

Selenium automates browsers. That's it! What you do with that power is entirely up to you. Primarily, it is for automating web applications for testing purposes, but is certainly not limited to just that. Boring web-based administration tasks can (and should!) also be automated as well.

## Who is this for?

I am trying to keep this guide as simple as possible so to remain accessible to people of all levels of development experience, however this is not a guide on how to code in java so if you've never seen any C syntax programming language before then it may be quite difficult. 

## Installation Instructions

1. install [Git](https://git-scm.com) as our source control tool.
2. install [Java SDK](http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase6-419409.html)
3. download [Maven](https://maven.apache.org/download.cgi)
4. Follow the [Maven installation guide](https://maven.apache.org/install.html)
5. Open a new terminal and test that maven works with the following command: mvn -version
6. Install [Chrome](https://www.mozilla.org/en-GB/firefox/new/)
7. We will be using webDriver to communicarte with Chrome, their is a binary supplied in the resources folder src/main/resources pleace the chromedriver in the following directory:
8. This is designed to be ran from within a [Eclipse](https://eclipse.org/downloads/). 

##Running the Test Application

1. Checkout from git.

```bash
git clone https://github.com/dfoulkes/SimpleSelenium.git
```

2. Import the project into Eclipse
    1. File, import
      ![alt text](https://raw.githubusercontent.com/dfoulkes/SimpleSelenium/master/src/main/resources/images/eclipse_maven_import.png "importing into eclipse image")
    2. Choose Existing Maven Project.
      ![alt text](https://raw.githubusercontent.com/dfoulkes/SimpleSelenium/master/src/main/resources/images/select_git_repo.png "selecting repo image")
    3. Click finish.
      
You should now have the project imported into Eclipse, the file structure should look something like:
![alt text](https://raw.githubusercontent.com/dfoulkes/SimpleSelenium/master/src/main/resources/images/file_structure.png "Eclipse File Structure image")   

3. In the terminal navigate to the path of the pom.xml file and execute the following:
```bash
mvn clean install
```

4. To run the application choose one of the executable classes in the com.foulkes.selenium.runMe package right click and select Run Application
![alt text](https://raw.githubusercontent.com/dfoulkes/SimpleSelenium/master/src/main/resources/images/run_in_eclipse.png "Eclipse File Structure image")   



##Key Notes

1. Running in Windows

if you are using Windows you will need to change the path of the Chrome Driver to get it working.

TO DO this in the ChromeSetup.java file change the update the following line replacing Winodws path to the file path of the chromedriver:

Please visit ![alt text](https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver "Chrome Driver") for detailed instructions on installing Chrome Driver for your OS.

```java
private final String CHROME_DRIVER_LOCATION = "WINDOWS_PATH";
```


