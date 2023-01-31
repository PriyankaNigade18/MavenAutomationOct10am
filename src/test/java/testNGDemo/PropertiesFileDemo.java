package testNGDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileDemo {
  @Test
  public void fileRead() throws IOException
  {
	  //C:\\Users\\Ganes\\OneDrive\\Desktop\\Learning\\Nov10am\\JavaWorkspace\\MavenAutomation\\configdata.properties
	  //Setup path of file
	  File f1=new File("./"+"\\configdata.properties");
	  
	  //File read
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Properties file
	  Properties p1=new Properties();
	  p1.load(fs);
	  
	  System.out.println("Browser name is: "+p1.getProperty("bname"));
	  System.out.println("Browser version is: "+p1.getProperty("bversion"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
