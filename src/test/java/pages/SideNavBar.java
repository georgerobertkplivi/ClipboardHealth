package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;

public class SideNavBar extends PageObject{
    final By hamburgerMenuSelector = By.cssSelector(".hm-icon");
    final By appliancesSelector = By.cssSelector("[data-ref-tag='nav_em_1_1_1_14']");
    final By televisionSelector = By.xpath("//a[.='Televisions']");


    public SideNavBar clickHamburgerMenu(){
        getWebElement(hamburgerMenuSelector).click();
        return this;
    }

    public SideNavBar clickAppliance(){
        getWebElement(appliancesSelector).click();
        return this;
    }

    public ElectronicsPage clickTelevision(){
        getWebElement(televisionSelector).shouldBe(visible).click();
        return new ElectronicsPage();
    }



}
