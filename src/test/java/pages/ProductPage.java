package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;

public class ProductPage extends PageObject{

    public void getAbout(){
        final By aboutSelector = By.xpath("//h1[@class='a-size-base-plus a-text-bold']");
        getWebElement(aboutSelector)
                .scrollTo()
                .shouldBe(visible)
                .shouldHave(text(" About this item "));
        System.out.println(aboutText());
    }

    public String aboutText(){
       return getWebElement(By.id("feature-bullets")).getText();
    }
}
