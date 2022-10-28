package tests;

import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    final String baseURL = "https://www.amazon.in/";

    @Before
    public void setUp(){
        open(baseURL);
    }
}
