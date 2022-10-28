package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public abstract class PageObject {

    public SelenideElement getWebElement(By selector){
        return $(selector);
    }

    public ElementsCollection getWebElements(By selector){
        return $$(selector);
    }

    protected SelenideElement elementIsPresent(final By selector, final boolean wait) {
       return getWebElement(selector).shouldBe(visible);
    }


}
