package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	
	public static void cpature(WebDriver driver)
	{ 
		//TakesScreenshot ts=(TakesScreenshot) driver;
	  //File temp=ts.getScreenshotAs(OutputType.FILE);
	  //File dest=new File("./"+"\\screenshot\\Pic"+System.currentTimeMillis()+".png");
	  try {
		FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./"+"\\screenshot\\Pic"+System.currentTimeMillis()+".png") );
	} catch (WebDriverException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	
	
	
	
	
	public static Properties propertiesFile()
	{
		  Properties p1=new Properties();

		File f1=new File("./"+"\\configdata.properties");
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			p1.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return p1; 
		  
	}
	
	
	
	
	
	
	//Explicit Wait
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
	
	
	
	
	
	
	
	
	
	
	
	//select dropdown
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		System.out.println("Is dropdown support multiple selection: "+dd.isMultiple());
		
		//All options
		List<WebElement> allOptions=dd.getOptions();
		System.out.println("Total Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}

	
	
	
	
	
	//javascript
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}


}
