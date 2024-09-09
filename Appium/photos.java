import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class photos {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
        
        cap.setCapability("deviceName", "Pixel_3a_API_34_extension_level_7_x86_64");
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("appPackage", "com.google.android.apps.photos");
        cap.setCapability("appActivity", "com.google.android.apps.photos.home.HomeActivity");
        
        URL url = URI.create("http://127.0.0.1:4723/").toURL();
        
        AndroidDriver driver = new AndroidDriver(url,cap);
        System.out.println("Application Started");
        Thread.sleep(15000);
        
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.apps.photos:id/not_now_button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.apps.photos:id/tab_library\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.view.View[@resource-id=\"com.google.android.apps.photos:id/album_cover_view\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Photo taken on May 9, 2024 1:03:07 PM\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Edit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Suggestion Enhance\"]")).click();
		System.out.println("Filter applied");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Change to crop tab\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Choose crop aspect ratio\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Crop with a square\"]")).click();
		Thread.sleep(2000);
		System.out.println("Cropped to square");
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.apps.photos:id/photos_photoeditor_fragments_editor3_save\"]")).click();
		Thread.sleep(2000);
        
        System.out.println("Done");
        driver.quit();
	}
}
