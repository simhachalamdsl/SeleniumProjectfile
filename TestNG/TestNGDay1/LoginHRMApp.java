package TestNGDay1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginHRMApp {

	WebDriver driver;
	 WebDriverWait wait;
	
	
	@BeforeMethod
	void testlogin()
	{

        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        {
    		String act_Titel = driver.getTitle();	
    		if(act_Titel.equals("OrangeHRM"))
    		{System.out.println("Titel is Visuble");}
    		else	
    		{System.out.println("Titel is not Visuble");}
    	}
        
        // Wait for User name field
        wait.until( ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
        
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Click Login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // 🔥 Validation after login (Dash board check)
        WebElement dashboard = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h6[text()='Dashboard']")));
                
        if (dashboard.isDisplayed()) {
            System.out.println("✅ Login Successful");
        } else {
            System.out.println("❌ Login Failed");
        }
	
	}
	
	
	/*@Test(priority = 0)
	void testTitelCheck()
	
	{
		String act_Titel = driver.getTitle();	
		if(act_Titel.equals("OrangeHRM"))
		{System.out.println("Titel is Visuble");}
		else	
		{System.out.println("Titel is not Visuble");}
	}*/
	
	@Test  (priority = 1)
	void testclickbutton_sendvalues() throws InterruptedException
	
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("123456");
	}
}
