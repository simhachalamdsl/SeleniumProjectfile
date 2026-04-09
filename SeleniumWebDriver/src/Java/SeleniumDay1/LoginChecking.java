package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginChecking {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for User name field
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username"))
        );

        // Enter User name
        username.sendKeys("Admin");

        // Enter Password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Click Login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // 🔥 Validation after login (Dash board check)
        WebElement dashboard = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h6[text()='Dashboard']")
                )
        );

        if (dashboard.isDisplayed()) {
            System.out.println("✅ Login Successful");
        } else {
            System.out.println("❌ Login Failed");
        }

        
    }
}