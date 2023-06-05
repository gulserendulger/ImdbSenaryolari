package constants;

import org.openqa.selenium.By;

public class MainConstants{

    public static final By Menu = By.cssSelector("label[id=\"imdbHeader-navDrawerOpen\"]");
    public static final By Oscars = By.cssSelector("a[href=\"/oscars/?ref_=nv_ev_csegosc\"]");

    public static final By NextDate = By.cssSelector("li[class=\"ipc-tab-arrow ipc-tab-arrow--visible ipc-tab-arrow--right\"]");
    public static final By Date1920 = By.xpath("//*[text()=\"1920s\"]");
    public static final By Date1929 = By.xpath("//*[text()=\"1929\"]");
    public static final By TheCircus = By.cssSelector("img[title=\'Şarlo Sirkte\']");


    public static final By Imdb = By.cssSelector("svg[id=\"home_img\"]");
    public static final By SearchButton = By.cssSelector("input[id=\"suggestion-search\"]");
    public static final By SearchButtonNext = By.cssSelector("button[id=\"suggestion-search-button\"]");
    public static final By SearchTheCircus = By.xpath("//*[text()=\"Şarlo Sirkte\"]");


    public static final String SEARCHKEYWORD = "The Circus";

}
