package SeleniumDay11;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDcalculator_usingUtilityFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://fd-calculator.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
	String	Filepath = System.getProperty("user.dir")+"\\Files\\FDValues.xlsx";
	int rows = DataDriven_UtilityFile.getRowCount(Filepath,"Sheet1");
	
	
		for(int i=1; i<=rows; i++)
		{
			String Amount = DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 0);
			String Intrest = DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 1);
			String FDPeriod1 = DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 2);
			String FDPeriod2 = DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 3);
			String CFrequency =DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 4);
			String MatureAmont =DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 5);
			
			
			driver.findElement(By.xpath("//input[@id='fd-amount']")).sendKeys(Amount);
			driver.findElement(By.xpath("//input[@id='interest-rate']")).sendKeys(Intrest);
			driver.findElement(By.xpath("//input[@id='fd-period']")).sendKeys(FDPeriod1);
			
			
			
			Select fdbutton = new Select(driver.findElement(By.xpath("//select[@id='fd-period-type']")));
			fdbutton.selectByVisibleText(FDPeriod2);
			Select Combutton =new Select(driver.findElement(By.xpath("//select[@id='compounding-frequency']")));
			Combutton.selectByVisibleText(CFrequency);
			
			driver.findElement(By.xpath("//button[@id='calculate-btn']")).click();
			
			driver.findElement(By.xpath("//input[@id='fd-amount']")).clear();
			driver.findElement(By.xpath("//input[@id='interest-rate']")).clear();
			driver.findElement(By.xpath("//input[@id='fd-period']")).clear();
			//Validation
			
			WebElement actValue = driver.findElement(By.xpath("//div[@id='result']//strong[text()='Maturity Amount:']/../b"));
		    String	actv = actValue.getText();
		    
		    actv = actv.replaceAll("[^0-9.]", "");
		    
	
			if(Double.parseDouble(MatureAmont)== Double.parseDouble(actv))
			
			{
				System.out.println("Test Passed");
				DataDriven_UtilityFile.setCellData(Filepath, "Sheet1", i, 6,"Passed");
				DataDriven_UtilityFile.fillGreenColor(Filepath, "Sheet1", i, 6);
			}
			else	
			{
				System.out.println("Test Faild");
				DataDriven_UtilityFile.setCellData(Filepath, "Sheet1", i, 6,"Faild");
				DataDriven_UtilityFile.fillRedColor(Filepath, "Sheet1", i, 6);
			}
			Thread.sleep(3000);
			
			
		}
		
	}

}
