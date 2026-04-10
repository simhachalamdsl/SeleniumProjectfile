package TestNGDay3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethodDemo {

	WebDriver driver;
	WebDriverWait wait ;
	
	@Test (priority = 1)
	void OpenApp() throws InterruptedException
	{
		driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        driver.manage().window().maximize();
        Thread.sleep(2000);
	}
	@Test (priority=2,dependsOnMethods = {"OpenApp"})
	void Login() throws InterruptedException
	{
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Username']"))
         .sendKeys("Admin");
		
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		 // Click Login
		 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
	
	@Test (priority=3,dependsOnMethods = {"Login"})
	void Search()
	{
		
		 boolean isDashboardVisible = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("//h6[text()='Dashboard']")
	                )
	        ).isDisplayed();
	
	       Assert.assertEquals(isDashboardVisible, false); //this command failed so the next method will skipped
	}
	
	@Test (priority=4,dependsOnMethods = {"Search"})
	void Search1()
	{
		System.out.println("LogoDisplayed");
	}
	
	
	
}
