package Amezon_test;

import org.testng.annotations.Test;

import Amezon_source.Homepage;

//searching the project
public class TC2 extends LaunchQuit {

	@Test
	public void search_the_product()
	   {
		Homepage h1 = new Homepage(driver);
		h1.search_it();
	   }
}
