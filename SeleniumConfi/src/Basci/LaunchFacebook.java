package Basci;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.google.com");
	//	driver.manage().window().maximize();
	//	driver.findElement(By.name("q")).sendKeys("INDIA");
	//	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	//	//driver.findElement(By.name("btnk")).click();
		
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		/*
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("rockstar@007.com");
		WebElement password = driver.findElement(By.id("pass")); 
		password.sendKeys("omkar*&");
		WebElement login = driver.findElement(By.name("login")); 
		login.click();
		*/
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("arali@gmail.com");
		
		WebElement passname = driver.findElement(By.xpath("//input[@name='pass']"));
		passname.sendKeys("@gmail.com");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		
		  
	}
	

}
