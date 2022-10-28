package tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.ElectronicsPage;
import pages.HomePage;
import pages.ProductPage;
import pages.ResultsPage;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.*;

public class TestScenarios extends BaseTest {
    HomePage homePage = new HomePage();
    ResultsPage resultsPage = new ResultsPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void selectSecondHighestSamsungProductFromTheResultsPage(){
//        String url = WebDriverRunner.url();
//        assertEquals(url,baseURL);
        homePage.gotoSamsungBrand();
        electronicsPage.clickSamsungBrand();
        resultsPage.sortHightToLow()
                .getProduct();
        switchTo().window(1);
        productPage.getAbout();
//        assertArrayEquals(productPage.aboutText().getBytes(), "Soem".getBytes()); // todo Get all the text from the About Section and log it in console





    }

    @Test
    public void getListOfPrices(){
        selectSecondHighestSamsungProductFromTheResultsPage();
        ElementsCollection listPrices = $$(By.className("a-price-whole"));
        System.out.println(listPrices.texts());
    }
}
