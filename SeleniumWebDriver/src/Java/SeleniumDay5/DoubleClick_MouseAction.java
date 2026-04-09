package SeleniumDay9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick_MouseAction {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
        
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        
        driver.manage().window().maximize();
        
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(3000));
        
      WebElement  Copytext = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']")));
	
	     Actions act = new Actions(driver);
	     
	     act.doubleClick(Copytext).build().perform();
	     
	     Alert alt = driver.switchTo().alert();
	     
	     System.out.println(alt.getText());
	     alt.accept();
	    		 
	
	
	
	
	
	}

}
