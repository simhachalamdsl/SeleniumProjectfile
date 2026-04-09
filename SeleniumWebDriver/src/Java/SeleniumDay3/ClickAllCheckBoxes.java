package SeleniumDay6;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		
        List<WebElement> checkboxes=
        		driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));
		
        //Select all CheckBoxes
        
        /*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
       /* for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        
        Thread.sleep(1000);
        // UnSelect All CheckBoxes
        
        /*for (int i=0; i<checkboxes.size();i++)
        if(checkboxes.get(i).isSelected())
        { 
        	checkboxes.get(i).click();
        }*/
        
       // Select last 3 CheckBoxes
       /* for(int i=4; i<checkboxes.size();i++)
        {
        	checkboxes.get(i).click();
        }*/
        
        for(int i=0; i<3 ;i++)
        {checkboxes.get(i).click();}
	}

}
