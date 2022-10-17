package ru.gb.Lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AfishaTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setupBrowser(){
        driver=new ChromeDriver();
        webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(5));
        actions=new Actions(driver);
        driver.get("https://librusec.club/");
    }
//let element = document.evaluate("//*[text() = 'Some Text']", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null)
//element.singleNodeValue.remove()
    ////*[@id="main"]/div[1]
    ////*[@id="main"]/div[1]
    @Test
    void getToOkko() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("let element = document.evaluate(\"//*[@id=\"yandex_rtb_R-A-1587974-2\"]/yatag/yatag[2]\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null)\n" +
                "//element.singleNodeValue.remove()");
        Thread.sleep(5000);

    }
    @AfterEach
    void killBrowser(){
        driver.quit();
    }


}
