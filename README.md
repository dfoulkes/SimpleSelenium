# Simple Selenium
a simple selenium to demonstrate test automation written in Java application.



## Installation Instructions

1. install [Git](https://git-scm.com) as our source control tool.
2. install [Java SDK](http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase6-419409.html)
3. download [Maven](https://maven.apache.org/download.cgi)
4. Follow the [Maven installation guide](https://maven.apache.org/install.html)
5. Open a new terminal and test that maven works with the following command: mvn -version
6. Install [Chrome](https://www.mozilla.org/en-GB/firefox/new/)
7. We will be using webDriver to communicarte with Chrome, their is a binary supplied in the resources folder src/main/resources pleace the chromedriver in the following directory:
8. This is designed to be ran from within a [Eclipse](https://eclipse.org/downloads/) . 

##Running the Test Application

1. Checkout from git.

```bash
git clone https://github.com/dfoulkes/SimpleSelenium.git
```

2. Import the project into Eclipse
    

3. Build using Maven
```bash
mvn clean install
```

##Key Notes

1. Running in Windows

if you are using Windows you will need to change the path of the Chrome Driver to get it working.

todo this in the ChromeSetup.java file change the update the following line replacing Winodws path to the file path of the chromedriver:

![alt text](https://github.com/dfoulkes/SimpleSelenium/tree/master/src/main/resources/images/eclipse_maven_import.png "Logo Title Text 1")


```java
private final String CHROME_DRIVER_LOCATION = "WINDOWS_PATH";
```


