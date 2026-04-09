package SeleniumDay9;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverMouseAction {
	
	
	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/hovers");
		
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	    
	 // WebDriverWait mywait = new WebDriverWait (driver,Duration.ofSeconds(3000));
		
	 // WebElement MouseHover = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='example']//div[1]//img[1]")));
		
	  WebElement MouseHover = driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
	  WebElement profileclick = driver.findElement(By.xpath("//div[@class='example']//div[1]//div[1]//a[1]"));
	 
	  Actions act = new Actions(driver);
        
	  act.moveToElement(MouseHover).moveToElement(profileclick).click().build().perform();
	  
	  		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    }
}