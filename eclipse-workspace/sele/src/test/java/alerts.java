import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class alerts {
	
	//private static Alert ;

	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		 
		Alert alert = driver.switchTo().alert();
		String textOnAlert = alert.getText();
		alert.accept();
		
			//alert.dismiss();
	}

}
