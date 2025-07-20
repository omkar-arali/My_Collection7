package Basci;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search =	driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		Thread.sleep(2000);
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = autosuggestion.size();
		autosuggestion.get(count - 5).click();
		System.out.println(count);
		

	}

}
