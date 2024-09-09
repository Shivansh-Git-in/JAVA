package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkLogo {
	@Test
	public void main() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/search?q=icc&sca_esv=562421344&sxsrf=AB5stBj7cSXYK9Fk4NF0fCejteS6R8Su_w%3A1693795718391&source=hp&ei=hkX1ZNbGFeuJ4-EPluW5uAI&iflsig=AD69kcEAAAAAZPVTlmAJSclIJYmh1gTs-KujUGyiu9rO&oq=&gs_lp=Egdnd3Mtd2l6IgAqAggAMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnSNsrUJ0GWKMgcAV4AJABAJgBxAGgAeEFqgEDMC40uAEByAEA-AEBqAIKwgIHECMYigUYJ8ICBBAjGCfCAgsQABiABBixAxiDAcICCxAuGIAEGLEDGIMBwgILEAAYigUYsQMYgwHCAgsQLhiKBRixAxiDAcICCBAAGIAEGLEDwgILEC4YgwEYsQMYgATCAggQLhiABBixAw&sclient=gws-wiz");
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"logo\"]/img"));
		if(logo.isDisplayed()) {
			logo.click();
		}
		String title=driver.getTitle();
		System.out.print(title);
		if (title.equals("Google")) {							
            System.out.println("We are back at Google's homepage");					
        } else {			
            System.out.println("We are NOT in Google's homepage");					
        }		
		driver.quit();
	}
}