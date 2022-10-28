package tests;

import org.junit.Test;
import pages.ElectronicsPage;
import pages.HomePage;
import pages.ProductPage;
import pages.ResultsPage;

import static com.codeborne.selenide.Selenide.switchTo;

public class TestScenarios extends BaseTest {
    HomePage homePage = new HomePage();
    ResultsPage resultsPage = new ResultsPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void selectSecondHighestSamsungProductFromTheResultsPage(){
        homePage.gotoSamsungBrand();
        electronicsPage.clickSamsungBrand();
        resultsPage.sortHightToLow()
                .getProduct();
        switchTo().window(1);
        productPage.getAbout();

    }

}
