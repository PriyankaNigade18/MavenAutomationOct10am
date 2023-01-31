package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboAutomation 
{
	
	public static void dropdownOptionsIteration(WebDriver driver,By locator,String value)
	{
		List<WebElement> list1=driver.findElements(locator);
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}
	
	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Calendar
		
		driver.findElement(By.xpath("(//div[contains(@class,'eSEmhF')])[3]")).click();
		
		//Expectation
				String date="26";
				String month="January";
				String year="2023";
				
				
				//Month Selection
				while(true)
				{
				String text=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
				System.out.println(text);//Jan 2023
				
				String cmon= text.split(" ")[0];
				String cyer=text.split(" ")[1];
				
				if(cmon.equals(month) && cyer.equals(year))
				{
					break;
				}else
				{
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				}
				}
				
				
				//Date Selection
				
				List<WebElement> list=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[contains(@class,'DayPicker-Day')]"));
				
				
				for(WebElement i:list)
				{
					if(i.getText().contains(date))
					{
						i.click();
						break;
					}
				}
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
		Thread.sleep(2000);
		By list=By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']");
		dropdownOptionsIteration(driver,list,"Pantnagar, India");
		
		
		*/
			
//		List<WebElement> list1=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
//		for(WebElement i:list1)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("Pantnagar, India "))
////			{
//				i.click();
//				break;
//			}
//		}
		
	}

}
