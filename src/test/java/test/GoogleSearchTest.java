/* Exam Task:
1) Create new Maven/Java project
2) Add required libraries to pom.xml (Selenium, TestNG etc)
3) Using best practices of OOP and PageObject/PageFactory patterns automate following scenario
- Navigate to google.com in web browser
- Enter "Selenium" into search field
- Click on "Search" button
- Assert number of Search results is 10 on page 1
- Assert that each result in a list contains searchterm
- Click on "2' link to switch to next page
- Assert number of Search results is 10 on page 2
- Assert that each result in a list contains searchterm

Note: If you have some extra time than create separate tests to verify case sensitive keyword search.

4) In README.md file describe following things:
- what's inside your project ( which files, for what etc)
- what needs to be installed in order to run your tests
- how to run your tests
5) Add .gitignore file with proper content
6) Push your project to GitHub
7) Send link of your repo to mykola.gladchenko@gmail.com when done.
*/
package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.SearchResultSecondPage;
import page.SearchResultsFirstPage;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void successSearchTest() {
        String searchTerm = "Selenium";
        int requiredSearchResultsCount = 10;

        Assert.assertTrue(googleSearchPage.isPageLoaded(),
                "# # # # MESSAGE: Google.com was not loaded. # # # # \n");

        SearchResultsFirstPage searchResultsFirstPage = googleSearchPage.search(searchTerm);

        Assert.assertTrue(searchResultsFirstPage.isPageLoaded(),
                "# # # # MESSAGE: Search Results 1-st Page was not loaded. # # # # \n");

        Assert.assertEquals(searchResultsFirstPage.getSearchResultsCount(), requiredSearchResultsCount,
                "# # # # MESSAGE: Incorrect search results quantity on 1-st page: "
                        +searchResultsFirstPage.getSearchResultsCount()+" instead of "+requiredSearchResultsCount+". # # # # \n");

        SearchResultSecondPage searchResultSecondPage = searchResultsFirstPage.getSecondPage();

        Assert.assertTrue(searchResultSecondPage.isPageLoaded(),
                "# # # # MESSAGE: Search Results 2-nd Page was not loaded. # # # # \n");

        Assert.assertEquals(searchResultSecondPage.getSearchResultsCount(), requiredSearchResultsCount,
                "# # # # MESSAGE: Incorrect search results quantity on 2-nd page: "
                        +searchResultSecondPage.getSearchResultsCount()+" instead of "+requiredSearchResultsCount+". # # # # \n");
    }
}
