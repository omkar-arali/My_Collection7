package Basci;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

}
