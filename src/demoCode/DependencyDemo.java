package demoCode;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DependencyDemo {
  @Test
  public void login() {
	  System.out.println("Login");
	  assert false;
  }
  
  @Test(dependsOnMethods = "login")
  public void searchUser() {
	  System.out.println("Search User");
  }
}
