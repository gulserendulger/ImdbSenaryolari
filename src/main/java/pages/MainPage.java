package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static constants.MainConstants.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPage extends Driver {

    Actions actions = new Actions(driver);
    Methods methods;

    public MainPage() {
        methods = new Methods();
    }

    public void controlMainPage() throws InterruptedException {
        assertTrue(methods.isElementVisible(Menu, 20));
        Thread.sleep(1000);
    }

    public void clickMenuButton() throws InterruptedException {
        WebElement LoginClick = driver.findElement(Menu);
        Thread.sleep(1000);
        actions.moveToElement(LoginClick).click().perform();
        System.out.println("Menu Tiklandi.");
        Thread.sleep(1000);
    }

    public void clickOscarsButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement OscarsClick = driver.findElement(Oscars);
        Thread.sleep(1000);
        actions.moveToElement(OscarsClick).click().perform();
        System.out.println("Oscars Tiklandi.");
        Thread.sleep(1000);
    }

    public void clickNextDate() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);
        WebElement NextDateClick = driver.findElement(NextDate);
        Thread.sleep(1000);
        actions.moveToElement(NextDateClick).click().perform();
        System.out.println("Next Date Tiklandi.");
        Thread.sleep(1000);
    }

    public void clickDate1920() throws InterruptedException{
        Thread.sleep(1000);
        WebElement Date1920Click = driver.findElement(Date1920);
        Thread.sleep(1000);
        actions.moveToElement(Date1920Click).click().perform();
        System.out.println("Date 1920 Tiklandi.");
        Thread.sleep(1000);
    }

    public void clickDate1929() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);
        WebElement Date1929Click = driver.findElement(Date1929);
        Thread.sleep(1000);
        actions.moveToElement(Date1929Click).click().perform();
        System.out.println("Date 1929 Tiklandi.");
        Thread.sleep(1000);
    }

    public void clickTheCircus() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)", "");
        Thread.sleep(2000);
        WebElement TheCircusClick = driver.findElement(TheCircus);
        Thread.sleep(1000);
        actions.moveToElement(TheCircusClick).click().perform();
        System.out.println("The Circus Tiklandi.");
        Thread.sleep(1000);
    }

    String WriterFirst,DirectorFirst, StarsFirst3, StarsFirst2 ,StarsFirst1;
    public void clickFirst() throws InterruptedException {

        WebElement director = driver.findElement(By.cssSelector("a[href=\"/name/nm0000122/?ref_=tt_ov_dr\"]"));
        DirectorFirst = director.getText();
        System.out.println(DirectorFirst);
        Thread.sleep(1000);
        WebElement writer = driver.findElement(By.cssSelector("a[href=\"/name/nm0000122/?ref_=tt_ov_wr\"]"));
        WriterFirst = writer.getText();
        System.out.println(WriterFirst);
        Thread.sleep(1000);
        WebElement stars1 = driver.findElement(By.cssSelector("a[href=\"/name/nm0000122/?ref_=tt_ov_st\"]"));
        StarsFirst1 = stars1.getText();
        System.out.println(StarsFirst1);
        WebElement stars2 = driver.findElement(By.cssSelector("a[href=\"/name/nm0448224/?ref_=tt_ov_st\"]"));
        StarsFirst2 = stars2.getText();
        System.out.println(StarsFirst2);
        WebElement stars3 = driver.findElement(By.cssSelector("a[href=\"/name/nm0305087/?ref_=tt_ov_st\"]"));
        StarsFirst3 = stars3.getText();
        System.out.println(StarsFirst3);
        Thread.sleep(3000);
    }

    String DirectorTwo,WriterTwo,StarsTwo1,StarsTwo2,StarsTwo3;
    public void clickTwo() throws InterruptedException {

        WebElement director = driver.findElement(By.cssSelector("a[href=\"/name/nm0000122/?ref_=tt_ov_dr\"]"));
        DirectorTwo = director.getText();
        System.out.println(DirectorTwo);
        Thread.sleep(1000);
        WebElement writer = driver.findElement(By.cssSelector("a[href=\"/name/nm0000122/?ref_=tt_ov_wr\"]"));
        WriterTwo = writer.getText();
        System.out.println(WriterTwo);
        Thread.sleep(1000);
        WebElement stars1 = driver.findElement(By.cssSelector("a[href=\"/name/nm0000122/?ref_=tt_ov_st\"]"));
        StarsTwo1 = stars1.getText();
        System.out.println(StarsTwo1);
        WebElement stars2 = driver.findElement(By.cssSelector("a[href=\"/name/nm0448224/?ref_=tt_ov_st\"]"));
        StarsTwo2 = stars2.getText();
        System.out.println(StarsTwo2);
        WebElement stars3 = driver.findElement(By.cssSelector("a[href=\"/name/nm0305087/?ref_=tt_ov_st\"]"));
        StarsTwo3 = stars3.getText();
        System.out.println(StarsTwo3);
        Thread.sleep(3000);
    }

    public void clickImdb() throws InterruptedException {
        Thread.sleep(1000);
        WebElement ImdbClick = driver.findElement(Imdb);
        Thread.sleep(1000);
        actions.moveToElement(ImdbClick).click().perform();
        System.out.println("Imdb Tiklandi.");
        Thread.sleep(1000);
    }

    public void clickSearchButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement SearchClick = driver.findElement(SearchButton);
        Thread.sleep(1000);
        SearchClick.sendKeys(SEARCHKEYWORD);
        Thread.sleep(1000);
        WebElement SearchNextClick = driver.findElement(SearchButtonNext);
        actions.moveToElement(SearchNextClick).click().perform();
        Thread.sleep(1000);
        System.out.println("search Tiklandi.");
        Thread.sleep(2000);
        WebElement SearchTheCircuss = driver.findElement(SearchTheCircus);
        actions.moveToElement(SearchTheCircuss).click().perform();
        Thread.sleep(1000);
    }
    public void control() throws InterruptedException {
        Thread.sleep(1000);
        if(WriterFirst == WriterTwo){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        Thread.sleep(1000);
        if(DirectorFirst == DirectorTwo){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(StarsFirst1 == StarsTwo1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(StarsFirst2 == StarsTwo2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(StarsFirst3 == StarsTwo3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
