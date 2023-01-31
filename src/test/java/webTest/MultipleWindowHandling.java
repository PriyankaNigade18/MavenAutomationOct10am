package webTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//parent
		
		String parentId=driver.getWindowHandle();
		
		System.out.println(parentId);
			
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		//child
		
		Set<String> allWindowsId=driver.getWindowHandles();
		System.out.println(allWindowsId);
		
		for(String childId:allWindowsId)//[101,201]
		{
			if(!parentId.equals(childId))
			{//child window
				driver.switchTo().window(childId);
				driver.findElement(By.name("Email")).sendKeys("test@gmail.com");
				//driver.close();//close current open/active window
				//driver.quit();//Close all open windows by selenium
			}
		}
		
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		

	}

}
