package SeleniumDay9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SliderActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
	    driver.get("https://dev.automationtesting.in/sliders");
	    
	    WebDriverWait justwait =new WebDriverWait(driver,Duration.ofSeconds(3000));
	   WebElement XaxisSlider = justwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
			   ("//span[@class='MuiSlider-root MuiSlider-marked MuiSlider-colorPrimary MuiSlider-sizeMedium css-xujn8x']"
			   		+ "//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary "
			   		+ "MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-7drnjp']")));
       
	   System.out.println("X-AxisLocation: " + XaxisSlider.getLocation());
	   
       WebElement YaxisSlider = driver.findElement(By.xpath("//span[@class='MuiSlider-thumb "
       		+ "MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb "
       		+ "MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1dklv9c']"));
	   
       System.out.println("Y-AxisLocation: " + YaxisSlider.getLocation());
       
	   Actions act = new Actions(driver);
	   
	   act.dragAndDropBy(XaxisSlider, 60, 238).perform();
	   Thread.sleep(2000);
	   act.dragAndDropBy(YaxisSlider, 30, 416).perform();
	   
	   System.out.println("AxisLocation: " + XaxisSlider.getLocation());
	   System.out.println("AxisLocation: " + YaxisSlider.getLocation());
	}

}
