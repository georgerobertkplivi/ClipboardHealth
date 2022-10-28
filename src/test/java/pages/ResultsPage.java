package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;

public class ResultsPage extends SideNavBar{
    final By resultsTitleSelector = By.xpath("//span[.='RESULTS']");
    final By sortByHighToLowSelector = By.xpath("//a[.='Price: High to Low']");
    final By sortByFeaturedSelector = By.xpath("//span[@class='a-button-text a-declarative']");

    public void waitForResultsPageToLoad(){
        getWebElement(resultsTitleSelector).shouldBe(visible);
    }

    public ResultsPage clickSortByFeatured(){
        getWebElement(sortByFeaturedSelector).shouldBe(visible).click();
        return this;
    }

    public ResultsPage clickSortByHighToLow(){
        getWebElement(sortByHighToLowSelector).shouldBe(visible).click();
        return this;
    }

    public ResultsPage sortHightToLow(){
        clickSortByFeatured()
                .clickSortByHighToLow();
        return this;
    }

    // todo find the second Highest Item and Click it to go the Product Page

    final By productSelector = By.xpath("//span[.='6,00,000']");


    public ProductPage getProduct(String price){
        getWebElement(By.xpath("//span[.='" + price + "']"));
        return new ProductPage();
    }

    String results = getWebElements(By.className("a-price-whole")).texts().toString();



}
