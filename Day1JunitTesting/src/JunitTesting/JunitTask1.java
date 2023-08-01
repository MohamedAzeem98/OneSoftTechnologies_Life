package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class JunitTask1 {

	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("In the BeforeClass method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("In the AfterClass method ");
	}
	
	@Before
	
	public static void beforeMethod() {
		System.out.println("In the before method ");
	}
	@After
	
	public static void afterMethod() {
		System.out.println("In the after method ");
	}
	
	@Test
	public static void testCase1() {
		System.out.println("In the test case1");
	}
	@Test
	public static void testCase2() {
		System.out.println("In the test Case2");
	}
	
	@Ignore
	@Test
	
	public static void testCase3() {
		System.out.println("In the test Case3");
	}
	

}
