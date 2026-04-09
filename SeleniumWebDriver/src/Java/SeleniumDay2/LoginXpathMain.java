package SeleniumDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginXpathMain {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();     
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // ✅ Use LoginPage from another package
        LoginXpath LP = new LoginXpath(driver);

        LP.enterUsername("Admin");
        LP.enterPassword("admin123");
        LP.clickLogin();

        if (LP.isDashboardDisplayed()) {
            System.out.println("✅ Login Successful");
        } else {
            System.out.println("❌ Login Failed");
        }

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

     // Type Admin in search
     driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Admin");

     // Wait and click Admin menu
     wait.until(ExpectedConditions.elementToBeClickable(
             By.xpath("//span[text()='Admin']")
     )).click();
        
    Boolean st= driver.findElement(By.className("oxd-topbar-header-title")).isDisplayed();
     
     if(st.equals("oxd-topbar-header-title"))
    		 {System.out.println("True");}
     else
     {System.out.println("False");}
        //driver.quit();
    }
}