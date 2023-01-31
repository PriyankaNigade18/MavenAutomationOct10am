package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusAutomation {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		/*
		driver.findElement(By.id("src")).sendKeys("pune");
		Thread.sleep(2000);
		
		List<WebElement> fromlist=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']//li"));
		
		System.out.println("Total Options: "+fromlist.size());
		
		//StaleElementReferenceException: stale element reference: element is not attached to the page document
		for(WebElement i:fromlist)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Kharadi, Pune"))
			{
				i.click();
				break;
			}
		}
		
		
		//To dropdown
		driver.findElement(By.id("dest")).sendKeys("Delhi",Keys.ENTER);
		*/
		//calendar
		
		driver.findElement(By.id("onward_cal")).click();
		
		//Expectation
		String date="6";
		String month="Apr";
		String year="2023";
		
		
		//Month Selection
		while(true)
		{
		String text=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		System.out.println(text);//Jan 2023
		
		String cmon= text.split(" ")[0];
		String cyer=text.split(" ")[1];
		
		if(cmon.equals(month) && cyer.equals(year))
		{
			break;
		}else
		{
			driver.findElement(By.xpath("//button[text()='>']")).click();
		}
		}
		
		//Date Selection
		
		List<WebElement> list=driver.findElements(By.xpath("//table//tbody//tr//td"));
		
		
		for(WebElement i:list)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
//		String  arr[]=text.split(" ");
//		for(String i:arr)
//		{
//
//			System.out.println(i);
//		
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
