package SeleniumDay9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class DropAndDownActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dev.automationtesting.in/dragdrop");
		driver.manage().window().maximize();
		WebDriverWait justwait = new WebDriverWait(driver,Duration.ofSeconds(1000));
		
		Actions act =new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-6rrzgu']//div[1]//div[1]//img[@id='selenium-logo']"));
		WebElement drop = driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-6rrzgu']//div[1]//div[1]"));
 
	   act.dragAndDrop(drag, drop).perform();

	   
	  

	    	
	
	}

}
