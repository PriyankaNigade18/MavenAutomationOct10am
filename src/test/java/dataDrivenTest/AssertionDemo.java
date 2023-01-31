package dataDrivenTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo 
{
  @Test
  public void hardAssertion()
  {
	  String act="Selenium WebDriver is webui automation library.";
	  String exp="Selenium WebDriver is webui tool";
	  
	  //Assert.assertEquals(act, exp);//java.lang.AssertionError
	  
	 // Assert.assertTrue(act.contains(exp));
	  
	  Assert.assertFalse(act.contains(exp));
	  
	  System.out.println("Hard assert demo is completed!");
	  
	 	  
  }
  
  
  @Test
  public void softAssertion()
  {
	  SoftAssert sf=new SoftAssert();
	 
	  String act="Selenium WebDriver is webui automation library.";
	  String exp="Selenium WebDriver is webui automation tool ";
	  //sf.assertEquals(act, exp);
	 
	 // sf.assertTrue(act.contains(exp));
	  
	  sf.assertFalse(act.contains(exp));
	  System.out.println("Soft Assert Demo completed!");
	  
	  sf.assertAll();
  }
  
  
  
  
  
  
}
