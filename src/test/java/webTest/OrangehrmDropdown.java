package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmDropdown {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//pim
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		driver.findElement(By.xpath("(//i[contains(@class,'oxd-select-text--arrow')])[1]")).click();
		Thread.sleep(2000);
		
		List<WebElement> list1=driver.findElements(By.xpath("//div[@role='listbox']//div[@role='option']"));		
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
