package samplePackage;

import org.testng.annotations.Test;

public class NewClass {
  @Test(priority = 1,description = "hyuuu",groups = "tescgfghf")
  public void f() {
	  
	  System.out.println("inside 1********");
  }
  
  @Test(priority = 2)
  
  public void a() {
	  
	  System.out.println("inside 2********");
  }
  
  @Test(priority = 3)
  public void v() {
	  
	  System.out.println("inside 3********");
  }
}
