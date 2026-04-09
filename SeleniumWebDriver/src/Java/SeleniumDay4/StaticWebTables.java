package SeleniumDay7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Find Total No.of columns
		int columncount =driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		System.out.println("Total No.of Columns:"+columncount);
		
		//Find Total No.of Rows
		
		int rowcount= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total No.of Rows:"+rowcount);
		
		//Read Data from Specific Row
		
		Thread.sleep(3000);
		List<WebElement> rowdata =driver.findElements(By.xpath("//table[@name='BookTable']//tr[5]"));
		
		// Result Data in ArrayList
		ArrayList<String> rowlist = new ArrayList<>();
		 for (WebElement op :rowdata) 
		{
		    rowlist.add(op.getText());  
		}
		   System.out.println(rowlist);
		
		// Read Data from Specific Row in a Column
		   
		 String rcdata =  driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[3]")).getText();
		 System.out.println("Value Is:"+rcdata);
		
		/*//Read All the Data in Table
		 
		for (int r=2; r<=rowcount;r++)
		 {
		     for(int c=1;c<=columncount;c++)
			 {
				 String alldata =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			     System.out.print(alldata + "\t");
			 } 
		     System.out.println();
			 
		 }*/
		 
		// Conditional based Read Data (Print book name whose author is Mukesh)
		
		/*for (int r=2; r<=rowcount; r++)
		{
			String AuthorName =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	     	
		    if(AuthorName.equals("Mukesh"))
		    {
		    	String MukeshBookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		         System.out.println(MukeshBookName);
		    }
		}*/
		
		// Find Total Price of all Books
		  int total =0;
		 for (int r=2; r<=rowcount; r++)
		 {
			 String Price =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		     total = total+Integer.parseInt(Price); //Integer.parseInt will convert String to Int
		 }
		     System.out.println("Total Price:"+total);
		
		
	}

}
