package SeleniumDay8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1InDiffrentApproch {

     static void SelectmonthandYear (WebDriver driver,String year,String month)	
     {
    	
 		//Select month and year in date picker
 		
 		while(true)
 		{
 			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
 			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
 		
             if(currentmonth.equals(month) && currentyear.equals(year))
                {
             	break;
                }
             // for Future date click button
             
             // driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
              
              // for Previous date click button 
              
              driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
              
        }
 		
 	 }
     
     static void selectalldates (WebDriver driver,String date)
     {
    	// select date in date picker
 		
 		List <WebElement> alldates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr/td/a"));
 		
 		for(WebElement dt:alldates)
 		{
 			if(dt.getText().equals(date))
 			{
 				dt.click();
 				break;
 			}
 		}		
 		
     }
     
       public static void mian (String[] arge)
       {
    	   WebDriver driver =new ChromeDriver();
   		
   		driver.get("https://jqueryui.com/datepicker/");
   		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
   		
   		driver.switchTo().frame(0);
   		
   		//driver.findElement(By.xpath("//input[@id='date picker']")).sendKeys("12/12/2022");

   		String year = "2022";
   		String month = "May";
   		String date = "25";
   		
   		// click the date picker
   		
   		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
   		SelectmonthandYear(driver,year,month);
   		selectalldates(driver,date);
   		
       }
    		


}
    	 
     
     



