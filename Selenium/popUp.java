package selenium;

import java.util.Iterator;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class popUp {
	ChromeDriver driver=new ChromeDriver(); 
	@Before
	public void setUp() throws Exception {
		driver.get("https://demo.guru99.com/popup.php");
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void test() throws InterruptedException {
		/*
		Driver.getWindowHandles();
		To handle all opened windows by web driver, we can use “Driver.getWindowHandles()” and 
		then we can switch window from one window to another in a web application. Its return type is Iterator<String>.

		Driver.getWindowHandle();
		When the site opens, we need to handle the main window by driver.getWindowHandle(). 
		This will handle the current window that uniquely identifies it within this driver instance. Its return type is String.
		*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String MainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();		
	    Iterator<String> i1=s1.iterator();		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();				
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    			                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                    driver.findElement(By.name("emailid"))
	                    .sendKeys("gaurav.3n@gmail.com");                			
	                    driver.findElement(By.name("btnLogin")).click();			         
				// Closing the Child Window.
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	        driver.switchTo().window(MainWindow);			
	}
}
