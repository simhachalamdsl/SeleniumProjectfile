package TestNGDay2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod_AnnotationsDemo {
	
	WebDriverWait wait;
	WebDriver driver;
	
	@BeforeMethod
	void Login() 
	{
		driver = new ChromeDriver();
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        wait = new WebDriverWait(driver, Duration.ofSeconds(3000));

		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
         .sendKeys("Admin");

		 // Enter Password
		 driver.findElement(By.name("password")).sendKeys("admin123");
		
		 // Click Login
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority =1)
	void Searchlogin()
	{
		 // ✅ Validation - Dashboard visible
        boolean isDashboardVisible = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h6[text()='Dashboard']")
                )
        ).isDisplayed();
        
        if (isDashboardVisible) 
        {
            System.out.println("✅ Login Successful");
        } else 
        {
            System.out.println("❌ Login Failed");
        }
        
	}
	
	@Test(priority =2)
	 void checktest() throws InterruptedException
     {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("123456");
     }
	
	@AfterMethod
	void logout() 
	{
		driver.quit();
	}

}
