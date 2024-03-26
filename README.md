
PIVOTAL-TEST
-----------
pivotal-test is a framework to automate acceptance test cases of the Pivotal-Tracker web page.
This uses Cucumber, JUnit and Selenium.


FEATURES TESTED
---------------

Acceptance tests.

- Login
- Dashboard

These features are applied to UI.

REQUIREMENTS
-----------------------------------

The required configuration for this framework is the following:

    -IntelliJ idea IDE.
    -Download apache maven
    -Clone/download the project from GitHub repository: https://github.com/teldrassilDemo/PivotalDemo.git

CONFIGURATIONS
-----------------------------------
Once those requirements are done, follow these steps:

- Open the project downloaded with the IntelliJ IDE.
- Open the pom.xml file and reload the project

Set the required parameters:

    urlLogin=   //pivotal login URL (e.g. https://www.pivotaltracker.com/) 
    user=       //Pivotal user.
    password=   //Pivotal Login.
    APIToken=   //Is the token of your pivotal account.
    
    dockerURL=  //Put docker url (e.g. http://url:4444/wb/hub)
    browser=    //Choose only one option. (CHROME)
    
    #Remote Browser SauceLabs/Browserstack properties
    remoteUserName=     //Is the username of Saucelabs or Browserstack.
    remoteAccessKey=    //Is the key provided.
    remoteBrowserName=  //Is The browser that you want to execute your test
    remoteBrowserVersion=
    remoteResolution=   //Screen resolution.
    remotePlatform=     //sauce labs plataform to be remote test.
    remoteOS=        //Is the remote OS name (e.g. Windows)
    #EXPLICIT WAIT 
    explicitWait= //time for wait elements (e.g. 1920x1080).
    

After executing those steps the frame should be executed.

To execute by command line you can use the following:


        mvn clean test -DurlLogin="https://www.pivotaltracker.com/signin" -Duser="" -Dpassword="" -Dbrowser="CHROME"
   
