package SeleniumDay4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Waitmethods {



	public static void main(String[] args) throws  InterruptedException {

         WebDriver driver =new ChromeDriver();
         
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         
         WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
         
         WebElement usern =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
            
         WebElement passw =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\'Password\']")));
        
         WebElement loginclick =mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
                   	   
          usern.sendKeys("Admin");
          passw.sendKeys("admin123");
          loginclick.click();
	
	
	
	}

}


