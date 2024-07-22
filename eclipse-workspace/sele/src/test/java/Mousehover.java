import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager; // Import WebDriverManager

public class Mousehover {
    public static WebDriver driver;
    
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
    	
    	// WebDriverManager automatically downloads the appropriate driver binary 
    	// for your operating system and browser version
       
    	
    	WebDriverManager.chromedriver().setup();
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
        
        // create object of action class
        Actions act = new Actions(driver);
        
        WebElement ele = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        
        // Perform mouse hover
        act.moveToElement(ele).perform();
        
        
        List<WebElement> links= driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
        
        int total_count= links.size();
        
        for (int i =0; i<total_count; i++);
        
        {
        	int i = 0;
			WebElement element = links.get(i);
			
			String text = element.getAttribute("innerHTML");
			System.out.println("Links name is " + text);
			
			if (text.equals("Appium"))
			{
				
				element.click();
				
			}
				
		}
        
        // Quit the driver
      driver.quit();
    }
}
	