package SeleniumDay10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutordemo {

	public static void main(String[] args) {
		
		
        WebDriver driver = new ChromeDriver();
        
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		WebDriverWait justwait = new WebDriverWait(driver,Duration.ofSeconds(1000));
		WebElement  clickInteretion= driver.findElement(By.xpath("//div[@class='home-body']//a[5]"));
		
		clickInteretion.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		  // ✅ Fixed XPath (removed extra quotes)
        WebElement buttonClick = justwait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[contains(@class,'element-list accordion-collapse collapse show')]//li[@id='item-4']")));

        // ✅ JavaScript click
        js.executeScript("arguments[0].click();", buttonClick);
    }
}
		
		
		
		
		
