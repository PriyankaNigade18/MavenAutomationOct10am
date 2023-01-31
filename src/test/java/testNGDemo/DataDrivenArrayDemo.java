package testNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataDrivenTest.CustomData;

public class DataDrivenArrayDemo
{
	
	//TestData
//	@DataProvider(name="MyData")
//	public Object[][] testData()
//	{
//		Object[][] arr={{"Admin","admin123"},{"Pooja","test123"},{"Sumeet","test123"}};
//		return arr;
//	}
	
	
	
	
  @Test(dataProvider="MyData",dataProviderClass = CustomData.class)
  public void loginTest(String un,String psw) 
  {
	  System.out.println("User name is: "+un);
	  System.out.println("Password is: "+psw);
	  
  }
}
