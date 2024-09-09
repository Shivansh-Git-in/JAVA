package selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkLink {
	static WebDriver driver; 
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@BeforeClass
	public static void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}
	
	@Test
	public  void test() {
		driver.findElement(By.linkText("Watch the Videos")).click();
		System.out.println("Link Text is working");
		
		driver.findElement(By.partialLinkText("Watch")).click();
		System.out.println("Partial Link Text is working");
	}
}