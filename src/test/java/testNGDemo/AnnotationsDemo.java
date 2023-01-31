package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo 
{
  @Test
  public void testcase1() 
  {
	  System.out.println("This is test case 1");
	  
  }
  
  @Test
  public void testcase2() 
  {
	  System.out.println("This is test case 2");
	  
  }
  
  @Test
  public void testcase3() 
  {
	  System.out.println("This is test case 3");
	  
  }
  
  //Annotations(Rule)
  
  @BeforeMethod
  public void bMethod()
  {
	  System.out.println("Before method will execute before every test case");
  }
  
  @BeforeClass
  public void bClass()
  {
	  System.out.println("BeforeClass  will run before only first test case!");
  }
  
  
  @BeforeTest
  public void bTest()
  {
	  System.out.println("Before test will run before class");
  }
  @BeforeSuite
  public void bSuite()
  {
	  System.out.println("Before suite will run Before test");
  }
  
  //postconditions
  @AfterMethod
  public void aMethod()
  {
	  System.out.println("AfterMethod will run after every test case");
  }
  
  @AfterClass
  public void aClass()
  {
	  System.out.println("After class will run after last test case!");
  }
  
  
  @AfterTest
  public void aTest()
  {
	  System.out.println("Aftertest will run After class");
  }
  
  @AfterSuite
  public void aSuite()
  {
	  System.out.println("After suite will run after test");
  }
  
}
