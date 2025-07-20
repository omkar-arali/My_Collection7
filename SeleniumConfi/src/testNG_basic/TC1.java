package testNG_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC1 {
	@Test
	public void login()
	{
			EdgeDriver driver = new EdgeDriver();
		
		
			
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		
			WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
			username.sendKeys("arali@gmail.com");
			
			WebElement passname = driver.findElement(By.xpath("//input[@name='pass']"));
			passname.sendKeys("@gmail.com");
			
			WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
			login.click();
			
		
	}

}
