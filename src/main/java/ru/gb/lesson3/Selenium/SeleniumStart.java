package ru.gb.lesson3.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//222
public class SeleniumStart {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.close();



        WebDriverManager.firefoxdriver().setup();
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://ya.ru");
        firefoxDriver.quit();


    }
}
