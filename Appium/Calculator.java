import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class ques2 {

    private AndroidDriver driver;
    @Before
    public void setUp() throws MalformedURLException {
    	File f =new File("src");
    	File fs= new File(f,"application.apk");
    	DesiredCapabilities cap= new DesiredCapabilities();
    	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_34_extension_level_7_x86_64");
    	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
    	driver=new AndroidDriver (new URL("http://127.0.0.1:4723"),cap);
   
    	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"3\"]")).click();
    	System.out.println("clicked on 3");
    	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]")).click();
    	System.out.println("clicked on +");
    	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"2\"]")).click();
    	System.out.println("clicked on 2");
    	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]")).click();
    	System.out.println("clicked on =");
    	
    }

    @Test
    public void truecase() {
    	String temp = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/result_final\"]")).getText();
    	int result=Integer.parseInt(temp);
    	assertEquals(5,result);  	
    }

    @Test
    public void falsecase() {
    	String temp = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/result_final\"]")).getText();
    	int result=Integer.parseInt(temp);
    	assertNotEquals(10,result);
    }

    @After
    public void tearDown() {
    	driver.quit();
    }
}

