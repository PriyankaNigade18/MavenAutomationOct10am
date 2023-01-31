package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.Utility;

public class DropdownDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//identify drop down
		WebElement ele1=driver.findElement(By.name("url"));
		Utility.selectBasedDropdown(ele1,"Baby");
		
			
		
		/*
		//select is class
		Select ddele=new Select(ele1);
		
		System.out.println("Is dropdown support multiple selection?: "+ddele.isMultiple());
		/*
		//single selection
		ddele.selectByIndex(4);
		Thread.sleep(2000);
		
		ddele.selectByValue("search-alias=electronics");
		Thread.sleep(2000);
		
		ddele.selectByVisibleText("Gift Cards");
		*/
		/*
		//To get All options
		
		List<WebElement> allOptions=ddele.getOptions();
		System.out.println("Total number of Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Software"))
			{
				System.out.println("Match found.....Test Pass!");
				i.click();
				break;
			}
		}
		
		
		*/
		
		
		
		
		
		
		
		
		

	}

}
