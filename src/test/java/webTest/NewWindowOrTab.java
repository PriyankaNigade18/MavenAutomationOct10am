package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowOrTab {

	public static void main(String[] args)
	{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			
			WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
			newTab.get("https://www.amazon.in");
			newTab.findElement(By.xpath("//a[text()='Best Sellers']")).click();
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.facebook.com");
			
			
			//open facebook in 10 different tabs
			for(int i=1;i<=10;i++)
			{
			WebDriver newTab1=driver.switchTo().newWindow(WindowType.TAB);
			newTab1.get("https://www.facebook.com");
			}
			
			
			
			
			
	}

}
