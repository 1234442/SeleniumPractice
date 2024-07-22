	import java.util.List;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class googlesearch {
		
		public static void main (String[]args)
		
		{
			
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			driver.switchTo().frame("backgroundImage");
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("abc");
		
			driver.close();
		}
		
		}