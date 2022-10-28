package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;

public class ElectronicsPage extends SideNavBar{
    final By electronicTitleSelector = By.cssSelector("[alt='TV store']");
    final By samsungBrandSelector = By.xpath("//span[.='Samsung']");
    final By brandSelector = By.xpath("//span[.='Brands']");

    public ResultsPage clickSamsungBrand(){
        waitForElectronicPageToLoad();
        getWebElement(brandSelector).scrollTo();
        getWebElement(samsungBrandSelector).click();
        return new ResultsPage();
    }

    public void waitForElectronicPageToLoad(){
        getWebElement(electronicTitleSelector).shouldBe(visible);
    }

}
