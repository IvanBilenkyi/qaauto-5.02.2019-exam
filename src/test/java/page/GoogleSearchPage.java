package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class GoogleSearchPage extends BasePage {

    @FindBy(xpath = "//input[@title='Пошук' or @title='Поиск' or @title='Zoeken']")
    // @FindBy(xpath = "//input[@title='Пошук']")
    private WebElement inputGoogleSearchField;

    @FindBy(xpath = "//div[@class='VlcLAe' or @class='FPdoLc VlcLAe']//input[@value='Пошук Google' or @value='Поиск в Google' or @value='Google zoeken']")
    // @FindBy(xpath = "//div[@class='VlcLAe']//input[@value='Поиск в Google']")
    public WebElement buttonSearchInGoogle;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SearchResultsFirstPage search (String searchTerm){
        inputGoogleSearchField.sendKeys(searchTerm);
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        buttonSearchInGoogle.click();
        return new SearchResultsFirstPage(driver);
    }

    public boolean isPageLoaded() {
        return inputGoogleSearchField.isDisplayed();
    }
}
