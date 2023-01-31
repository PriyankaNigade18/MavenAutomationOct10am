package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit-id")).click();
		
		System.out.println("************Number of Rows**********");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table//tbody//tr"));
		System.out.println("Total Rows are : "+rows.size());
		
		
		System.out.println("************Number of Columns**********");
		List<WebElement> cells=driver.findElements(By.xpath("//table//tbody//tr[1]//td"));
		System.out.println("Total coulmns are: "+cells.size());
		
		
		System.out.println("************Print single row data**********");
		List<WebElement> list=driver.findElements(By.xpath("//table//tbody//tr[5]"));
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		
		System.out.println("************Print single all firstname data**********");
		
		List<WebElement> list1=driver.findElements(By.xpath("//table//tbody//tr//td[2]"));
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		
		System.out.println("************Print all data**********");
		List<WebElement> list2=driver.findElements(By.xpath("//table//tbody//tr//td"));
		
		for(WebElement i:list2)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
