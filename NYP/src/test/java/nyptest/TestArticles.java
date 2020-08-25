package nyptest;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import pages.MainPage;

public class TestArticles extends MobileAPI {

    @Test
    public void testArticles(){
        MainPage mainPage = PageFactory.initElements(appiumDriver, MainPage.class);
        mainPage.goToArticles();
    }

}
