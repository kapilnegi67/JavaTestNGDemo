package demoCode;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeGroupsdemo {

	  @Test
	  public void d_test_in_BeforeGroupsdemo_class() {
		  System.out.println("In class BeforeGroupsdemo In Test D");
	  }

	  @Test(groups = "One")
	  public void a_test_in_BeforeGroupsdemo_class() {
		  System.out.println("In class BeforeGroupsdemo In Test A");
	  }

	  @Test(groups = "Two")
	  public void b_test_in_BeforeGroupsdemo_class() {
		  System.out.println("In class BeforeGroupsdemo In Test B");
	  }

	  @Test(groups = "One")
	  public void c_test_in_BeforeGroupsdemo_class() {
		  System.out.println("In class BeforeGroupsdemo In Test C");
	  }

	  @BeforeGroups("Two")
	  public void before_group_method_in_BeforeGroupsdemo_class() {
		  System.out.println("In class BeforeGroupsdemo In Before Group Method");
	  }

	  @AfterGroups("One")
	  public void after_group_method_in_BeforeGroupsdemo_class() {
		  System.out.println("In class BeforeGroupsdemo In After Group Method");
	  }
}
