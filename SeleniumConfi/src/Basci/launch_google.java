package Basci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class launch_google {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		//WebElement gmail = driver.findElement(By.partialLinkText("Gma"));
	
		gmail.click();
	}

}
