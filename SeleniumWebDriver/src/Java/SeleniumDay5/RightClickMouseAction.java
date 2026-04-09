package SeleniumDay9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickMouseAction {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        WebDriverWait waittime = new WebDriverWait(driver,Duration.ofSeconds(1000));
        
        WebElement  rclick =  waittime.until(ExpectedConditions.visibilityOfElementLocated
        		                   (By.xpath("//span[@class='context-menu-one btn btn-neutral']")));
        
        Actions act = new Actions(driver);
        
        act.contextClick(rclick).build().perform();
        
        driver.findElement(By.xpath("//span[normalize-space()='Paste']")).click(); 
        
        Alert alt = driver.switchTo().alert();
        
        System.out.println(alt.getText());
        
        alt.accept();
	}

}
