package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static java.lang.Thread.sleep;

public class SearchResultSecondPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Сторінка 2') or contains(text(),'Страница 2') or contains(text(),'Page 2')]")
    private WebElement secondPageIndicator;

    @FindBy(xpath = "//a//h3[contains(text(),'Selenium') or contains(text(),'selenium')]")
    private List<WebElement> googleSecondSearchResults;

    public SearchResultSecondPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int getSearchResultsCount() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return googleSecondSearchResults.size();
    }

    public boolean isPageLoaded() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return secondPageIndicator.isDisplayed();
    }
}
