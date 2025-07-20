package Amezon_test;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit {
	EdgeDriver driver;
	
	@BeforeMethod
	public void launch_browser()
	{
		driver = new EdgeDriver();
		driver.get("https://www.amezon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void quit_browser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
