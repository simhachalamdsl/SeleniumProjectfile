package TestNGDay3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Group_login_Condition {


	    WebDriver driver;
	    WebDriverWait wait;

	    @BeforeClass
	    void setup() {

	        driver = new ChromeDriver();

	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().window().maximize();

	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        Group_Login lp = new Group_Login();
	        lp.login("Admin", "admin123");
	    }

	    @Test
	    void verifyDashboard() {

	        boolean status = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("//h6[text()='Dashboard']")
	                )
	        ).isDisplayed();

	        Assert.assertTrue(status);
	    }
	}
