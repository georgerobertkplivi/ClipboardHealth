package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

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



    public ProductPage getProduct(){
        ElementsCollection listPrices = getWebElements(By.className("a-price-whole"));
        getWebElement(By.xpath("//span[.='" + listPrices.get(1).getText() + "']")).click();
        return new ProductPage();
    }



}
