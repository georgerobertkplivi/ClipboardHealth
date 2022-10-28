package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;

public class HomePage extends SideNavBar{

    public void waitForHomePageToLoad(){
        getWebElement(By.xpath("//div[@id='nav-xshop']/a[.='Best Sellers']")).shouldBe(visible);
        getWebElement(By.xpath("//a[.=\"Today's Deals\"]")).shouldBe(visible);
        getWebElement(By.cssSelector(".hm-icon-label")).shouldBe(visible);
        getWebElement(By.xpath("//div[@id='nav-xshop']/a[.='Mobiles']")).shouldBe(visible);
    }

    public HomePage gotoSamsungBrand(){
        clickHamburgerMenu()
                .clickAppliance()
                .clickTelevision();
        return this;
    }
}
