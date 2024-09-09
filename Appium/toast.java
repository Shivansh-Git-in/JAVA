import static org.junit.Assert.assertEquals;

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


public class toast {

    private AndroidDriver driver;
    @Before
    public void setUp() throws MalformedURLException {
    	File f =new File("src");
    	File fs= new File(f,"app-release.apk");
    	DesiredCapabilities cap= new DesiredCapabilities();
    	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_34_extension_level_7_x86_64");
    	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
    	driver=new AndroidDriver (new URL("http://127.0.0.1:4723"),cap);
    	driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.example.myapplication:id/Button01\"]")).click();
    	   	
    }

    @Test
    public void validate() {
    	
    	String result = driver.findElement(By.xpath("//android.widget.Toast[@text=\"This a positioned toast message\"]")).getText();
    	assertEquals("This a positioned toast message",result);
    	
    }

    @After
    public void tearDown() {
    	
    }
}
