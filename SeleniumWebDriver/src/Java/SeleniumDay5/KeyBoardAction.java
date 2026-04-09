package SeleniumDay10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		WebDriverWait keepwait = new WebDriverWait(driver,Duration.ofSeconds(3000));
		
	    WebElement	copyboxlocated =keepwait.until(ExpectedConditions.visibilityOfElementLocated
	    		                                    (By.xpath("//textarea[@id='currentAddress']")));
	    copyboxlocated.sendKeys("Hello Simhachalam");

	    WebElement pastboxlocated = keepwait.until(ExpectedConditions.visibilityOfElementLocated
	    		                 (By.xpath("//textarea[@id='permanentAddress']")));
	    
	    Actions act =new Actions(driver);
	    
	    Thread.sleep(3000);
	    act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	    
	    act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	    
	    act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	    Thread.sleep(3000);
	    act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();	    
	
	
	
	
	}

}
