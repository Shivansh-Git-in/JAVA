package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
	WebDriver driver = new ChromeDriver();
	@Before
	public void setUp() throws Exception {
		driver.get("");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.xpath(""));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		
		//using click action method
		action.moveToElement(element).click();

		//Double click on element
		action.doubleClick(element).perform();
		
		//Perform drag and drop
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));	 
		action.dragAndDrop(from, to).perform();
		
		/*
		Methods for performing Keyboard Events:
		keyDown(modifier key): Performs a modifier key press.
		sendKeys(keys to send ): Sends keys to the active web element.
		keyUp(modifier key): Performs a modifier key release.
		
		Different Methods for performing Mouse Events:
		click(): Clicks at the current mouse location.
		doubleClick(): Performs a double-click at the current mouse location.
		contextClick() : Performs a context-click at middle of the given element.
		clickAndHold(): Clicks (without releasing) in the middle of the given element.
		dragAndDrop(source, target): Click-and-hold at the location of the source element, moves to the location of the target element
		dragAndDropBy(source, xOffset, yOffset):  Click-and-hold at the location of the source element, moves by a given offset
		moveByOffset(x-offset, y-offset): Moves the mouse from its current position (or 0,0) by the given offset
		moveToElement(toElement): Moves the mouse to the middle of the element
		release(): Releases the depressed left mouse button at the current mouse location
		*/
		
	}
}
