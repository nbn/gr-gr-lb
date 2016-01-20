/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/configuration.html
*/


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.ie.InternetExplorerDriver


// Using GebReportingSpec output a report to the specified dir
reportsDir = "target/geb-reports"

baseNavigatorWaiting = true
atCheckWaiting = true

driver = {
    //set the firefox locale to 'en-us' since the tests expect english
    FirefoxProfile profile = new FirefoxProfile()
    profile.setPreference("intl.accept_languages", "en-us")
    def driverInstance = new FirefoxDriver(profile)
    driverInstance.manage().window().maximize()
    driverInstance
}

environments {

    // Set environment with -Dgeb.env=windows
    windows {
        // Download the IEDriverServer_x64_xxx.zip
        // from https://code.google.com/p/selenium/downloads/list
        System.setProperty('webddriver.ie.driver',new File('C:/path/agent').absolutePath)
        driver = { new InternetExplorerDriver() }
    }

    // Set environment with -Dgeb.env=chrome
    chrome {
        // Download the chrome driver
        // from https://code.google.com/p/selenium/downloads/list
        System.setProperty('webdriver.chrome.driver','/path/to/agent')
        driver = { new ChromeDriver() }
    }

}


