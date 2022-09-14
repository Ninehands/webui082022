package ru.gb.lesson3.Selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HomeWork3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://librusec.club/");
        driver.findElement(By.id("edit-name")).sendKeys("Ninehands");
        driver.findElement(By.id("edit-pass")).sendKeys("12345678");
        Thread.sleep(1000);
        driver.findElement(By.id("edit-submit")).click();
        driver.findElement(By.id("q")).sendKeys("Пехов");
        driver.findElement(By.name("submit")).click();
        //888





    }
}
