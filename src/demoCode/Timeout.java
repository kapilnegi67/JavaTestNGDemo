package demoCode;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Timeout {
	// Expected exception allows your test method to handle that exception
  @Test(timeOut = 100, expectedExceptions = IndexOutOfBoundsException.class)
  public void f() {
	  while (true) {
		System.out.println("This is an infinite loop");
		List<Integer> myIntegers = new ArrayList<Integer>();
		myIntegers.add(1);
		myIntegers.add(2);
		myIntegers.add(3);
		myIntegers.add(4);
		
		System.out.println(myIntegers.get(4));
	}
  }
}
