import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Phone {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
DesiredCapabilities cap = new DesiredCapabilities();
        
        cap.setCapability("deviceName", "Pixel_3a_API_34_extension_level_7_x86_64");
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("appPackage", "com.google.android.dialer");
        cap.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
        
        URL url = URI.create("http://127.0.0.1:4723/").toURL();
        
        AndroidDriver driver = new AndroidDriver(url,cap);
        System.out.println("Application Started");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.dialer:id/navigation_bar_item_icon_view\"])[2]")).click();
        System.out.println("Recent opened");
        Thread.sleep(2000);
        
        
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"key pad\"]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"8,TUV\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"1,\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"1,\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"2,ABC\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"3,DEF\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"0\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"1,\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"0\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"2,ABC\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"8,TUV\"]")).click();
        Thread.sleep(1000);
        
        
        
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"dial\"]")).click();
        System.out.println("Number dialed");
        
        Thread.sleep(8000);
        
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
        
        
        
        
        
        
	}
}

