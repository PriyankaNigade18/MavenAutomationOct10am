package testNGDemo;

import org.testng.annotations.Test;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HeadLessBrowserTest {
  @Test
  public void desireProperties() 
  {
	  //Browser Properties
	  ChromeDriver driver=new ChromeDriver();
	  Capabilities cap=driver.getCapabilities();
	  System.out.println(cap.getBrowserName());
	  System.out.println(cap.getBrowserVersion());
	  System.out.println(cap.getPlatformName());
	  
	  
	  //To get All properties asMap()
	  Map<String,Object> map=cap.asMap();
	  
	  System.out.println(map);
	  /*
	   * acceptInsecureCerts=false,
	   *  browserName=chrome, 
	   *  browserVersion=109.0.5414.75, 
	   *  chrome={chromedriverVersion=109.0.5414.74 (e7c5703604daa9cc128ccf5a5d3e993513758913-refs/branch-heads/5414@{#1172}), u
	   *  userDataDir=C:\Users\Ganes\AppData\Local\Temp\scoped_dir23044_2031420336},
	   *   goog:chromeOptions={debuggerAddress=localhost:53576},
	   *    networkConnectionEnabled=false,
	   *     pageLoadStrategy=normal,
	   *      platformName=WINDOWS, proxy=Proxy(),
	   *       se:cdp=ws://localhost:53576/devtools/browser/b3f7999d-ff65-46b3-aeeb-f4493d5b1124, 
	   *       se:cdpVersion=109.0.5414.75,
	   *        setWindowRect=true, strictFileInteractability=false,
	   *         timeouts={implicit=0, pageLoad=300000, script=30000},
	   *          unhandledPromptBehavior=dismiss and notify,
	   *           webauthn:extension:credBlob=true,
	   *            webauthn:extension:largeBlob=true,
	   *             webauthn:virtualAuthenticators=true}

	   */
	  
	  
	  	  
  }
  
  
  @Test
  public void headLessTest()
  {
	  ChromeOptions op=new ChromeOptions();
	  op.setHeadless(true);
	  WebDriver driver=new ChromeDriver(op);
	  
	  System.out.println("Browser is Open");
	  driver.get("https://www.google.com");
	  System.out.println("Application is open");
	  driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
	  System.out.println("Search for Java is done");
	  System.out.println(driver.getCurrentUrl());
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
