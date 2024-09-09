import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class map {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
        
        cap.setCapability("deviceName", "Pixel_3a_API_34_extension_level_7_x86_64");
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("appPackage", "com.google.android.apps.maps");
        cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
        
        URL url = URI.create("http://127.0.0.1:4723/").toURL();
        
        AndroidDriver driver = new AndroidDriver(url,cap);
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Search here\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.google.android.apps.maps:id/search_omnibox_edit_text\"]")).sendKeys("Lovely Professional University");
        driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"com.google.android.apps.maps:id/home_bottom_sheet_container\"]")).click();
	}
}
