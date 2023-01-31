package waitFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo
{
	public static WebElement presenceOfElement(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	}

	public static WebElement visibilityOfElement(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
		
	}
	
	public static WebElement elementToBeClickable(WebDriver driver,By loc)
	{
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait2.until(ExpectedConditions.elementToBeClickable(loc));
		
	}
	
	public static boolean urlContains(WebDriver driver,String url)
	{
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait2.until(ExpectedConditions.urlContains(url));
	}
	
	public static boolean titleContains(WebDriver driver,String title)
	{
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait2.until(ExpectedConditions.titleContains(title));
	}
	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		
		
		//By locator
		By emailId=By.id("email-id");
		By password=By.id("password");
		By btn=By.id("submit-id");
		
		
		/*
		 * Explicit wait it is applicable to single WebElement
		 * By default interval time in selenium is 0.5s=500ms
		 * interval time=Polling time
		 */
		
		//TimeoutException: Expected condition failed: waiting for presence of element located by: By.id: email-id88888888
		//(tried for 10 second(s) with 500 milliseconds interval)
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement email=wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		
//		email.sendKeys("test@gmail.com");
		
		WebElement email=presenceOfElement(driver,emailId);
		email.sendKeys("test123@gmail.com");
		presenceOfElement(driver,password).sendKeys("test123");
		
		
		
//		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("test123");
//		
//		
//		
//		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
//		//wait2.until(ExpectedConditions.elementToBeClickable(btn)).click();
//		wait2.until(ExpectedConditions.urlContains("title"));
//		
		
		
		
		

	}

}
