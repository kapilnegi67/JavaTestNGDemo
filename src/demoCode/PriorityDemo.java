package demoCode;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PriorityDemo {
	@Test(priority = 18)
	public void d_test_in_priority_demo_class() {
		System.out.println("In class PriorityDemo In Test D");
		}

	@Test(priority = -5)
	public void a_test_in_priority_demo_class() {
		System.out.println("In class PriorityDemo In Test A");
	  }

	@Test(priority = 6)
	public void b_test_in_priority_demo_class() {
		System.out.println("In class PriorityDemo In Test B");
	}

	@Test(priority = 2)
	public void c_test_in_priority_demo_class() {
		System.out.println("In class PriorityDemo In Test C");
	}

	@BeforeSuite
	public void before_suite_method_in_priority_demo_class() {
		System.out.println("In class PriorityDemo before_suite_method is called at the start of a suite");
	}

	@AfterSuite
	public void after_suite_method_in_priority_demo_class() {
		System.out.println("In class PriorityDemo after_suite_method is called after a suite");
	}
}
