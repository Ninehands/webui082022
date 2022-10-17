package ru.gb.lesson6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BaseView{

    public MainPage(WebDriver driver){
        super(driver);

    }
    String authorLabel;

    @FindBy(id = "edit-name")
    public WebElement emailField;

    @FindBy(xpath = "//*[@id='edit-pass']")
    public WebElement passField;

    @FindBy(xpath = "//*[@id='edit-submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id='q']")
    public WebElement authorField;

    @FindBy(xpath = "//*[@class='form-submit']")
    public WebElement submitFindButton;

    @FindBy(xpath = "//*[.='Найденные авторы:']")
    public WebElement foundAuthors;

    @FindBy(xpath = "//*[contains(text(), 'Книги автора')]")
    public WebElement foundBooks;



    @Step("Авторизация")
    public  MainPage clickSignInButton(String login, String password){
        emailField.sendKeys(login);
        passField.sendKeys(password);
        submitButton.click();

        return new MainPage(driver);
    }

    @Step("Поиск автора")
    public MainPage findAuthor(String author, String fullAuthor){
        authorField.sendKeys(author);
        submitFindButton.click();
        webDriverWait.until(ExpectedConditions.visibilityOf(foundAuthors));
        driver.findElement(By.xpath("//span[contains(text(), '"+fullAuthor+"')]")).click();
        webDriverWait.until(ExpectedConditions.visibilityOf(foundBooks));
        return new MainPage(driver);
    }

    @Step("Выбор книги")
    public MainPage chooseBook(String book){
        driver.findElement(By.xpath("//a[contains(text(), '"+book+"')]")).click();
        return new MainPage(driver);
    }












}
