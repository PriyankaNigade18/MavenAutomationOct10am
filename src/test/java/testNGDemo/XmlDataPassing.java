package testNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class XmlDataPassing 
{
	@Parameters({"un","psw"})
  @Test
  public void testData(String name,String psw)
  {
	  
	  System.out.println("User name is: "+name);
	  System.out.println("User Password is: "+psw);
	  
	  
  }
}
