package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.Utility;

public class FacebookDropdownDemo
{
//	public static void selectBasedDropdown(WebElement ele,String value)
//	{
//		Select dd=new Select(ele);
//		System.out.println("Is dropdown support multiple selection: "+dd.isMultiple());
//		
//		//All options
//		List<WebElement> allOptions=dd.getOptions();
//		System.out.println("Total Options are: "+allOptions.size());
//		
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains(value))
//			{
//				i.click();
//				break;
//			}
//		}
//	}

	public static void main(String[] args) 
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com");
			
			
			driver.findElement(By.linkText("Create New Account")).click();
			
			//day
			WebElement ele1=driver.findElement(By.id("day"));
			Utility.selectBasedDropdown(ele1,"28");
			
			//month
			WebElement ele2=driver.findElement(By.id("month"));
			Utility.selectBasedDropdown(ele2,"Oct");
			
			
			//year
			WebElement ele3=driver.findElement(By.id("year"));			
			Utility.selectBasedDropdown(ele3,"2010");
			
			
			
			
			
			
			
			
//			Select daydd=new Select(ele1);
//			System.out.println("Is dropdown support multiple selection: "+daydd.isMultiple());
//			
//			//All options
//			List<WebElement> allOptions=daydd.getOptions();
//			System.out.println("Total Options are: "+allOptions.size());
//			
//			for(WebElement i:allOptions)
//			{
//				System.out.println(i.getText());
//				if(i.getText().contains("27"))
//				{
//					i.click();
//					break;
//				}
//			}
			
			
			
			
			//Select monthdd=new Select(ele2);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
