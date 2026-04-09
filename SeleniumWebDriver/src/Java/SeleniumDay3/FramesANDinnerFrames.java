package SeleniumDay6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesANDinnerFrames {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		/*WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello");*/
		
		//inner frame
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	    driver.switchTo().frame(frame3);
	    
	    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Welcome");
	
	    driver.switchTo().frame(0);
	    
	    driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();
	    
	    driver.switchTo().defaultContent();	// it will go main page
	    
	}

}
