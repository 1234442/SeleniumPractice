import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class iframe {
	
	public static void main (String[]args)
	
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
	
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		
			
			
	}
	
	

}
