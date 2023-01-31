package waitFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args)
	{
		/*Explicit Wait:
		 * 
		 * WebDriverWait(c) extends FluentWait(c) implements Wait(I)
		 */

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

		
		//Locator
		By sbtn=By.xpath("//button[text()='Start']");
		By text=By.xpath("//h4[text()='Hello World!']");
		
		driver.findElement(sbtn).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		
		String text1=wait.until(ExpectedConditions.visibilityOfElementLocated(text)).getText();
		System.out.println(text1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
