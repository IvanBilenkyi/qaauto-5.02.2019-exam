package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static java.lang.Thread.sleep;

public class SearchResultsFirstPage extends BasePage {

    @FindBy(xpath = "//a//h3[contains(text(),'Selenium') or contains(text(),'selenium')]")
    private List<WebElement> googleSearchResults;

    @FindBy(xpath = "//a[@aria-label='Page 2']")
    private WebElement linkToSecondSearchPage;

    public SearchResultsFirstPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int getSearchResultsCount() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return googleSearchResults.size();
    }

    public SearchResultSecondPage getSecondPage() {
        linkToSecondSearchPage.click();
        return new SearchResultSecondPage(driver);
    }

    public boolean isPageLoaded() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.getTitle().contains("Selenium");
    }
}
