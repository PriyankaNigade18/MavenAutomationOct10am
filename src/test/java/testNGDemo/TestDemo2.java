package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo2
{
  @Test(priority=1,description ="Test case1")
  public void register() 
  {
	  System.out.println("User will register here!");
  }
  
  
  @Test(priority=2,description ="Test case2")
  public void login() 
  {
	  System.out.println("User will login here!");
  }
  
  
  @Test(priority=3,invocationCount=3)
  public void searchProduct() 
  {
	  System.out.println("User will serach a product here!");
  }
  
  @Test(priority=4,enabled=false)
  public void addToCart() 
  {
	  System.out.println("User will add product to cart here!");
  }
  
  
}
