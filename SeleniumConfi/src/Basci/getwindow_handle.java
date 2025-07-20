package Basci;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class getwindow_handle 
{
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amezon.in/");
		driver.manage().window().maximize();
		WebElement e1 =	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes");
		e1.sendKeys(Keys.ENTER);
		WebElement e2 = driver.findElement(By.xpath("//*[@class='a-section aok-relative s-image-tall-aspect'][1]"));
		e2.click();
		

	}

}
