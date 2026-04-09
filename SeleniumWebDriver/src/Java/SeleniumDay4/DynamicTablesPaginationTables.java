package SeleniumDay7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablesPaginationTables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//li[@id='menuform:j_idt41']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='menuform:m_table']")).click();
		Thread.sleep(2000);
		
		int totalpages = driver.findElements(By.xpath("//div//span//a[@tabindex='0']")).size();
		
		System.out.println("Total No.of Pages:"+totalpages);
		
		for (int p = 1; p <= totalpages; p++) {

		    if (p > 1) {
		        WebElement pages = driver.findElement(By.xpath("//div//span//a[@tabindex='0']["+p+"]") );
		        pages.click();
		        
		     // Reading Data from the pages  //body//tbody/tr[1]//td[1]
				   int Nrows = driver.findElements(By.xpath(" //body//tbody/tr[1]")).size();
				    		for (int r=1; r<=Nrows; r++)
				    		{
				    			Thread.sleep(1000);
				    			String EName   =driver.findElement(By.xpath("//body//tbody/tr["+r+"]//td[1]")).getText();
		
				    			Thread.sleep(1000);
				    			String Joining =driver.findElement(By.xpath("//body//tbody/tr["+r+"]//td[4]")).getText();
				    			Thread.sleep(1000);
				    			String Country =driver.findElement(By.xpath("//body//tbody/tr["+r+"]//td[2]")).getText();
				    		
				    		System.out.print(EName +"\t"+ Joining+ "\t" + Country);			    	
				    			}
				    		{
				    			//System.out.println();
				    		}
				    		    
		    }

		  
	}
}
}
