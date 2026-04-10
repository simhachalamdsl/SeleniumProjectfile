package TestNGDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Group_Login {
	
	
	    WebDriver driver;

	    public void LoginPage_Grouping(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void login(String username, String password) {

	      driver.findElement(By.xpath("//input[@placeholder='Username']"))
	              .sendKeys(username);

	        driver.findElement(By.xpath("//input[@placeholder='Password']"))
	              .sendKeys(password);

	        driver.findElement(By.xpath("//button[normalize-space()='Login']"))
	              .click();
	    }
	}


