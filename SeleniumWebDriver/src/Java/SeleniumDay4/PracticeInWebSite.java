package SeleniumDay7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeInWebSite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
        driver.findElement(By.xpath("//select[@name='fromPort']")).click();		
        driver.findElement(By.xpath("//option[@value='Portland']")).click();
        
        driver.findElement(By.xpath("//select[@name='toPort']")).click();
        driver.findElement(By.xpath("//option[@value='Rome']")).click();
        
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
        
        //Find Total No.of columns
         int columncount =driver.findElements(By.xpath("//table[@class='table']//tr//th")).size();
      		System.out.println("Total No.of Columns:"+columncount);
      		
      	//Find Total No.of Rows
      		int rowcount = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
      		System.out.println("Total No.of Rows: " + rowcount);
            Thread.sleep(3000);
            
            // Store all prices in ArrayList
            List<WebElement> values = driver.findElements(By.xpath("//table[@class='table']//tr/td[6]"));

            ArrayList<String> priceList = new ArrayList<>();

            for (WebElement val : values) 
            {
                priceList.add(val.getText());
            }

            System.out.println("All Prices: " + priceList);

            // Find minimum value
            String minValue = priceList.get(0);
            for (String val : priceList) 
            {
                double current = Double.parseDouble(val.replace("$", ""));
                double min = Double.parseDouble(minValue.replace("$", ""));

                if (current < min) 
                {
                    minValue = val;
                }
            }
            System.out.println("Minimum value: " + minValue);

            // Find row of minimum value
            int minRow = 0;
            for (int r = 2; r <= rowcount; r++) 
            {
                String value = driver.findElement( By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")).getText();

                if (value.equals(minValue)) 
                {
                    minRow = r;
                    break;
                }
            }

            // Click "Choose This Flight" button
            driver.findElement(By.xpath("//table[@class='table']//tr[" + minRow + "]//input[@type='submit']")).click();

            System.out.println("Clicked row: " + minRow);

            
            driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Thammineni Simhachalam");
            driver.findElement(By.xpath("//input[@id='address']")).sendKeys("KPHB");
            driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hyderabad");
            driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Telangana");
            driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("500048");
            driver.findElement(By.xpath("//select[@id='cardType']")).click();
            driver.findElement(By.xpath("//option[@value='dinersclub']")).click();
            driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("4523 4897 4501 2356");
            driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("12");
            driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2026");
            driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("T Simhachalam");
            driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
            driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
          
            String SuccessMessage = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
            
            System.out.println(SuccessMessage);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
    }