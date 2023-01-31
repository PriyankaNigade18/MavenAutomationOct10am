package waitFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Utility;

public class ExplicitWaitDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

		
		//Locator
		By sbtn=By.xpath("//button[text()='Start']");
		By text=By.xpath("//h4[text()='Hello World!']");
		
		
		driver.findElement(sbtn).click();
		String actText=Utility.visibilityOfElement(driver, text).getText();
		//String actText=driver.findElement(text).getText();
		System.out.println(actText);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
