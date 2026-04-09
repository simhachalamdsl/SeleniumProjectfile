package SeleniumDay6;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		/*Thread.sleep(1000);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement clickbutton =driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		
		clickbutton.click();
		
		Thread.sleep(1000);
		
        driver.switchTo().alert().accept();*/
		
        /*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(1000);
		//driver.switchTo().alert().accept(); // It is Click the OK button in popup 
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss()	; // It is Click the Cancel in popup
		
		WebElement copyresult = driver.findElement(By.xpath("//p[@id='result']"));
	
	    System.out.println(copyresult.getText());*/
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(1000);
        Alert  prompt = driver.switchTo().alert();
      
        prompt.sendKeys("Welcome");
        prompt.accept();
        
        WebElement copyresult = driver.findElement(By.xpath("//p[@id='result']"));
    	
	    System.out.println(copyresult.getText());
      
	}

}
