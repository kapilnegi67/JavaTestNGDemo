package demoCode;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount = 0)
  public void f() {
	  System.out.println("Hello world");
  }
}
