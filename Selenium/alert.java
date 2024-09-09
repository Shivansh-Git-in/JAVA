package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	ChromeDriver driver =new ChromeDriver();
	@Before
	public void setUp() throws Exception {
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		/* To click on the ‘Cancel’ button of the alert == driver.switchTo().alert().dismiss();
         * To click on the ‘OK’ button of the alert     == driver.switchTo().alert().accept();
         * To capture the alert message                 == driver.switchTo().alert().getText();
         * To send some data to alert box               == driver.switchTo().alert().sendKeys("Text");
         */
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).click();
		// Switching to Alert        
        Alert alert = driver.switchTo().alert();
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
        
	}

}
