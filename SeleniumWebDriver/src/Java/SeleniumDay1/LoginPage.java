package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {

    public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Enter Username
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
                .sendKeys("Admin");

        // Enter Password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // ✅ Validation - Dashboard visible
        boolean isDashboardVisible = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h6[text()='Dashboard']")
                )
        ).isDisplayed();

        if (isDashboardVisible) {
            System.out.println("✅ Login Successful");
        } else {
            System.out.println("❌ Login Failed");
        }

        //driver.quit();
    }


}