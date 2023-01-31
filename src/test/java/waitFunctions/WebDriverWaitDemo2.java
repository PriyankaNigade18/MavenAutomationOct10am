package waitFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Utility;

public class WebDriverWaitDemo2 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		boolean status =Utility.urlContains(driver,"google");
		System.out.println("Is Url contains google?: "+status);
		
		boolean statusTitle=Utility.titleContains(driver,"Google");
		System.out.println("Is Title is Google?: "+statusTitle);
		
		By searchbox=By.name("q");
		
		
		Utility.presenceOfElement(driver, searchbox).sendKeys("Selenium");
		
		
		
		
		
		
		
	}

}
