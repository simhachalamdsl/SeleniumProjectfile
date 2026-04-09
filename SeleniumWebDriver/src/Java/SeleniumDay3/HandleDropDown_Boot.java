package SeleniumDay6;

import java.util.ArrayList;
import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDown_Boot {

	public static void main(String[] args) throws InterruptedException {
	      
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		driver.findElement
		(By.xpath("//div[@id='withOptGroup']"
				+ "//div[@class='css-1xc3v61-indicatorContainer']"
				+ "//*[name()='svg']")).click();
		
		//Select single option
		

		driver.findElement(By.xpath("//div[@id='react-select-2-option-0-0']")).click();
		
	    driver.findElement
	    (By.xpath("//div[@id='selectOne']"
	    		+ "//div[@class='css-1xc3v61-indicatorContainer']"
	    		+ "//*[name()='svg']")).click();
		
		driver.findElement(By.xpath("//div[@id='react-select-3-option-0-1']")).click();
		
		
		// Capture all the Options and find count
		Thread.sleep(3000);
		List<WebElement>countoption = driver.findElements(By.xpath("//div[@role='option']"));
		
		System.out.println("Number of DropDown Option:"+countoption.size());
		
		//Printing All Options from DropDown
		
		for(WebElement op:countoption)
		{
			System.out.println(op.getText());
		}
		
		// Print All Drop Down Option in console window Create ArrayList
		
		ArrayList<String> optionList = new ArrayList<>();

		for (WebElement op : countoption) 
		{
		    optionList.add(op.getText());
		    
		}
		   System.out.println(optionList);
		
	}

}
