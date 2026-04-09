package SeleniumDay10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewLinkOpen_NewTab_KeyboardActions {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement bookurl =driver.findElement(By.xpath("//span[@id='see-book-Learning JavaScript Design Patterns']"));
	
		Actions act =new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(bookurl).perform();	
		
		//Converting ArrayList
		
		List<String> wids=new ArrayList<>(driver.getWindowHandles());
		
		//Switch to 2nd Window to find some text 
		
		driver.switchTo().window(wids.get(1));
		
		WebElement ISBNumber = driver.findElement(By.xpath("//div[@id='ISBN-wrapper']//label[@id='userName-value']"));
	
	    System.out.println("ISBN :" +ISBNumber.getText());
	
	
	
	}

}
