package Basci;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class autosuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search =	driver.findElement(By.name("q"));
		search.sendKeys("india");
		Thread.sleep(2000);
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='sugg_drawer ']/ul/li"));
		int count = autosuggestion.size();
		//System.out.println(count);
		autosuggestion.get(4).click();
		System.out.println(count);

	}

}
