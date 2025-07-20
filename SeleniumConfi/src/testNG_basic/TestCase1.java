package testNG_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	static void login() {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		//WebElement gmail = driver.findElement(By.partialLinkText("Gma"));
	
		gmail.click();
	}

}
