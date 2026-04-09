package SeleniumDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginXpath 

	{ WebDriver driver;
       //Constructor
    public LoginXpath(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");
    By dashboard = By.xpath("//h6[text()='Dashboard']");

    // Actions
    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboard).isDisplayed();
    }
}