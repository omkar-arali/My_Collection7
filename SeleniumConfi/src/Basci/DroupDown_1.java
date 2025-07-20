package Basci;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroupDown_1 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.id("searchDropdownBox")); 
		for (int i=1;i<=12;i++)
		{
			Thread.sleep(1000);
			e1.sendKeys(Keys.ARROW_DOWN);
		}
		WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys("power");
		e2.sendKeys(Keys.ENTER);

	}

}
