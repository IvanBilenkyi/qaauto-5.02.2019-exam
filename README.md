# qaauto-5.02.2019-exam

# "Google Search Test for 2 Search Pages" exam project 

## About the project: 
This project provides test to run for the Google Search testing within
2 search result pages with using specific search term 'Selenium'. 
Also testing classes and related methods inside are implemented in the separate files for java classes.


#### The following folders and files are included:  

1. java/page folder - the package to contain files for page classes:  
    1. BasePage - abstract class 
    with variables and methods that are general for other page classes;
    1. GoogleSearchPage - public class to implement methods are used 
    for objects on Google.com search page;
    1. SearchResultsFirstPage - public class to implement methods are used 
                                    for objects on search results Page 1 of Google.com search page;
    1. SearchResultsSecondPage - public class to implement methods are used 
        for objects on search results Page 2 of Google.com search page.
1. java/test folder - the package to contain files for testing classes: 
    1. BaseTest - public class to implement BeforeMethod and AfterMethod; 
    1. GoogleSearchTest - public class to implement test for Google.com search
    within 2 first search results pages, 
    with using objects of classes above and related methods.
1. pom.xml - configuration file to describe the project, configure dependencies, 
connect some add-ons, plug-ins, etc.
1. .gitignore - configuration file to point out exceptions for files and folders that 
should not be uploaded to Git-repository. 
1. README.md - readme file (with the current text inside) to use for project 
description in repository on GitHub resource.      
 
#### Before run the project please follow preparation steps below:  

1. Verify that you have Java 8 on your workstation: 
    1. Run the following command prompt to verify current Java version: java -version 
    1. If you don't have Java or Java version differs from 8 please install Java 8. 
    1. You may follow the link to download: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

2. Install IntelliJ IDEA if necessary; 
   2. You may follow the link to download: https://www.jetbrains.com/idea/download/ 
 
3. Download and configure Maven Selenium driver:  
   3. Use the following link to download: https://mvnrepository.com/artifact/org.seleniumhq.selenium  
   3. Copy dependencies to the project. 
  
4. Download and configure ChromeDriver: 
   4. Use the following link: https://chromedriver.storage.googleapis.com/index.html?path=2.46/     
   4. Save executable file to the local folder; 
   4. Add the folder to PATH system variable. 
 
5. Also please make sure that Chrome browser has been installed on your workstation; install if necessary. 

#### To run the project please do the next steps:  

1. Download the project files to your testing environment; 
1. Verify that internet connection works and stable; 
1. Suggestion: close all unnecessary Chrome browser windows before the run; 
1. Run IntelliJ IDEA and open the project; 
1. Make sure that no red or red underlined files or text in the code 
(if some present please fix before the test run);
1. Open the file GoogleSearchTest.java and run the test by click on the Run Test
icon (left side opposite to class or test names, Lines 31 and 34) or press [Ctrl+Shift+F10] from the keyboard;
1. When run is completed see the results in console view. 
1. P.S.: If something went wrong please ask Chuck Norris for help :) (or someone else).  
 