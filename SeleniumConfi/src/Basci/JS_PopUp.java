package Basci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JS_PopUp {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		WebElement e1 =	driver.findElement(By.xpath("//button[.='Click ']"));
		e1.click();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		e1.click();
	}

}
