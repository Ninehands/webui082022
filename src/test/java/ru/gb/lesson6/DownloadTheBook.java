package ru.gb.lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DownloadTheBook {
    WebDriver driver;

    MainPage mainPage;


/* //*[@id='edit-name']
//*[@id='edit-pass']
//*[@id='edit-submit']
//*[@id='q'] find book
//*[@class='form-submit'] button
// //span[.='Кир Булычев']
//a[.='Белое платье Золушки']
//*[contains(@onclick, 'fb2')]
//*[contains(@download, 'beloe')]
//*[.='Найденные авторы:']
 */


    @BeforeAll

    static void registerDriver(){
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    void initDriver(){
        driver = new FirefoxDriver();
        mainPage=new MainPage(driver);
        driver.get("https://librusec.club//");

    }

    @Test
    void authSite() throws InterruptedException{
        mainPage.clickSignInButton("ninehands", "12345678");
    }


    @Test
    void downloadTheBook() throws InterruptedException {
        mainPage.clickSignInButton("ninehands", "12345678");

        mainPage.findAuthor("Булычев", "Кир Булычев");

        String bookLabel="Белое платье Золушки";


        //Thread.sleep(3000);

        mainPage.chooseBook(bookLabel);






    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }



}
