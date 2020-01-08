package demoCode;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterDemo {

	  @Test
	  public void d_test_in_before_after_demo_class() {
		  System.out.println("In class BeforeAfter Demo In Test D");
	  }

	  @Test
	  public void a_test_in_before_after_demo_class() {
		  System.out.println("In class BeforeAfter Demo In Test A");
	  }

	  @Test
	  public void b_test_in_before_after_demo_class() {
		  System.out.println("In class BeforeAfter Demo In Test B");
	  }

	  @Test
	  public void c_test_in_before_after_demo_class() {
		  System.out.println("In class BeforeAfter Demo In Test C");
	  }

	  @BeforeTest
	  public void before_test_method_in_before_after_demo_class() {
		  System.out.println("In class BeforeAfter Demo before_test_method is called before first test");
	  }

	  @AfterTest
	  public void after_test_method_in_before_after_demo_class() {
		  System.out.println("In class BeforeAfter Demo after_test_method is called after last test");
	  }

	  @BeforeMethod
	  public void before_method_method_in_before_after_demo_class() {
		  System.out.println("In class BeforeAfter Demo before_method_method is called before each and every method in each and every testcase");
	  }

	  @AfterMethod
	  public void after_method_method_in_before_after_demo_class() {
		  System.out.println("In class BeforeAfter Demo after_method_method is called after each and every method in each and every testcase");
	  }

	  @BeforeSuite
	  public void before_suite_method_in_before_after_demo_class() {
		  System.out.println("In class BeforeAfter Demo before_suite_method is called at the start of a suite");
	  }

	  @AfterSuite
	  public void after_suite_method_in_before_after_demo_class() {
		  System.out.println("In class BeforeAfter Demo after_suite_method is called after a suite");
	  }
}
