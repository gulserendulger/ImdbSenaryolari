package Imdb;

import driver.Driver;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class Imdb extends Driver {


    MainPage mainPage;

    @Test
    public void test() throws InterruptedException {
        init();
        mainPage.clickMenuButton();
        mainPage.clickOscarsButton();
        mainPage.clickNextDate();
        mainPage.clickDate1920();
        mainPage.clickDate1929();
        mainPage.clickTheCircus();
        mainPage.clickFirst();
        mainPage.clickImdb();
        mainPage.clickSearchButton();
        mainPage.clickTwo();
        mainPage.control();
    }

    public void init() {
        mainPage = new MainPage();
    }


}
