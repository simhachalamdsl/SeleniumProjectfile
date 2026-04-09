package SeleniumDay6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDown_Hidden {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		//Select Single Option
		driver.findElement(By.xpath("//span[normalize-space()='Freelance']")).click();
		//Count number of Options
		Thread.sleep(5000);
	List<WebElement> options =driver.findElements(By.xpath("//div[@role='listbox']//div"));
		System.out.println("Number of options:"+options.size());
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		// Print All Drop Down Option in console window Create ArrayList
		
				ArrayList<String> optionList = new ArrayList<>();

				for (WebElement op :options) 
				{
				    optionList.add(op.getText());
				    
				}
				   System.out.println(optionList);
	}

}
