package testNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodDemo
{
  @Test(priority=1)
  public void registerProcess()
  {
	  System.out.println("User will register here!");
	  AssertJUnit.assertTrue(true);
  }
  
  
  @Test(priority=2,dependsOnMethods = "registerProcess")
  public void loginProcess()
  {
	  System.out.println("User will login here!");
  }
  
  
  @Test(priority=3,dependsOnMethods = "loginProcess")
  public void LogoutProcess()
  {
	  System.out.println("User will logout here!");
  }
}
