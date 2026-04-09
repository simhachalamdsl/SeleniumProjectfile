package SeleniumDay4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_WiatCommends {

	public static void main(String args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	WebElement usern    =	driver.findElement(By.xpath("//input[@placeholder='Username']"));
	WebElement passw    =	driver.findElement(By.xpath("//input[@placeholder=\'Password\']"));
	WebElement logclick =   driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		
	usern.sendKeys("Admin");
	passw.sendKeys("admin123");
	logclick.click();}
	
	
}
