package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.GoogleSearchPage;

public class BaseTest {

    private WebDriver driver;

    protected GoogleSearchPage googleSearchPage;

    @BeforeMethod
    public void beforeMethod() {
        // Telling the system where to find the Chrome driver
        System.setProperty("webdriver.chrome.driver", "D:/test__ITEA/_inst/chromedriver_win32/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        googleSearchPage = new GoogleSearchPage(driver);
    }

    @AfterMethod
    public void afterMethod() {
       driver.quit();
    }

}
