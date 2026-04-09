package SeleniumDay6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleDropDowns_Select {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		
		// Select DropDown
		
		//driver.findElement(By.xpath("//select[@id='oldSelectMenu']")).click();
		
		//driver.findElement(By.xpath("//option[@value='3']")).click();

		WebElement dropcolor = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		Select dropcolors =new Select ((WebElement) dropcolor);
		
		/*dropcolors.selectByVisibleText("Red");
		
		dropcolors.selectByValue("1");
		
		dropcolors.selectByIndex(5);*/
		
		
		// Find All drop down options
		
		List<WebElement>options = dropcolors.getOptions();
		System.out.println("Number of DropDown Options:"+options.size());
		
		
		// Print All Drop Down Option in console window
		
		/*for(WebElement op:options)
		{
	
			System.out.println(op.getText());
		}*/
		
		// Print All Drop Down Option in console window Create ArrayList
		ArrayList<String> optionList = new ArrayList<>();

		for (WebElement op : options) 
		{
		    optionList.add(op.getText());
		    
		}
		   System.out.println(optionList);
		
		
		
	}

}
