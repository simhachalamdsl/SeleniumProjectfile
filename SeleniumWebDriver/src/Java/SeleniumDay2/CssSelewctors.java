package SeleniumDay3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.logging.Level;
import java.util.logging.Logger;

public class CssSelewctors {

    public static void main(String[] args) {

        // 🔥 Suppress warnings
        System.setProperty("webdriver.chrome.silentOutput", "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        driver.manage().window().maximize();
        
         String displaystatus=driver.getTitle();
              if (displaystatus.equals("opencart"))
        {System.out.println("Titale is Founded");}
        else
        {System.out.println("title is not founded");}
         
              
        
         
    }
}