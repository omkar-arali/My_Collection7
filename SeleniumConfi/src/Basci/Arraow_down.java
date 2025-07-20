package Basci;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Arraow_down {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement 	e1 = driver.findElement(By.name("q"));
		e1.sendKeys("india");
		for(int i=0 ; i<=3; i++)
		{
			e1.sendKeys(Keys.ARROW_DOWN);
		}
		e1.sendKeys(Keys.ENTER);
		
	}

}
