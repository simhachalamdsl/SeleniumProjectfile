package SeleniumDay2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TitelChecking {
	
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String act_Titel = driver.getTitle();	
		if(act_Titel.equals("OrangeHRM"))
		{System.out.println("Titel is Visuble");}
		else	
		{System.out.println("Titel is not Visuble");}
		
		  // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement loginText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h5[text()='Login']")
                )
        );

        if (loginText.isDisplayed()) {
            System.out.println("Login text is visible");
        } else {
            System.out.println("Login text not visible");
        }
		
	}

}
