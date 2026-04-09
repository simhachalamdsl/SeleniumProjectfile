package SeleniumDay11;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class Testing{

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://fd-calculator.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String Filepath = System.getProperty("user.dir") + "\\Files\\FDValues.xlsx";
        int rows = DataDriven_UtilityFile.getRowCount(Filepath, "Sheet1");

        for (int i = 1; i <= rows; i++) {

            // ✅ Read Data from Excel
            String Amount = DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 0);
            String Interest = DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 1);
            String FDPeriod1 = DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 2);
            String FDPeriod2 = DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 3);
            String CFrequency = DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 4);
            String MatureAmount = DataDriven_UtilityFile.getCellData(Filepath, "Sheet1", i, 5);

            // ✅ Wait for page ready
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fd-amount")));

            // ✅ Clear fields before entering data
            driver.findElement(By.id("fd-amount")).clear();
            driver.findElement(By.id("interest-rate")).clear();
            driver.findElement(By.id("fd-period")).clear();

            // ✅ Enter values
            driver.findElement(By.id("fd-amount")).sendKeys(Amount);
            driver.findElement(By.id("interest-rate")).sendKeys(Interest);
            driver.findElement(By.id("fd-period")).sendKeys(FDPeriod1);

            // ✅ Dropdown selections
            Select fdbutton = new Select(driver.findElement(By.id("fd-period-type")));
            fdbutton.selectByVisibleText(FDPeriod2);

            Select combutton = new Select(driver.findElement(By.id("compounding-frequency")));
            combutton.selectByVisibleText(CFrequency);

            // ✅ Click Calculate
            driver.findElement(By.id("calculate-btn")).click();

            // ✅ Get Actual Value
            WebElement actValue = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//div[@id='result']//strong[text()='Maturity Amount:']/../b")
                    )
            );

            String actv = actValue.getText();

            // ✅ Remove currency symbols
            actv = actv.replaceAll("[^0-9.]", "");

            double expected = Double.parseDouble(MatureAmount);
            double actual = Double.parseDouble(actv);

            // ✅ Validation (with tolerance)
            if (Math.abs(expected - actual) < 0.01) {
                System.out.println("Row " + i + " : Test Passed");

                DataDriven_UtilityFile.setCellData(Filepath, "Sheet1", i, 7, "Passed");
                DataDriven_UtilityFile.fillGreenColor(Filepath, "Sheet1", i, 7);
            } else {
                System.out.println("Row " + i + " : Test Failed");

                DataDriven_UtilityFile.setCellData(Filepath, "Sheet1", i, 7, "Failed");
                DataDriven_UtilityFile.fillRedColor(Filepath, "Sheet1", i, 7);
            }

            // ✅ Refresh for next iteration
            driver.navigate().refresh();

            // ✅ Wait after refresh
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fd-amount")));
        }

        // driver.quit(); // optional
    }
}