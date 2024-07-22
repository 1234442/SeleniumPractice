
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String parentHandle =  driver.getWindowHandle();
		System.out.println("parent window - " + parentHandle);
		
		driver.findElement(By.xpath("//button[@class=\"whButtons\"][1]")).click();
		Set<String> Handles= driver.getWindowHandles();
		
		for (String handle : Handles)
		{
			System.out.println(handle);
			
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				
				driver.findElement(By.id("firstName")).sendKeys("Test");
				Thread.sleep(5000);
				
				driver.close();
			}
			driver.switchTo().window(parentHandle);

		//	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abc");
		}
			
	driver.quit();
		
	}
}
