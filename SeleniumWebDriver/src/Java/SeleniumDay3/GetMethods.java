package SeleniumDay5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
		
		System.out.println(driver.getTitle());	
		
		String urls = driver.getCurrentUrl();
		System.out.println(urls);
		
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		
		driver.findElement(By.xpath("//a[normalize-space()='PlaywrightPractice']")).click();
	
		System.out.println(driver.getCurrentUrl());
	}

}
