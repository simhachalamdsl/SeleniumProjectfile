package SeleniumDay5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement displaystatus = driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']"));
		
		System.out.println(displaystatus.isDisplayed());
		
	    WebElement enablestatus =	driver.findElement(By.xpath("//button[@class='submit-btn']"));

	    System.out.println(enablestatus.isEnabled());

	    WebElement clickfemale = driver.findElement(By.xpath("//input[@id='female']"));
	    
	    clickfemale.click();
	    
	    System.out.println(clickfemale.isSelected());
	
	}

}
