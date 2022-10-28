package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.Test;
import pages.ElectronicsPage;
import pages.HomePage;
import pages.ResultsPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.*;

public class TestScenarios {
    HomePage homePage = new HomePage();
    ResultsPage resultsPage = new ResultsPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    final String baseURL = "https://www.amazon.in/";

    @Before
    public void setUp(){
        open(baseURL);
    }

    @Test
    public void selectSecondHighestSamsungProductFromTheResultsPage() throws InterruptedException {
//        String url = WebDriverRunner.url();
//        assertEquals(url,baseURL);
        homePage.gotoSamsungBrand();
        electronicsPage.clickSamsungBrand();
        resultsPage.sortHightToLow();
        Thread.sleep(5000);


    }
}
